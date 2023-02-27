package application;

import entities.Client;
import entities.Employee;
import entities.Person;
import entities.Subcontractor;

import java.util.ArrayList;
import java.util.List;

public class Market {

    static List<Employee> empList = new ArrayList<>();
    static List<Client> cliList = new ArrayList<>();

    public static void marketEmployees(List<Employee> employeeList){

        for (Employee emp : employeeList){
            System.out.println(emp);
        }
    }

    public static void marketClients(List<Client> clientList){

        for (Client client : clientList){
            System.out.println(client);
        }
    }

    public static void main(String[] args){

        Employee employee = new Employee("Bob", "Grey Den", "992453783", "Dhon Street 2",
                "991254701","35978214785", 800.00,"night");
        empList.add(employee);

        Employee stoker = new Employee("James", "Brown", "758934521", "Ballicoly Avenue 8",
                "987524658","98754123974", 920.00,"morning");
        empList.add(stoker);

        Subcontractor subcontractor = new Subcontractor("Maria", "Green", "758934521", "Jarvis Street 10",
                "987524658","98754123974", 750.00,"afternoon","Bakery");
        empList.add(subcontractor);

        Client client1 = new Client("Jhon", "Genius", "1789413587", "Central Park Lot 10",
                "558799621", 101, 57);
        client1.purchase(99);
        cliList.add(client1);

        Client client2 = new Client("Susan", "Morgan", "597864921", "Dorset Street 27",
                "999057895", 102, 99);
        client2.purchase(101);
        cliList.add(client2);

        Client client3 = new Client("Pedro", "Smitch", "97325417", "Monjoy Square 33",
                "55558624", 103, 87);
        cliList.add(client3);

        System.out.println("Supermarket staff list:");
        Market.marketEmployees(empList);

        System.out.println("\nSupermarket clients list:");
        Market.marketClients(cliList);

    }
}
