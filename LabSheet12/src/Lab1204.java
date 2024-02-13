import java.util.*;
import java.io.*;
public final class Lab1204 {

	public static void main(String[] args) throws IOException {
		BufferedReader read =new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of book : ");
		double rating =input.nextDouble();
		System.out.println("---------------------------------------------------------------------");
		String temp = "";
		int more = 0,less = 0,sum=1;
		while((temp=read.readLine())!=null) {
			String[] data=temp.split("\t");
			double ratingFile=Double.parseDouble(data[2]);
			if(ratingFile>=rating) {
				System.out.println("Book "+sum+":"+data[0]+" write by "+data[1]+" ("+data[3]+")"+" reviews");
			}
			sum++;
			if(ratingFile>=rating) {
				more++;
			}else {
				less++;
			}
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("There are "+more+" book get rating more than "+rating);
		read.close();
		 {
			
		}
	}

}