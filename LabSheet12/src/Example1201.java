import java.util.Scanner;
import java.io.*;;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		//Using Scanner Class for read data from file 

		Scanner read = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(read.hasNext()) {
			//Read file
			String fname = read.next();
			String lname = read.next(); // read.next(); can use
			read.next();//read password
			String email = read.next().toUpperCase();
			System.out.println(fname+" "+"("+ email +")");
		}
		read.close();
	}

}
