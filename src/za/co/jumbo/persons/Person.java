package za.co.jumbo.persons;

public abstract class Person{

    private String name;
    private String surname;
    private String gender;
    private String dateOfBirth;
    private int phoneNumber;
    private String idNumber;
    private String address;
    private String email;    
    private long employeeNumber;
    private String username;
    private String password;
    private String position;


    public void setName(String name){
        this.name = name;
}
    public String getName(){
    return name;
}

public void setSurname(String surname){
     this.surname = surname;
}
 public String getSurname(){
   return surname;
}

 public void setGender(String gender){
     this.gender = gender;
}
 public String getGender(){
     return this.gender;
}
public void setDateOfBirth(String dateOfBirth){
     this.dateOfBirth = dateOfBirth;
}
 public String getDateOfBirth(){
     return dateOfBirth;
}


public void setPhoneNumber(int phoneNumber){
     this.phoneNumber = phoneNumber;
}
 public int getPhoneNumber(){
return phoneNumber; 
}

public void setIdNumber(String idNumber){
this.idNumber = idNumber;
}

public String getIdNumber(){
     return idNumber;
}

public void setAddress(String address){
 this.address = address;
}

public String getAddress(){
return address;
}

public void setEmail(String email){
this.email = email;
}
public String getEmail(){
  return email;
}


public void setEmployeeNumber(long employeeNumber){
     this.employeeNumber = employeeNumber;
}
public long getEmployeeNumber(){
     return employeeNumber;
}


public void setUsername(String username){
        this.username = username;
}

public String getUsername(){
    return username;
}


public void setPassword(String password){
     this.password = password;
}

 public String getPassword(){
   return password;
}

public void setPosition(String position){
     this.position = position;
}

 public String getPosition(){
   return position;
}







public void recievePayment(){
}

public void purchase(){
}

public void printCard(){
}

public void employeeLogins(){
}

public void customerRegistration(){
}

public void employeeRegistration(){

}



}
