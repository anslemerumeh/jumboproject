package za.co.jumbo.inventory;
import za.co.jumbo.inventory.Product;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Stock{

public long productBarcode[] = new long[100];
public double totals[] = new double[100];


public void displayProduct(Product p2, Scanner scanner){
//Scanner scanner = new Scanner(System.in);

	try {
	
productBarcode[0] = 12345;
productBarcode[1] = 123456;
productBarcode[2] = 1234567;
productBarcode[3] = 12345678;
productBarcode[4] = 123456789;


System.out.print("ENTER PRODUCT-BARCODE:  ");
long barcode = scanner.nextLong();

System.out.println();

for(int b=0; b<4; b++){
if(barcode == productBarcode[0]){
System.out.println("**********PRODUCT DESCRIPTION***********");
p2.setProductName("Tactic Rice (5kg)");
p2.setPrice(19.00);
p2.setManufactureDate("20-05-2019");
p2.setExpireDate("28-09-2020");
System.out.println(p2.toString());

System.out.print("Enter Quantity of Product: ");
p2.setQuantity(scanner.nextInt());

totals[0] = p2.getQuantity() * p2.getPrice();
System.out.println("Total Price: R\t" + totals[0]);

b=100;
}


else if(barcode == productBarcode[1]){
System.out.println("**********PRODUCT DESCRIPTION***********");
p2.setProductName("Albany Bread");
p2.setPrice(14.00);
p2.setManufactureDate("18-09-2019");
p2.setExpireDate("30-09-2019");

System.out.println(p2.toString());

System.out.print("Enter Quantity of Product: ");
p2.setQuantity(scanner.nextInt());

totals[1] = p2.getQuantity() * p2.getPrice();
System.out.println("Total Price: R\t" + totals[1]);

b=100;
}



else if(barcode == productBarcode[2]){
System.out.println("**********PRODUCT DESCRIPTION***********");
p2.setProductName("Bake beans");
p2.setPrice(8.00);
p2.setManufactureDate("20-10-2019");
p2.setExpireDate("17-05-2020");

System.out.println(p2.toString());

System.out.print("Enter Quantity of Product: ");
p2.setQuantity(scanner.nextInt());

totals[2] = p2.getQuantity() * p2.getPrice();
System.out.println("Total Price: R\t" + totals[2]);

b=100;
}


else if(barcode == productBarcode[3]){
System.out.println("**********PRODUCT DESCRIPTION***********");
p2.setProductName("Milk");
p2.setPrice(12.00);
p2.setManufactureDate("20-07-2019");
p2.setExpireDate("17-01-2020");

System.out.println(p2.toString());

System.out.print("Enter Quantity of Product: ");
p2.setQuantity(scanner.nextInt());

totals[3] = p2.getQuantity() * p2.getPrice();
System.out.println("Total Price: R\t" + totals[3]);

b=100;
}

else if(barcode == productBarcode[4]){
System.out.println("**********PRODUCT DESCRIPTION***********");
p2.setProductName("Exoctic Orandge juice");
p2.setPrice(19.00);
p2.setManufactureDate("20-04-2019");
p2.setExpireDate("30-04-2020");

System.out.println(p2.toString());

System.out.print("Enter Quantity of Product: ");
p2.setQuantity(scanner.nextInt());

totals[4] = p2.getQuantity() * p2.getPrice();
System.out.println("Total Price: R\t" + totals[4]);

b=100;
}




}


	}catch(InputMismatchException ex) {
	}

}


					
	

}
