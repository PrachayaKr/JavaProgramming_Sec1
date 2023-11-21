import javax.swing.*;

public class Example3 {

	public static void main(String[] args) {
		//DecimalFormat frm =new DecimalFormat("#,###.00");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height"));
        //convert height from cm to m
        height=height/100;
        double bmi;
        bmi = weight / (height*height);
        String bmiCategory;
        //JOptionPane.showMessageDialog(null, "BMI= "+bmi);
       
        if(bmi<18.5) bmiCategory ="Underweight";
        else if (bmi<25) bmiCategory ="Normal-weight";
        else if(bmi<30) bmiCategory ="Overweight";
        else bmiCategory ="Obesityt";
        JOptionPane.showMessageDialog(null, "BMI= "+String.format("%.1f",bmi)+"\nYou're "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
	}

}
