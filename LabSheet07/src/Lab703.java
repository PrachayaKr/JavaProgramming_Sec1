import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num={78, 36, 58, 41, 25, 92, 75};
		System.out.print("Input index of array : ");
		int number=input.nextInt();
		while(number!=num.length) {
			System.out.print("Input index of array, agian : ");
			number=input.nextInt();
		}
	}

}
