import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{

	private String name;
	private String dept;
	
	public void insert()throws IOException {
		
		Scanner input = new Scanner(System.in);
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		String answer;
		do {
			header();
			System.out.print("Enter Name: ");
			name = input.next();
			System.out.print("Enter Department: ");
			dept = input.next();
			//Save all data to file 
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data agian?: ");
			answer = input.next();
			
		}while(answer.equalsIgnoreCase("y"));
		writeFile.close();
	}
	
	public void read() {
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check= false;
			int i = 1;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(name);
					i++;
					check = true;
				}
				
			}
			System.out.print("Employee in dept "+super.getDept()+" is "+ --i+" person");
			if (check==false) {
				
				System.out.print("\nSorry,no department: "+super.getDept()+"in file.");
			}
		}catch(IOException e){
			System.out.println("Sorry File not found");
		}
	}
}
