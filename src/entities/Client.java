package entities;

public class Client extends Person {

    private Integer clientCode;
    private Integer numberPurchases;

    public Client(String name, String surname, String taxNumber, String address, String phoneNumber,
                  Integer clientCode, Integer numberPurchases) {
        super(name, surname, taxNumber, address, phoneNumber);
        this.clientCode = clientCode;
        this.numberPurchases = numberPurchases;
    }

    public Integer getClientCode() {
        return clientCode;
    }

    public void setClientCode(Integer clientCode) {
        this.clientCode = clientCode;
    }

    public Integer getNumberPurchases() {
        return numberPurchases;
    }

    public void setNumberPurchases(Integer numberPurchases) {
        this.numberPurchases = numberPurchases;
    }

    //For every 100 purchases, a 1% discount applies.
    public void purchase(Integer quantity){
        numberPurchases += quantity;
    }

    public double discount(){
        int disc = 0;
        if (numberPurchases >= 100) {
            disc = numberPurchases / 100;
        }
        return disc;
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
                + " - Client code: "
                + clientCode
                + " - Number Of purchases: "
                + numberPurchases
                + " - Discount: "
                + discount() + "%";
    }
}
