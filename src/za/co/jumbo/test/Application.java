package za.co.jumbo.test;
import za.co.jumbo.customers.Supplier;
import za.co.jumbo.cart.Payment;
import za.co.jumbo.inventory.Stock;
import za.co.jumbo.employee.Cashier;
import za.co.jumbo.inventory.Product;
import za.co.jumbo.employee.Manager;
import za.co.jumbo.customers.Customer;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Application{


public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
Application a1 = new Application();
Supplier supplier = new Supplier();
Registration r1 = new Registration();
Product p2 = new Product();
Stock st1 = new Stock();
Manager m1 = new Manager();
Customer p1 = new Customer();
Cashier c1 = new Cashier();
Payment pay = new Payment();


a1.jumboSystem(scanner, a1,r1,m1,st1,p2,c1,p1,supplier,pay);


}//jumbo system bracket



public void jumboSystem(Scanner scanner, Application a1,Registration r1,Manager m1,Stock st1,Product p2,Cashier c1,Customer p1,Supplier supplier,Payment pay){

//Scanner input = new Scanner(System.in);

System.out.println(".............WELCOME TO JUMBO RETAIL SUPERMARKET.............");
System.out.println("        280 Wonderboom South, Pretoria South Africa");
System.out.println("	      Tel: 012 357 9856, Fax: 012 558 6698");
System.out.println("                   Email: info@jumbo.com");
System.out.println("");


Scanner registration = new Scanner(System.in);

try {
System.out.println("+.............................................................................+");
System.out.println("|    You can register a new employee by pressing (1)  or press (2) to login   |");
System.out.println("+.............................................................................+");


int reg = registration.nextInt();


if(reg == 1){
r1.employeeRegistration(scanner);
//throw new InputMismatchException();
}

}catch(InputMismatchException ex) {
}// end of catch block


System.out.println();

System.out.println("+......................................................+");
System.out.println("| \t \t    KINDLY LOGIN BELOW		       |");
System.out.println("+......................................................+");
				r1.employeeLogins(st1,p2,scanner);


System.out.print("ENTER OPTION: ");
int option = scanner.nextInt();

System.out.println();

for(int repeat = 0; repeat<10; repeat++){  //REPEATING OF THE PROCESS 
if(option == 1){ //FIRST OPTION (SCAN PRODUCT)

System.out.println("********DO CUSTOMER HAVE A JUMBO SHOPPING CARD ?*********");

scanner.nextLine();

System.out.print("ENTER Y/N: ");
String question = scanner.nextLine();

String y ="y";
String n = "n";

if(question.equals (y)){
System.out.println("..........................................................");
System.out.println("\t KINDLY SWIP CUSTOMER CARD TO PROCEED");
System.out.println("..........................................................");
					System.out.println();
								st1.displayProduct(p2, scanner);
	for(int a =0; a<5; a++){
	System.out.println("..........................................................");
	System.out.println("\twould you like to add more product....Y/N ?");
	System.out.println("..........................................................");
						String question2 = scanner.nextLine();
						
						String yes ="y";
						String no = "n";

						
						if(question2.equals(yes)){							
						st1.displayProduct(p2, scanner);				
						}
	

						if(question2.equals(no)){
						c1.recievePayment(pay,p2,st1,scanner);
						c1.printReceipt(scanner,a1,r1,m1,st1,p2,c1,p1,supplier,pay);	
						a=10;

						}//question 2 (no) bracket
						}//for loop bracket



}
					else if(question.equals(n)){
					System.out.println();
		System.out.println("PLEASE VISIT JUMBO CUSTOMER SERVICE CENTER FOR REGISTRATION");
						p1.customerRegistration();	
							p1.printCard();
//AFTER CUSTOMER REGISTRATION THE SYSTEM CONTINUES TO SCANNING PRODUCT
System.out.println("..........................................................");
System.out.println("\t KINDLY SWIP CUSTOMER CARD TO PROCEED");
System.out.println("..........................................................");
					System.out.println();
								st1.displayProduct(p2, scanner);
	for(int z =0; z<5; z++){
	System.out.println("..........................................................");
	System.out.println("\twould you like to add more product....Y/N ?");
	System.out.println("..........................................................");
						String question3 = scanner.nextLine();
						
						String yes ="y";
						String no = "n";

						
						if(question3.equals(yes)){							
						st1.displayProduct(p2, scanner);				
						}
	

						if(question3.equals(no)){
						c1.recievePayment(pay,p2,st1,scanner);	
						c1.printReceipt(scanner, a1,r1,m1,st1,p2,c1,p1,supplier,pay);					
						z=10;

}//QUESTION 3 CLOSING BRACKET (NO)
}//THE SCANNING OR ADDING PRODUCT PROCESS STOPS HERE(LOOP)







}//remove
}//BRACKET FOR SCANNING PRODUCT OPTION ENDS HERE (SCAN PRODUCT)

//repeat =100;
}//REPEATING OF LOOPS END HERE

if(option == 4){
m1.requestStock(scanner, a1, r1, m1, supplier, st1, p2, c1, p1, pay);
}//ELSE IF CLOSE BRACKET FOR OPTION (4) REIQUEST STOCK

else if(option == 3){
m1.logOut(scanner, a1, r1, m1, st1, p2, c1, p1, supplier, pay);
}

else if(option == 5){
m1.addProduct(scanner, a1, r1, m1, st1, p2, c1, p1, supplier, pay);
}


else{System.out.println("WRONG INPUT SELECTION TRY AGAIN"); 

}



}//main method
}//class