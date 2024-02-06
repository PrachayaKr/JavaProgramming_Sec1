import java.util.Scanner;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException{
		//Scanner read = new Scanner(new File("d://txtFile//List107.txt"));
		Scanner scan  = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = scan.nextInt();
		Header(section);
		showListStudent(section);
	}
	
	public static void showListStudent(int sectionInput)throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp="";
		while((tmp=read.readLine())!=null) {
			String[] data = tmp.split("\t");
			double midTem = Double.parseDouble(data[4]);
			double finalTem = Double.parseDouble(data[5]);
			int secFile = Integer.parseInt(data[3]);
			if(secFile == sectionInput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midTem+"\t"+finalTem+"\t"+findResult(midTem,finalTem));
			}
			
		}
		read.close();
	}
	public static String findResult(double midtemscore,double finalscore) {
		double totalScore = midtemscore+finalscore;
		if(totalScore<= 40) {
			return "Fail";
		}else {
			return "Pass";		}
		
	}
	public static void Header(int sec) {
		System.out.println("***********************************************************");
		System.out.println("\t\tList of Data for Section "+sec);
		System.out.println("***********************************************************");
	}

}
