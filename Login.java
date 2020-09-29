import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Login{
	public static void main(String[] args){
	System.out.println("Enter your Password");
	Scanner sc=new Scanner(System.in);
	String password=sc.nextLine();
	
	Pattern pattern = Pattern.compile("^(?=.*?[A-Z])[a-zA-z0-9].{8,}$"); 
	Matcher m=pattern.matcher(password);                                       
	int i=0;

	while(m.find()){
		System.out.println("Valid Password");
		i=1;
	}
	 if(i==0){
		System.out.println("Invalid Password");	
	}

	
}
}