import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Input your email:");
		
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your email again:");
		}
		email = email.toLowerCase();
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")){
			JOptionPane.showMessageDialog(null, "Your email is "+email);
		}else {
			JOptionPane.showMessageDialog(null, "Your email is not hotmail or gmail.com");
		}

	}

}
