package LeetCodeEasyPrograms;

import java.util.Arrays;


public class Program1 {
 
	public int[] twoSum(int[] nums, int target) {
		int l=nums.length-1;//3
		for (int i = 0; i <l; i++) {
	      for(int j=i+1;j<=l;j++) {//
			if (nums[i] + nums[j] == target) {
				return new int[] { i, j };
			}
	      }
		}
		return null;

	}

	public static void main(String args[]) {
		Program1 prob = new Program1();
		int[] a=prob.twoSum(new int[] { 1, 2, 3, 2 }, 4);
		
		System.out.println(Arrays.toString(a));
	}
}
