package za.co.jumbo.employee;
import za.co.jumbo.test.Application;
import za.co.jumbo.customers.Supplier;
import za.co.jumbo.cart.Payment;
import za.co.jumbo.test.Registration;
import za.co.jumbo.persons.Person;
import za.co.jumbo.inventory.Stock;
import za.co.jumbo.employee.Cashier;
import za.co.jumbo.inventory.Product;
import za.co.jumbo.employee.Manager;
import za.co.jumbo.customers.Customer;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

import java.util.InputMismatchException;


public class Manager extends Person{

private int pin = 12345;


public void setPin(int pin){
 this.pin = pin;
}

public int getPin(){
return pin;
}

public void cancelItem(){
}


public void requestStock(Scanner scanner, Application a1, Registration r1, Manager m1, Supplier supplier, Stock st1, Product p2, Cashier c1, Customer p1, Payment pay){

supplier.recieveOrder(scanner , a1, r1, m1, supplier, st1, p2, c1, p1, pay);

}
  

public void addProduct(Scanner scanner, Application a1, Registration r1, Manager m1, Stock st1, Product p2, Cashier c1, Customer p1, Supplier supplier, Payment pay){
//Scanner scanner = new Scanner (System.in);
try {
System.out.println("+................................................................+");
System.out.println("|  WHAT'S THE NUMBER OF PRODUCT YOU WANT TO LOAD ON THE SYSTEM ?  |");
System.out.println("+................................................................+");
int add = scanner.nextInt();

	System.out.println();

	scanner.nextLine();

	System.out.print("Product Name : ");
  	p2.setProductName (scanner.nextLine());

  	int q=0;
  	
    for(int e =0; e<5; e++) { 
  		if(p2.getQuantity() == (q)) {
  		
  			System.out.print("Product Quantity : ");
     p2.setQuantity(scanner.nextInt());
  		
  		
System.out.println("+................................................................+");
System.out.println("|                     PRESS (0) TO SIGN OUT                       ");
System.out.println("+................................................................+");

int option = scanner.nextInt();

System.out.println();
System.out.println();
System.out.println();
System.out.println();


if(option == 0 ){
a1.jumboSystem(scanner, a1, r1, m1, st1, p2, c1, p1, supplier, pay);

}

else if (p2.getQuantity() != (q)) {
	System.out.println("try again ");
}

  		}
  	}


}catch(InputMismatchException ex) {
}


}//ADD METHOD BRACKET


public void logOut(Scanner scanner, Application a1, Registration r1, Manager m1, Stock st1, Product p2, Cashier c1, Customer p1, Supplier supplier, Payment pay){
System.out.println("Logged out successfully"); 
			System.out.println();//space
			System.out.println();//space
try {
a1.jumboSystem(scanner, a1, r1, m1, st1, p2, c1, p1, supplier, pay);
}catch(InputMismatchException ex) {

}
}



}//CLASS BRACKET

