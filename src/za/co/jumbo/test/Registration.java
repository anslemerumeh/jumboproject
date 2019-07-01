package za.co.jumbo.test;
import java.util.Scanner;
import java.util.InputMismatchException;
import za.co.jumbo.inventory.Product;
import za.co.jumbo.persons.Person;
import za.co.jumbo.inventory.Stock;
import za.co.jumbo.customers.Customer;
import java.util.Scanner;

public class Registration extends Person{



public void employeeRegistration(Scanner scanner){

System.out.println(".............WELCOME TO JUMBO REGISTRATION SYSTEM.............");

	System.out.println("Enter name: ");
        setName (scanner.nextLine());

	System.out.println("Enter Surname: ");
        setSurname (scanner.nextLine());

	System.out.println("Enter Gender: ");
        setGender (scanner.nextLine());        

 	System.out.println("Enter Date Of Birth: D/M/YYYY");
        setDateOfBirth (scanner.nextLine());
    	
       
        try {
        	System.out.println("Enter Phone Number: ");
        setPhoneNumber (scanner.nextInt());
           
        }  catch(InputMismatchException ex) {
       }
        
        
	System.out.println("Enter ID Number: ");
        setIdNumber (scanner.nextLine());

	scanner.nextLine();
	System.out.println("Enter Email: ");
        setEmail (scanner.nextLine());
  	
	System.out.println("Enter Address: ");
        setAddress (scanner.nextLine());

	System.out.println("Enter Employee Position: ");
        setPosition (scanner.nextLine());
	

System.out.println("");
System.out.println("*****CREATE NEW EMPLOYEE USER-NAME AND PASSWORD BELOW*****");

	System.out.print("Enter Username: ");
	setUsername (scanner.nextLine());

	System.out.print("Enter Password: ");
	setPassword (scanner.nextLine());

	/*System.out.println("Enter Employee Position: ");
	setPosition (scanner.nextLine());*/


System.out.println("..........................................................................");
System.out.println("New Employee Registration Successful Your Login Details Has Been Sent To: " +  getEmail());
System.out.println("..........................................................................");
System.out.println("             Please do not share your login information");
System.out.println("Your new User-Name is: " + getUsername());
System.out.println("Your new Password is: " + getPassword());




}


public void employeeLogins(Stock st1,Product p2, Scanner scanner){
//Scanner input = new Scanner(System.in);


String position1 = "manager";
String position2 = "cashier";

String userNameInput = "";
String passwordInput = "";

int attempt = 0;


for(attempt = 0; attempt<=2; ++attempt){
System.out.print("Enter Username: ");
userNameInput = scanner.nextLine();


System.out.print("Enter Password: ");
passwordInput = scanner.nextLine();

System.out.println("");

if(userNameInput.equals(getUsername()) && passwordInput.equals(getPassword()) && getPosition().equals(position1)){
System.out.println("+......................................................+");
System.out.println("  \t \t      LOGIN ACCESS GRANTED		        ");
System.out.println("  \t \t      Welcome: " + getName());
System.out.println("+......................................................+");

System.out.println();

System.out.println("+....................................................+");
System.out.println("|		   Press (1) to Scan Product           |");
System.out.println("|		   Press (2) to Void Product           |");
System.out.println("|		   Press (3) to Log-out                |");
System.out.println("|		   Press (4) to Request-Stock          |");
System.out.println("|		   Press (5) to Add Product            |");
System.out.println("+....................................................+");


attempt =50;


}

else if(userNameInput.equals(getUsername()) && passwordInput.equals(getPassword()) && getPosition().equals(position2)){
System.out.println("+......................................................+");
System.out.println("| \t \t   LOGIN ACCESS GRANTED		       |");
System.out.println("| \t \t   Welcome: " + getName());
System.out.println("+......................................................+");

System.out.println();

System.out.println("+......................................................+");
System.out.println("|		   Press (1) to Scan Product           |");
System.out.println("|		   Press (3) to Log-out                |");
System.out.println("+......................................................+");



attempt =50;


}else if(attempt == 2){
System.out.println("..............................................................................................");
System.out.println("\t Account has been Blocked, Please Contact Jumbo Customer Service for Assistance!!");
System.out.println("..............................................................................................");

System.out.println();



}else {System.out.println("Username or Password incorrect please **** TRY AGAIN!!!");

}

}

}

 

}//end of class

