class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        int drow[]={-1,1,0,0};
        int dcol[]={0,0,-1,1};
        
        
        int vis[][]=new int[n][m];
        
        for(int j=0;j<m;j++){
            //first row
            if(vis[0][j]==0 && a[0][j]=='O')
             dfs(0,j,vis,a,drow,dcol);
             
                 if(vis[n-1][j]==0 && a[n-1][j]=='O')
             dfs(n-1,j,vis,a,drow,dcol);
        }
        
          for(int i=0;i<n;i++){
            //first row
            if(vis[i][0]==0 && a[i][0]=='O')
             dfs(i,0,vis,a,drow,dcol);
             
                 if(vis[i][m-1]==0 && a[i][m-1]=='O')
             dfs(i,m-1,vis,a,drow,dcol);
        }
        
        for(int i=0;i<n;i++){
            for(int j= 0;j<m;j++)
            {
                if(vis[i][j]==0 && a[i][j]=='O')
                   a[i][j]='X';
            }
        }
        return a;
    }
    static void dfs(int row,int col,int[][]vis,char[][]a,int[]drow,int[] dcol){
        vis[row][col]=1;
        int n=a.length;
        int m=a[0].length;
        for(int i=0;i<4;i++)
        {
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 &&a[row][col]=='O')
              dfs(nrow,ncol,vis,a,drow,dcol);
        }
        
    }
}
