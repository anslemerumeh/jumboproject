package za.co.jumbo.customers;
import java.util.InputMismatchException;
import java.util.Scanner;
import za.co.jumbo.test.Application;
import za.co.jumbo.cart.Payment;
import za.co.jumbo.test.Registration;
import za.co.jumbo.persons.Person;
import za.co.jumbo.inventory.Stock;
import za.co.jumbo.employee.Cashier;
import za.co.jumbo.inventory.Product;
import za.co.jumbo.employee.Manager;
import za.co.jumbo.customers.Customer;
import java.util.Scanner;

public class Supplier extends Person{

private int quantity;
private double price;
private double totalPrice;


public void setQuantity(int quantity){
this.quantity = quantity;
}
public int getQuantity(){
return quantity;
}


public void setPrice(double price){
this.price = price;
}
public double getPrice(){
return price;
}


public void setTotalPrice(double totalPrice){
this.totalPrice = totalPrice;
}
public double getTotalPrice(){
return totalPrice;
}


public void recieveOrder(Scanner scanner, Application a1, Registration r1, Manager m1, Supplier supplier, Stock st1, Product p2, Cashier c1, Customer p1, Payment pay){

//Scanner scanner = new Scanner(System.in);

scanner.nextLine();

       	System.out.println("Enter Supplier Company Name: ");
        setName (scanner.nextLine());

	System.out.println("Enter Phone Number: ");
        setPhoneNumber (scanner.nextInt());

	scanner.nextLine();
	System.out.println("Enter Email: ");
        setEmail (scanner.nextLine());
  	
	System.out.println("Enter Address: ");
        setAddress (scanner.nextLine());                         

System.out.println();
        
System.out.println("+....................................................+");
System.out.println("|  WHAT'S THE NUMBER OF PRODUCT YOU WANT TO ORDER ?  |");
System.out.println("+....................................................+");
int order = scanner.nextInt();

for(int a=0; a<order; a++){

	System.out.println();

	scanner.nextLine();

	System.out.print("Product Name : ");
  	p2.setProductName (scanner.nextLine());     
                          
  	try {
        System.out.print("Product Quantity : ");
        p2.setQuantity(scanner.nextInt());
           
        }  catch(InputMismatchException ex) {
       }
                             

        }


  	System.out.println("..........Thank you for ordering with : " + getName());
	System.out.println("your order has been recieved and will be delivered in the next two working days");
	System.out.println();                    
	System.out.println();  

a1.jumboSystem(scanner,a1,r1,m1,st1,p2,c1,p1,supplier,pay);
}

    

}