public class Pair
{
    int first,second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    // Function to find the number of islands.
    public void bfs(int ro,int cl,int vis[][],char grid[][])
    {
        vis[ro][cl]=1;
        Queue<Pair>q=new LinkedList<Pair>();
        q.add(new Pair(ro,cl));
          int n=grid.length;
          int m=grid[0].length;
          while(!q.isEmpty())
          {
              int r=q.peek().first;
              int c=q.peek().second;
              q.remove();
              for(int delrow=-1;delrow<=1;delrow++)
                {
                    for(int delcol=-1;delcol<=1;delcol++)
                    {
                        int nrow=r+delrow;
                        int ncol=c+delcol;
                        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1')
                        {  
                            vis[nrow][ncol]=1;
                            q.add(new Pair(nrow,ncol));
                        }
                    }
                }
          }
    }
    public int numIslands(char[][] grid) {
        // Code here
       int n=grid.length;
          int m=grid[0].length;
        int vis[][]=new int[n][m];
        
        int cnt=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++)
            {
                if(vis[row][col]==0 && grid[row][col]=='1')
                {
                    cnt++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return cnt;
    }
}
