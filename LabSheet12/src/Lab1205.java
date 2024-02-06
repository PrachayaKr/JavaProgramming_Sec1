import java.util.Scanner;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args)throws IOException {
		Scanner read = new Scanner(new File("d://txtFile//student.txt"));
		Head();
		int sum = 1;
		while(read.hasNext()) {
			String idFile = read.next();
			read.next();
			String FuName = read.next().substring(0,1).toUpperCase();
			String LaName = read.next();
			double grade = read.nextDouble();
			read.next();
			System.out.println(sum+"\t"+idFile+"\t"+Level(idFile)+"\t"+FuName+"."+LaName+"\t"+grade+"\t"+status(grade));
		    sum++;
		}
		read.close();
		
	}
	public static String Level(String id) {
		if(id.startsWith("18")) {
				return "4th";
			}
			else {
				return "3th";
			}
			
		}
	
	public static String status(double grade) {
		if(grade > 2.00) {
			return "Pass";
		}
		else if (grade >=1.00||grade< 2.00 ) {
			return "Critical";
		}
		else {
		return "Retired";
		}
	}
	
	public static void Head() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("**********************************************************");
	}

}
