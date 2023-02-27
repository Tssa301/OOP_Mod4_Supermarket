package entities;

public class Employee extends Person {

    //Employees and Stokers

    private String socialSecurity;
    private Double salary;
    private String shift;

    public Employee(String name, String surname, String taxNumber, String address, String phoneNumber,
                    String socialSecurity, Double salary, String shift) {
        super(name, surname, taxNumber, address, phoneNumber);
        this.socialSecurity = socialSecurity;
        this.salary = salary;
        this.shift = shift;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public Double getSalary() {
            return salary;
        }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    // The night shift has an extra 150 euros.
    public Double nightShift() {
        double extra = 0.0;
        if (shift.equals("night")){
            extra = salary + 150;
        }
        return extra;
    }

    @Override
    public String toString() {
        return "Name: "
                + getName()
                + " - Surname: "
                + getSurname()
                + " - Tax number: "
                + getTaxNumber()
                + " - Address: "
                + getAddress()
                + " - Phone number: "
                + getPhoneNumber()
                + " - Social security number : "
                + socialSecurity
                + " - Shift: "
                + shift
                + " - Salary: "
                + String.format("€%.2f", salary)
                +" - Night shift salary: "
                + String.format("(€%.2f)", nightShift());
    }
}
