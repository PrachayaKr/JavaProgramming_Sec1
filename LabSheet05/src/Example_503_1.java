import javax.swing.*;
public class Example_503_1 {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence:");
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again");
		}
        int space=0;
        for(int i = 0;i<sentence.length();i++) {
        	if(sentence.charAt(i)==' ') {
        		space++;
        	}
        }
        JOptionPane.showMessageDialog(null, "This sentence has "+space+ " spacebar."+
                                            "\nThis sentence has "+(space+1)+" word.");
	}

}
