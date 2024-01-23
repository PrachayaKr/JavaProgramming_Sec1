
public class Person {
    
	private String firstName;
	private String lastName;
	
	//Constructor
	Person(){
		firstName="";
		lastName="";
	}
	Person(String first,String last){
		/*firstName=first;
		lastName=last;*/
		setName(first,last);
	}
	//Start Set and Get
	public void setName(String first,String last) {
		firstName=first;
		lastName=last;
	}
	public String getFritName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return firstName+" "+lastName;
	}
}
