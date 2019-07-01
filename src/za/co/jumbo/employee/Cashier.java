package za.co.jumbo.employee;
import za.co.jumbo.test.Application;
import za.co.jumbo.customers.Customer;
import za.co.jumbo.customers.Supplier;
import za.co.jumbo.cart.Payment;
import za.co.jumbo.test.Registration;
import za.co.jumbo.persons.Person;
import za.co.jumbo.inventory.Stock;
import za.co.jumbo.employee.Manager;
import java.util.Date;
import java.util.InputMismatchException;

import za.co.jumbo.inventory.Product;
import java.util.Scanner;



public class Cashier extends Person{



public void recievePayment(Payment pay,Product p2,Stock st1, Scanner scanner){
//Scanner scanner = new Scanner(System.in);
System.out.println();

try {
pay.calculation(st1);

System.out.println();

for(int v =0; v<5; v++){
System.out.println();

System.out.println("+.............................+");
System.out.println("|\tTYPE OF PAYMENT       |");
System.out.println("+.............................+");
System.out.println(">>    PRESS (1) FOR CASH");
System.out.println(">>    PRESS (2) FOR CARD");
int tender = scanner.nextInt();

if(tender == 1){

System.out.print("Enter Amount: R" );
pay.setAmount(scanner.nextInt());

System.out.println();



double change =  pay.getAmount() - pay.grandTotal;

System.out.println("........................");
System.out.println("Change : R" + change);
System.out.println("........................");

v=100;
}

else if (tender == 2 ){
System.out.println("+...............................................+");
System.out.println("Swip/Tap customer card to proceed with PAYMENT: " );
System.out.println("+...............................................+");
System.out.println();

System.out.println("Enter ATM Card Pin: ");
int pin = scanner.nextInt();

System.out.println("PROCESSING CARD PAYMENT");

System.out.println();

System.out.println("...........PAYMENT SUCCESSFUL");
v=100;
}

else if(tender !=1 && tender >2){
System.out.println("Wrong input Selection TRY AGAIN !!");
}
} 

}catch(InputMismatchException ex) {
}
}


public void printReceipt(Scanner scanner, Application a1,Registration r1,Manager m1,Stock st1,Product p2,Cashier c1,Customer p1,Supplier supplier,Payment pay){

//Scanner scanner = new Scanner(System.in);

	try {	
double change = pay.getAmount() - pay.grandTotal; 
Date date = new Date();


for(int n=0; n<3; n++){

System.out.println("press (1) to issue customer RECEIPT :");
int press = scanner.nextInt();
System.out.println();


if(press == 1){
System.out.println();

System.out.println("\t*****************  JUMBO RETAIL SUPER-MARKETCUSTOMER  *********************");
System.out.println("\t \t *****************  CUSTOMER RECEIPT  *********************");
System.out.println("        	    280 Wonderboom South, Pretoria South Africa");
System.out.println("	      		Tel: 012 357 9856, Fax: 012 558 6698");
System.out.println("                   		Email: info@jumbo.com");
System.out.println();
System.out.println("                   		Cashier Name: Grace");
System.out.println("\t \t \tDate: "+  date);
System.out.println();
System.out.println("                  	       PRODUCT DESCRIPTION");
System.out.println("			       Product Name: " + p2.getProductName());
System.out.println("			       Price: R\t"  + p2.getPrice());
System.out.println("       		            Quantity of Product: " + p2.getQuantity());
System.out.println("\t \t \t   Grand Total: R" + pay.grandTotal);
System.out.println(" \t \t \t   Tendered Amount: R" + pay.getAmount());
System.out.println("\t \t \t     Change : R" + change);
System.out.println("\tThank you very much for your purchase at JUMBO RETAIL SUPER-MARKET (*_*)");
System.out.println();


n =100;


System.out.println("+...............................................+");
System.out.println("|       press (1) to Request for next Customer  |");
System.out.println("|       press (2) to Sign-Out                   |");
System.out.println("+...............................................+");
System.out.println();
int press2 = scanner.nextInt();


if(press2 == 1){
System.out.println("+....................................+");
System.out.println("|          Next customer please      |");
System.out.println("+....................................+");
System.out.println();

}

else if(press2 == 2){
System.out.println();//space
System.out.println();//space
a1.jumboSystem(scanner,a1,r1,m1,st1,p2,c1,p1,supplier,pay);
}//end of second if statement



}
}

}//try bracket

catch(InputMismatchException ex) {
}//catch close bracket




}//method bracket




}//class bracket



