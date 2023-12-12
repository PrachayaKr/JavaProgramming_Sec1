import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
        if(space == -1) {
        	System.out.print("Incorect Name");
        }
        else {
        	String firstname,lastname;
        	firstname=fullname.substring(0,space);
        	lastname=fullname.substring(space,fullname.length());
        	System.out.println("First Name: "+firstname.toUpperCase());
        	System.out.print("Last Name: "+lastname.toLowerCase());
        }
	}

}
