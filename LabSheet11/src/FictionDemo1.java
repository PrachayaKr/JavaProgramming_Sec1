import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Input book title : ");
		String title = scan.next();
		System.out.print("Input book public year : ");
		int pubYear = scan.nextInt();
		
		FictionBook book =new FictionBook(title,pubYear);
		
		System.out.print("Input author name : ");
		String name = scan.next();
		System.out.print("Input author email : ");
		String email = scan.next();
		
		book.setAuthorName(name);
		book.setEmail(email);
		
		while(!book.checkFormatName()) {
			System.out.print("Input author name : ");
			name = scan.next();
			book.setAuthorName(name);
		}
		while(!book.checkEmail()) {
			System.out.print("Input email name : ");
			email = scan.next();
			book.setEmail(email);
		}
		System.out.println(book);
	}
	

	
	}


