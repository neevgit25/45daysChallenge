public class MaxProduct {
  
        public int maximumProduct(int[] nums) {
            int pro=1;
          int  maxpro=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++)
            {  
                pro*=nums[i];
               // maxpro=Math.max(maxpro,pro);
            }
            return pro;
        }
    }
    