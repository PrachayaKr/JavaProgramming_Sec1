import java.util.*;
public class BookDemo {
    
	public static void main(String[] args) {
		Book b = new Book();
        Scanner scan = new Scanner(System.in);
		System.out.print("Input book title   : ");
		String Booktitle = scan.nextLine();
		b.setTitle(Booktitle);
		
		System.out.print("Input book price   : ");
		float Bookprice = scan.nextFloat();
		b.setPrice(Bookprice);
		
		System.out.print("Input publish year : ");
		int BookpubYear = scan.nextInt();
		b.setPublishyear(BookpubYear);
		
		System.out.println();
		
		System.out.println(b);
	}

}
