import java.util.Scanner;

// Abstract class Employee
abstract class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }

    abstract double calculateBonus();
}

// Interface Promotable
interface Promotable {
    void promote(String newDesignation);
}

// Manager class
class Manager extends Employee implements Promotable {
    String department;
    String designation;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department, String designation) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
        this.designation = designation;
    }

    @Override
    double calculateBonus() {
        return 0.30 * salary; // 30% bonus
    }

    @Override
    public void promote(String newDesignation) {
        this.designation = newDesignation;
    }

    public void printManagerDetails() {
        printDetails();
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Bonus: " + calculateBonus());
    }
}

// Officer class
class Officer extends Employee implements Promotable {
    String specialization;
    String designation;

    public Officer(String name, int age, String phoneNumber, String address, double salary, String specialization, String designation) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.designation = designation;
    }

    @Override
    double calculateBonus() {
        return 0.20 * salary; // 20% bonus
    }

    @Override
    public void promote(String newDesignation) {
        this.designation = newDesignation;
    }

    public void printOfficerDetails() {
        printDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Designation: " + designation);
        System.out.println("Bonus: " + calculateBonus());
    }
}

// Main class
public class CompanyWorkforce {
    public static void main(String[] args) {
        Scanner  = new Scanner(System.in);

        // Input for Manager
        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Age: ");
        int mAge = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Phone Number: ");
        String mPhone = sc.nextLine();
        System.out.print("Address: ");
        String mAddress = sc.nextLine();
        System.out.print("Salary: ");
        double mSalary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Department: ");
        String mDept = sc.nextLine();
        System.out.print("Designation: ");
        String mDesig = sc.nextLine();

        Manager manager = new Manager(mName, mAge, mPhone, mAddress, mSalary, mDept, mDesig);

        // Input for Officer
        System.out.println("\nEnter Officer details:");
        System.out.print("Name: ");
        String oName = sc.nextLine();
        System.out.print("Age: ");
        int oAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Phone Number: ");
        String oPhone = sc.nextLine();
        System.out.print("Address: ");
        String oAddress = sc.nextLine();
        System.out.print("Salary: ");
        double oSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Specialization: ");
        String oSpec = sc.nextLine();
        System.out.print("Designation: ");
        String oDesig = sc.nextLine();

        Officer officer = new Officer(oName, oAge, oPhone, oAddress, oSalary, oSpec, oDesig);

        // Print details
        System.out.println("\nManager Details:");
        manager.printManagerDetails();

        System.out.println("\nOfficer Details:");
        officer.printOfficerDetails();

        // Promotion
        System.out.print("\nEnter new designation for Manager: ");
        String newMDesig = sc.nextLine();
        manager.promote(newMDesig);

        System.out.print("Enter new designation for Officer: ");
        String newODesig = sc.nextLine();
        officer.promote(newODesig);

        // Print updated designations
        System.out.println("\nUpdated Manager Designation: " + manager.designation);
        System.out.println("Updated Officer Designation: " + officer.designation);
    }
}

