import java.util.Date;

public class Customer {
    private String fullName;
    private Date dob;
    private String address;
    private Date registrationDate;
    private String nationality;

    // Constructor
    public Customer(String fullName, Date dob, String address, Date registrationDate, String nationality) {
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.registrationDate = registrationDate;
        this.nationality = nationality;
    }

    // Getter for fullName
    public String getFullName() {
        return fullName;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for registrationDate
    public Date getRegistrationDate() {
        return registrationDate;
    }

    // Getter for nationality
    public String getNationality() {
        return nationality;
    }
    
    // Other methods (omitted for brevity)
}
