
// JAVA Code For Chocolate Distribution
// Problem
import java.util.*;

class  chocolatedistribution{

	// arr[0..n-1] represents sizes of
	// packets. m is number of students.
	// Returns minimum difference between
	// maximum and minimum values of
	// distribution.
	static int findMinDiff(int arr[], int n, int m)
	{
		if(n==0|| m==0)
        return 0;
         Arrays.sort(arr);
        if(n<m)
        return -1;

       
        int sub=Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++)
        {
            int sub1=arr[i+m-1]-arr[i]; 
            sub=Math.min(sub,sub1);
        }
        return sub;
	}

	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int arr[] ={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};

		int m = 7; // Number of students

		int n = arr.length;
		System.out.println("Minimum difference is "
						+ findMinDiff(arr, n, m));
	}
}
// This code is contributed by Arnav Kr. Mandal.
