public class Palindrom {
    
        public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int digit,rev=0,ori=x;
        while(x>0){
        digit=x%10;
        rev=rev*10+digit;
        x=x/10;
        }
        return rev==ori;
    }
    }

