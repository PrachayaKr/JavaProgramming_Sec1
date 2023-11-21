import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int withdrawMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)
		+"\nInput money to withdraw: "));
		if(withdrawMoney>balance) {
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdrawMoney>20000) {
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdrawMoney%100 !=0) {
			int errorwithDraw = withdrawMoney%100;
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw "+errorwithDraw+" bath.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			int thouson=withdrawMoney/1000;
			int fiveHundred=withdrawMoney%1000/500;
			int hundred = withdrawMoney%500/100;
			JOptionPane.showMessageDialog(null, "You withdraw "+withdrawMoney+" bath."+"\n1000 = "+thouson+"\n500 = "+fiveHundred+"\n100 = "+hundred);
		}
	}

}
