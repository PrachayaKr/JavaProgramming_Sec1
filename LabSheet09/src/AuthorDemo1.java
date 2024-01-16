import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		Author a1 = new Author();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name   : ");
		String name = scan.nextLine();
		
		System.out.print("Input auther email   : ");
		String email = scan.nextLine();
		
		System.out.print("Input author gender   : ");
		String gender = scan.nextLine();
		
		System.out.println();
	}

}
