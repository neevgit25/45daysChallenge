import java.util.LinkedList;

public class NearestCell {
   
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        
        int vis[][]=new int[n][m];
        int dis[][]=new int[n][m];
        
        Queue<Node> q=new LinkedList<Node>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    vis[i][j]=1;
                    q.add(new Node(i,j,0));
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        
        int drow[]={-1,0,+1,0};
        int dcol[]={0,+1,0,-1};
        
       while(!q.isEmpty())
       {
           int row=q.peek().first;
           int col=q.peek().second;
           int step=q.peek().third;
           q.remove();
           
           dis[row][col]=step;
           
           for(int i=0;i<4;i++)
           {
              int nrow=row+drow[i];
              int ncol=col+dcol[i];
               
               if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
                   q.add(new Node(nrow,ncol,step+1));
                   vis[nrow][ncol]=1;
               }
           }
       }
       return dis;
        
    }

class Node{
    int first;
    int second;
    int third;
    public Node(int first,int second,int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
}
