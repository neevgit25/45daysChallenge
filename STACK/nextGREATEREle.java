package STACK;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGREATEREle {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     /* int arr[]=new int[nums1.length];
    

      for(int i=0;i<nums1.length;i++)
      {
        int x=nums1[i];
          int idx=-1;

          for(int j=0;j<nums2.length;j++)
          {
            if(nums2[j]==x){
            idx=j;
            break;
            }
          }

          int nge=-1;
            for(int k=idx+1;k<nums2.length;k++)
            {
               if(nums2[k]>x){
                nge=nums2[k];
                break;
               }
            }
            arr[i]=nge;
      }
      return arr;
      Finding the index of an element in nums2 for each element in nums1 takes O(n*m) time, where n is the length of nums1 and m is the length of nums2.
Finding the next greater element in nums2 for each element in nums1 takes O(n*m) time as well. 
   SC=O(N) N=NUMS1.LENGTH WHICH IS EQUAL TO ARR.LENGTH*/
    Map<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.empty() && stack.peek() < num) {  
                map.put(stack.pop(), num);
            }
            stack.push(num); // Push current element onto stack
        }
        for (int i = 0; i < nums1.length; i++) { 

            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1; 
        }
        return nums1;
    }
}
