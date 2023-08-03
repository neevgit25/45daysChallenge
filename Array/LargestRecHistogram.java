import java.util.Stack;

public class LargestRecHistogram {
    
   /* import java.util.*;
// Brute Force Approach to find largest rectangle area in Histogram
public class Main {
    static int largestarea(int arr[], int n) {
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, arr[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }
    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3, 1};
        int n = 7;
        System.out.println("The largest area in the histogram is " + largestarea(arr, n)); // Printing the largest rectangle area

    }
} TCo(N*N) S.C=O(1)*/
/*
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack < Integer > st = new Stack < > ();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek() + 1;
            st.push(i);
        }

        // clear the stack to be re-used
        while (!st.isEmpty()) st.pop();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) rightSmall[i] = n - 1;
            else rightSmall[i] = st.peek() - 1;

            st.push(i);
        }

        int maxA = 0;
        for (int i = 0; i < n; i++) {
            maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;

    }TC=O(N)  SC=O(3N)where 3 is for the stack, left small array and a right small array
    */
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<=n;i++)
        {
            while(!st.isEmpty() &&(i==n || heights[st.peek()]>heights[i])){
            int height=heights[st.peek()];
              st.pop();
              int width;
              if(st.isEmpty())
              width=i;
              else
              width=i-st.peek()-1;

              maxArea=Math.max(width*height, maxArea);
        }
        st.push(i);
        }
        return maxArea;
    }
//TC=O(N)+O(N)(maintaining stack is O(N) and not O(N^2)because not every element is popped out for every iteration)
//Sc O(N)
}

