import java.time.Year;
public class FictionBook implements Author,Book {

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title=title;
		this.publicYear=publicYear;
	}
	
	@Override
	public String getLastName() {
		return getLastName().toUpperCase();
	}
	public String getFirstName() {
		return getFirstName().toUpperCase();
	}
	public boolean checkEmail() {
	    if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	public int totalPublicYear() {
		return Year.now().getValue()-publicYear;
	}
	public void setAuthorName(String name) {
		author_name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public boolean checkFormatName(){
		if(author_name==getFirstName()+""+getLastName()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return title+" write by "+getFirstName()+" "+getLastName()+"."+"("+email+")"+
	"\nPublished for "+totalPublicYear()+" year.";
	}

	@Override
	public String getTitle() {
		return title;
	}
	
}
