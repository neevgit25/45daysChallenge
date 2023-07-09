class MaximumPointsCard {
    public int maxScore(int[] arr, int k) {
        //SLIDING WINDOW CONCEPT USED
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
       int maxsum=sum;
        for(int i=k-1;i>=0;i--)
        {
            sum-=arr[i];
            sum+=arr[n-k+i];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}