import java.util.Scanner;
import java.io.*;

public class Lab1201 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("d://txtFile//MemberLogin.txt"));
      while(scan.hasNext()) {
		String fName = scan.next();
		String lname = scan.next().substring(0,1).toUpperCase();
		scan.next();
		String email = scan.next().toUpperCase();
		
		System.out.println(lname+"."+fName+" ("+email+")");
		
	}
	}

}