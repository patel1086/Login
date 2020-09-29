import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Login{
	public static void main(String[] args){
	System.out.println("Enter your Mobile Number");
	Scanner sc=new Scanner(System.in);
	String mobile=sc.nextLine();
	
	Pattern pattern = Pattern.compile("^[0-9]{2}(\s{1}[0-9]{10})$"); 
	Matcher m=pattern.matcher(mobile);                                       
	int i=0;

	while(m.find()){
		System.out.println("Valid Mobile Number");
		i=1;
	}
	 if(i==0){
		System.out.println("Invalid Mobile Number");	
	}

	
}
}