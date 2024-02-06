import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException {
		// Use bufferReader

		BufferedReader read = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
		String tmp="";
		int CountBook = 0,i =1;
		while((tmp=read.readLine()) != null) {
			String[] data = tmp.split("\t");
			System.out.println(i+"."+data[0]+" ("+ data[1]+"), Rating"+data[2]+" publish on "+ data[5]);
			CountBook++;
			i++;
		}
		System.out.println("===================================");
		System.out.println("Total book = "+ CountBook);
		read.close();
	}

}
