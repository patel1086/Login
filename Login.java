import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Login{

	public static void FirstNameValidate(String first_name){
	Pattern pattern = Pattern.compile("^[A-Z]{1}(?=.*[a-z]).{2,}$"); 
	Matcher m=pattern.matcher(first_name);                                       
	int i=0;

	while(m.find()){
		System.out.println("Valid First Name");
		i=1;
	}
	 if(i==0){
		System.out.println("Invalid First Name");
			
	}
	
	}
	
	public static void LastNameValidate(String last_name){
	Pattern pattern = Pattern.compile("^[A-Z]{1}(?=.*[a-z]).{2,}$"); 
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
	
	public static void EmailValidate(String email){
	Pattern pattern = Pattern.compile("^[_A-Za-z0-9+-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
	Matcher m=pattern.matcher(email);                                       
	int i=0;

	while(m.find()){
		System.out.println("Valid Email");
		i=1;
	}
	 if(i==0){
		System.out.println("Invalid Email");	
	}
	
	}

	public static void MobileValidate(String mobile){
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

	public static void PasswordValidate(String password){
	Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#!@%&])[a-zA-Z0-9].{8,}$"); 
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

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to login page");
	System.out.println("Enter your First Name");
	String firstname=sc.nextLine();
	FirstNameValidate(firstname);
	System.out.println("Enter your Last name");
	String lastname=sc.nextLine();
	LastNameValidate(lastname);
	System.out.println("Enter your Email");
	String mail=sc.nextLine();
	EmailValidate(mail);
	System.out.println("Enter your mobile number");
	String mobile=sc.nextLine();
	MobileValidate(mobile);
	System.out.println("Enter your Password");
	String password=sc.nextLine();
	PasswordValidate(password);
	
	

	
}
}