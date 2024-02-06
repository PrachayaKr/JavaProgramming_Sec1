
public class Director {

	private String  name;
	private String email;
	private char gender;
	
	
	Director(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	//constructor 2
	Director(String name,String email){
		this.name=name;
		this.email=email;
		gender=' ';
	}
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	public String getGenderName(){
		if(gender=='m'||gender=='M') {
			return "Male";
		}
		else if (gender=='f'||gender=='F') {
			return "Female";
		}
		else {
			return "null";
		}
	}
	public String toString() {
		return name+" ("+email+";"+getGenderName()+")";
	}
}
