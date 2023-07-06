public class WordSearch {
    public boolean search(char[][] arr, String word,int i,int j,int n,int m,int k)
    {
        if(k>=word.length()) return true;
        if(i<0 || i>=n || j<0 || j>=m || arr[i][j]=='.' || word.charAt(k)!=arr[i][j]) return false;
        if(word.length()==1 && word.charAt(k)==arr[i][j])return true;
        arr[i][j]='.';
        boolean temp=false;
        int x[]={0,0,-1,1};
        int y[]={-1,1,0,0};
        for(int ii=0;ii<4;ii++)
        {
            temp=temp || search(arr,word,i+x[ii],j+y[ii],n,m,k+1);
        }
        arr[i][j]=word.charAt(k);
        return temp;
    }
    public boolean exist(char[][] arr, String word) {
      int n=arr.length;
      if(n==0)
      return false;
      if(word.length()==0)
      return false;
      int m=arr[0].length;

      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
               if(word.charAt(0)==arr[i][j])
                 {
                     if(search(arr,word,i,j,n,m,0))
                     return true;
                 }
          }
      }
      return false;
    }
} 