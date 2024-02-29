package AbcShopSystem;

public class Employee extends Person{

    //Q no 1
    private double hoursWorked;
    private double hourlyWage;
    private String department;

//Qno 2
    public Employee() {
        this.hoursWorked=123333333.0;
        this.hourlyWage=123;
        this.department="ER";
    }

    public Employee(double hoursWorked, double hourlyWage, String department) {
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
        this.department = department;
    }

    //Q no 3

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyWage=" + hourlyWage +
                ", department='" + department + '\'' +
                '}';
    }


    public void setDiscount() {
        if (hoursWorked < 20) {
            this.discount =  0.05;  // 5% discount for less than 20 hours
        } else if (hoursWorked >= 21 && hoursWorked <= 30) {
            this.discount =  0.1;   // 10% discount for 21-30 hours
        } else if (hoursWorked > 30) {
            this.discount =  0.15;  // 15% discount for more than 30 hours
        }
    }



}
