package STACK;

public class CircularTour {
   
    
        //Function to find starting point where the truck can start to get through
        //the complete circle without exhausting its petrol in between.
        int tour(int petrol[], int distance[])
        {
        // Your code here	
        int n=petrol.length;
        
     int fueltank=0,start=0,fuelsortage=0;
            for(int i=0;i<n;i++){
            fueltank+=petrol[i]-distance[i];
            
            if(fueltank<0)
            {
                start=i+1;
                fuelsortage+=fueltank;
                fueltank=0;
            }
            }
            if(fuelsortage+fueltank>=0)
            return start;
             
             
             return -1;
        }
    }


