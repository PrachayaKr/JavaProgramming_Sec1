import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(System.in);
		
		// create obj for write data to file use PrintWriter Class
		FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		PrintWriter writerFile = new PrintWriter(filename);
		System.out.print("Product Id: ");
		String id = input.next();
		System.out.print("Product Name: ");
		String name = input.next();
		System.out.print("Product Unit: ");
		int unit = input.nextInt();
		System.out.print("Product Unit: ");
		float price = input.nextFloat();
				 
		//INSERT all data to file(After the previous data
		writerFile.println(id+","+name+","+unit+","+price);
		System.out.print("Write File already.....");
	writerFile.close();
	}
	

}
