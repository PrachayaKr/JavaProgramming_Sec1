import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Movie Id   : ");
		String id = scan.nextLine();
		System.out.print("Input Movie Name : ");
		String name = scan.nextLine();
		System.out.println();
		
		System.out.print("Input director name   : ");
		String directName = scan.nextLine();
		System.out.print("Input director email  : ");
		String directEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char directGender = scan.next().charAt(0);
		while(directGender!='m'&&directGender!='M'&&directGender!='f'&&directGender!='F') {
			System.out.print("Input director gender,again : ");
		    directGender = scan.next().charAt(0);
		}
		System.out.println();
		
		System.out.print("Input movie theater no. : ");
		int theaterNo = scan.nextInt();
		while(theaterNo<1 || theaterNo>15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}

		System.out.println();
		Director director = new Director(directName,directEmail,directGender);
		Theater theater = new Theater(id,name,director,theaterNo);
		System.out.println(theater);
	}

}
