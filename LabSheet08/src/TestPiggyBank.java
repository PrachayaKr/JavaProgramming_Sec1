import java.util.*;
public class TestPiggyBank {
    static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		inputCoin();
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
	}
    public static void inputCoin() {
    	System.out.println("Money total : "+pb.getTotal());
    	System.out.print("Please define size of PiggyBank:");
    	int sizeofPiggyBank = scan.nextInt();
    	pb.setPiggyBank(sizeofPiggyBank);
    	System.out.println("Size of your PiggyBank: "+pb.getPiggyBank());
    	MainMenu();
    }
    public static void MainMenu(){
    	    while (true) {
    		System.out.println();
        	line();
        	System.out.println("Menu of PiggyBank");
        	line();
        	System.out.println("[1] one bath."
        			       + "\n[2] two bath."
        			       + "\n[3] five bath."
        			       + "\n[4] ten bath."
        			       + "\n[5] Exit");
        	line();
        	int menu;
        	int moneyTotal;
        	System.out.print("Please select Menu [1-5] :");
        	menu = scan.nextInt();
        	if(menu==1) {
        		System.out.print("Insert 1 Bath Money: ");
        		moneyTotal = scan.nextInt();
        		pb.addOne(moneyTotal);
        		System.out.print("Money total :"+pb.getTotal());
        	}
        	else if (menu==2) {
        		System.out.print("Insert 2 Bath Money: ");
        		moneyTotal = scan.nextInt();
        		pb.addTwo(moneyTotal);
        		System.out.print("Money total :"+pb.getTotal());
        	}
        	else if(menu==3) {
        		System.out.print("Insert 5 Bath Money: ");
        		moneyTotal = scan.nextInt();
        		pb.addFive(moneyTotal);
        		System.out.print("Money total :"+pb.getTotal());
        	}
        	else if (menu==4) {
        		System.out.print("Insert 10 Bath Money: ");
        		moneyTotal = scan.nextInt();
        		pb.addTen(moneyTotal);
        		System.out.print("Money total :"+pb.getTotal());
        	}
        	else {
        		System.out.print("Bye Bye");
        		break;
        	}
        	
    	}
    	
    }
    public static void line() {
    	System.out.println("===================================");
    }
}
