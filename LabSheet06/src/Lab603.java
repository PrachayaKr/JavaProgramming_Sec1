import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		String firstName;
		Scanner input = new Scanner(System.in);
        System.out.print("please enter your name, separated by a space.\n:");
        String fullname = input.next(); 
        firstName=fullname.substring(0,fullname.indexOf(" "));
        System.out.println(abbreviatName(fullname));
	}
	
	public static String abbreviaName(String fullname) {
		for(int i = 0;i<=fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
			    String spaceNameFirst = fullname.substring(0,fullname.indexOf(' '));
			    String spaceNameMid = fullname.substring(fullname.indexOf(' ')+1, fullname.indexOf(' ')+2);
			    String spaceNameLast = fullname.substring(fullname.lastIndexOf(' ')+1 ,fullname.lastIndexOf(' ')+2);
			    return spaceNameMid+"."+spaceNameLast+"."+spaceNameFirst+"."; 
			}
		}
		 
	}

}
