package za.co.jumbo.customers;
import za.co.jumbo.cart.Payment;
import za.co.jumbo.inventory.Stock;
import za.co.jumbo.employee.Cashier;
import za.co.jumbo.inventory.Product;
import za.co.jumbo.test.Registration;
import za.co.jumbo.persons.Person;
import java.util.InputMismatchException;
import java.util.Scanner;






public class Customer extends Person{


public void purchase(Scanner scanner){
//Scanner scanner = new Scanner(System.in);
System.out.println();
}


public void customerRegistration(Scanner scanner){
//Scanner scanner = new Scanner(System.in);
System.out.println(""); //skip a line
System.out.println("+............................................................+");
System.out.println("|        \t Create New Customer Account Below \t     |");
System.out.println("+............................................................+");
					
	System.out.println();

	System.out.println("Enter name: ");
        setName (scanner.nextLine());

	System.out.println("Enter Surname: ");
        setSurname (scanner.nextLine());

	System.out.println("Enter Gender: ");
        setGender (scanner.nextLine());        

 	System.out.println("Enter Date Of Birth: D/M/YYYY ");
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
	
	System.out.println("+.............................................................+");
	System.out.println("|\t \t Registration Successfully\t \t      |");
	System.out.println("+.............................................................+");

}


public void printCard(Scanner scanner){
System.out.println("| CUSTOMER CARD DETAILS BELOW\t  |");
	System.out.println("+.................................+");
	System.out.println("Surname: " + getSurname());
	System.out.println("Name: " + getName());
	System.out.println("ID Number: " + getIdNumber());
	System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Gender: "+ getGender());
        System.out.println("Date Of Birth: " + getDateOfBirth());
	System.out.println("Email: " + getEmail());
	System.out.println("Address: " + getAddress());

System.out.println();
System.out.println("..........Thank you for registering with JUMBO RETAIL SUPER-MARKET");
System.out.println("your customer Reference number has been sent to -" + getEmail());
System.out.println();
//r1.employeeLogins(st1,p2);


}
}






