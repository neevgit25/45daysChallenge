public class SimplifyPath {
   
        public String simplifyPath(String path) {
       Stack<String> stack=new Stack<>();
           String []str=path.split("/");
           for(String s: str){
               //System.out.println(s);
               if(s.equals(".") || s.equals(""))continue;
               else if(s.equals("..")){if(!stack.isEmpty()) stack.pop();}
               else stack.push(s);
           }
           //System.out.println(stack);
           Collections.reverse(stack);
           StringBuilder sb=new StringBuilder();
           while(!stack.isEmpty()){
               sb.append("/");
               sb.append(stack.pop());
           }
           if(sb.length()==0) return "/";
           return sb.toString();
        }
    }

