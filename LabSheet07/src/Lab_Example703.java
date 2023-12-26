import java.util.*;
public class Lab_Example703 {

	public static void main(String[] args) {
		int[] number = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<number.length;i++) {
        	System.out.print("Input number "+(i+1)+":");
        	number[i]=input.nextInt();
        }
        int totalNumber = sumOfPos(number);
        System.out.print("Summation of positive number is "+totalNumber);
	}
	public static int sumOfPos(int[] nums) {
		int sum=0;
		for(int _nums:nums) {
			if(_nums>0) {
				sum+=_nums;
			}
		}
		return sum;
	}

}
