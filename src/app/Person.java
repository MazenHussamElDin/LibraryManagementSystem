package app;

public class Person {
    
    
    private String Type;
    private String FirstName;
    private String LastName;
    private String ID;
    private String Email;
    private String Password;
    private String isBlocked;
    private String Address;
    private String MobileNumber;
    

public Person(){}


    public Person(String type, String firstName, String lastName, String iD, String email, String password,
            String isBlocked, String address, String mobileNumber) {
        Type = type;
        FirstName = firstName;
        LastName = lastName;
        ID = iD;
        Email = email;
        Password = password;
        this.isBlocked = isBlocked;
        Address = address;
        MobileNumber = mobileNumber;
    }

 
    


    @Override
    public String toString() {
        return Type + ", " + FirstName + ", " + LastName + ", " + ID
        + ", " + Email + ", " + Password + ", " + isBlocked + ", " + Address
        + ", " + MobileNumber + ",";
    }


    public String getType() {
        return Type;
    }


    public void setType(String type) {
        Type = type;
    }


    public String getFirstName() {
        return FirstName;
    }


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }


    public String getLastName() {
        return LastName;
    }


    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getID() {
        return ID;
    }


    public void setID(String iD) {
        ID = iD;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String password) {
        Password = password;
    }


    public String getIsBlocked() {
        return isBlocked;
    }


    public void setIsBlocked(String isBlocked) {
        this.isBlocked = isBlocked;
    }


    public String getAddress() {
        return Address;
    }


    public void setAddress(String address) {
        Address = address;
    }


    public String getMobileNumber() {
        return MobileNumber;
    }


    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }


}
