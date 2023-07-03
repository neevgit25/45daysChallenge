public class sortcolor {
    public void sortColors(int[] nums) {
    /*    
        int largest=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++)
     {
        largest=Math.max(largest,nums[i]);
     }  
     int fre[]=new int [largest+1]; 
     //frequency array
     for(int i=0;i<nums.length;i++)
     {
         fre[nums[i]]++;
     }
     int j=0;
     //sorting
     for(int i=0;i<fre.length;i++)
     {
         while(fre[i]>0)
         {
             nums[j]=i;
             j++;
             fre[i]--;
         }
     }
     */ 
     //L ke piche sara zero h
     //H k aage saara two h
     int m=0,l=0;
     int h=nums.length-1;
      while(m<=h)
      {
          int num=nums[m];
          if(num==0)
          {
              int temp=nums[m];
              nums[m]=nums[l];
              nums[l]=temp;
              m++;
              l++;
          }
          else if(num==1)
          {
              m++;
          }
          else
           {
              int temp=nums[m];
              nums[m]=nums[h];
              nums[h]=temp;
            h--;
          }
      }
    }
} 
    

