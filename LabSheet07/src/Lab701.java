import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		int odd = 0;
		Scanner input = new Scanner(System.in);
		int[] nums = new int[7];
		for(int i =0 ; i<nums.length;i++) {
      	  System.out.print("Input number "+(i+1)+": ");
      	  nums[i]=input.nextInt();
      	if(nums[i]%2!=0) {
			odd++;
      	    }
	    }
		System.out.println("\nThere are "+odd+" of odd number.");
		System.out.print("List of odd number : ");
		
		for(int _nums:nums) {
			if(_nums%2!=0) {
				System.out.print(_nums+" ");
				}
			}
		
	}
}
