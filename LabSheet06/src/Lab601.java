import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
		/*String email;
		email = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail agian:");
		}
		boolean checkMail=checkEmail(email);
		if(checkMail==true) {
		JOptionPane.showMessageDialog(null, "Your e-mail is "+email);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail .com ");
		}*/

	}
	public static void inputEmail() {
		String email;
		email = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail agian:");
		}
		boolean checkMail=checkEmail(email);
		if(checkMail==true) {
		JOptionPane.showMessageDialog(null, "Your e-mail is "+email);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail .com ");
		}
	}
	
	public static boolean checkEmail(String email) {
		
		if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			return true;
		}
		else {
			return false;
		}
	}

}
