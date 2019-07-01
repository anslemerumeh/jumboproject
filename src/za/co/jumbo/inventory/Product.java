package za.co.jumbo.inventory;
import java.util.Scanner;

public class Product{

public Product(){}


private String productName;
private double price;
private int quantity;
private String manufactureDate;
private String expireDate;
private long productBarcode;
public int setQuantity;


public void setProductName(String productName){

this.productName = productName;

}

public String getProductName(){

return productName;

}

public void setPrice(double price){

 this.price = price;

 }


 public double getPrice(){
 
 return price;
 
 }

public void setQuantity(int quantity){

 this.quantity = quantity;

 }

 public int getQuantity(){
 
 return quantity;

 }


public void setManufactureDate(String manufactureDate){

 this.manufactureDate = manufactureDate;

 }

 public String getManufactureDate(){

 return manufactureDate;

 }


public void setExpireDate(String  expireDate){

 this.expireDate = expireDate;

 }


 public String getExpireDate(){

 return expireDate;
  
 }


public void setProductBarcode(long productbarcode){

 this.productBarcode = productBarcode;

 }


 public long getProductBarcode(){
 return productBarcode;
  
 }





public String toString(){
return "Product Name: " + this.productName + "\nPrice: "  + this.price + "\nManufacture Date: " + this.manufactureDate + "\nExpire Date: " + this.expireDate;
}




 }



