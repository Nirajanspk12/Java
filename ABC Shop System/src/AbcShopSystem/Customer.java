package AbcShopSystem;

public class Customer extends Person{
//Q no 1
    private String emailAddress;
    private CustomerType customerType;
    private String address;
    private String c_ph_number;


    //Q.no 2
    public Customer() {

        this.emailAddress="smriti@xyxcoom";
        this.customerType=CustomerType.NORMAL;
        this.address="SYD";
        this.c_ph_number="064562783";
    }

    public Customer(String emailAddress, CustomerType customerType, String address, String c_ph_number) {
        this.emailAddress = emailAddress;
        this.customerType = customerType;
        this.address = address;
        this.c_ph_number = c_ph_number;
    }

    //getter and setters Q no 3

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getC_ph_number() {
        return c_ph_number;
    }

    public void setC_ph_number(String c_ph_number) {
        this.c_ph_number = c_ph_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "emailAddress='" + emailAddress + '\'' +
                ", customerType=" + customerType +
                ", address='" + address + '\'' +
                ", c_ph_number='" + c_ph_number + '\'' +
                '}';
    }

    public void setDiscount() {
        switch (customerType) {
            case NORMAL:
                this.discount =  0.0;  // 0% discount for normal customers
                break;
            case GOLD:
                this.discount =  0.03; // 3% discount for gold customers
                break;
            case VIP:
                this.discount =  0.05; // 5% discount for VIP customers
                break;
            default:
                this.discount =  0.0;  // default discount if type is not recognized
        }
    }

}
