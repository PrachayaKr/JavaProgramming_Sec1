import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		/*double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		JOptionPane.showMessageDialog(null, obj1+"\nArea of Rectangle = "+obj1.getArea());*/
		
		//Input data using interface class
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2+"\nArea of Rectangle = "+obj2.getArea());
	}

}
