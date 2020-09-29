import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Login{
	public static void main(String[] args){
	System.out.println("Enter your Last Name");
	Scanner sc=new Scanner(System.in);
	String last_name=sc.nextLine();
	
	Pattern pattern = Pattern.compile("^[A-Z]{1}(?=.*[a-z]).{2,}$"); //pin code is 6 digit string
	Matcher m=pattern.matcher(last_name);                                       
	int i=0;

	while(m.find()){
		System.out.println("Valid Last Name");
		i=1;
	}
	 if(i==0){
		System.out.println("Invalid Last Name");	
	}

	
}
}