package company;

import people.Person;

public class Employee extends Person {
    String company = "Tech Ltd.";

    public void showDetails() {
        displayInfo(); // Accessing protected method
        System.out.println("Company: " + company);
    }
}
