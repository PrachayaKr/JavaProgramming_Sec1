import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence;
		System.out.print("input a sentence: ");
		sentence = input.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("input a sentence,agian: ");
			sentence = input.nextLine();
		}
        System.out.println();
        
        int space = 0;
        
        for(int i = 0;i<sentence.length();i++) {
        	if(sentence.charAt(i)==' ') {
        		space++;
        	}
        	
        }
        System.out.println("This sentence has"+ space +"spacebar.");
        System.out.println("This sentence has"+ (space+1) +"word.");
	}

}
