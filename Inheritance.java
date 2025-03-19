import java.util.Scanner;
class Person {
    String name;
    String gender;
    String address;
    int age;
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}
class Employee extends Person {  
    String empId;
    String companyName;
    String qualification;
    double salary;
    public Employee(String name, String gender, String address, int age, 
                    String empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);  // Calling the parent class constructor
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}
class Teacher extends Employee {
    String subject;
    String department;
    String teacherName;   
    public Teacher(String name, String gender, String address, int age,
                   String empId, String companyName, String qualification, double salary,
                   String subject, String department, String teacherName) {
        super(name, gender, address, age, empId, companyName, qualification, salary);  // Calling the parent class constructor
        this.subject = subject;
        this.department = department;
        this.teacherName = teacherName;
    }
    public void instruction() {
        System.out.println(teacherName + " is teaching " + subject + " in the " + department + " department.");
    }   
    public void display() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        instruction();
        System.out.println();
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();               
        Teacher[] teachers = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i+1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();            
            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();            
            System.out.print("Enter Address: ");
            String address = sc.nextLine();            
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();           
            System.out.print("Enter Employee ID: ");
            String empId = sc.nextLine();            
            System.out.print("Enter Company Name: ");
            String companyName = sc.nextLine();           
            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();            
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();           
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();            
            System.out.print("Enter Department: ");
            String department = sc.nextLine();            
            System.out.print("Enter Teacher Name: ");
            String teacherName = sc.nextLine();
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherName);
        }
        System.out.println("\nDisplaying Teacher Details:");
        for (Teacher teacher : teachers) {
            teacher.display();
        }
        sc.close(); 
    }
}


