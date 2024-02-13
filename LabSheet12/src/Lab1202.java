import java.util.Scanner;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Input your email: ");
		String email = input.nextLine();
		boolean check = false;
		while(scan.hasNext()) {
		     scan.next();
		     scan.next();
		     String password = scan.next();
		     String emailFile = scan.next();
		     
		     if(email.equals(emailFile)) {
		    	 System.out.print("Your password is "+password);
		    	 check=true;
		     }
		     else {
		    	 check=false;
		     }
		     if(check==false) {
		    	 System.out.print("The data not found");
		    	 break;
		     }
		}

		scan.close();
	}

}