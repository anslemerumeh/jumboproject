package za.co.jumbo.cart;
import java.util.InputMismatchException;
import java.util.Scanner;
import za.co.jumbo.inventory.Stock;
import za.co.jumbo.inventory.Product;

public class Payment{


public double grandTotal;
public double amount;
public double change;



public void setGrandTotal(double grandTotal){
this.grandTotal = grandTotal;
}

public double getGrandTotal(){
return grandTotal;
}

public void setAmount(double amount){
this.amount = amount;
}

public double getAmount(){
return amount;
}

public void setChange(double change){
this.change = change;
}

public double getChange(){
return change;
}


		
public void calculation(Stock st1){

	try {
grandTotal = st1.totals[0] + st1.totals[1] + st1.totals[2]+ st1.totals[3] + st1.totals[4];
System.out.println("Grand Total: R\t" + grandTotal);	
}
catch(InputMismatchException ex) {
}

}
}
