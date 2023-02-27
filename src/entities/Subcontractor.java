package entities;

public class Subcontractor extends Employee{

    private String workSection;

    public Subcontractor(String name, String surname, String taxNumber, String address, String phoneNumber,
                         String socialSecurity, Double salary, String shift, String workSection) {
        super(name, surname, taxNumber, address, phoneNumber, socialSecurity, salary, shift);
        this.workSection = workSection;
    }

    public String getWorkSection() {
        return workSection;
    }

    public void setWorkSection(String workSection) {
        this.workSection = workSection;
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
                + " - Social Security number: "
                + getSocialSecurity()
                + " - Shift: "
                + getShift()
                + " - Salary: "
                + String.format("€%.2f", getSalary())
                + " - Work section: "
                + workSection;
    }
}
