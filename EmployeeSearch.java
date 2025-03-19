import java.util.Scanner;
class Employee {
    int eNo;     
    String eName; 
    double eSalary;  
 Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
   public void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}
public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int n = sc.nextInt(); 
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Employee Salary: ");
            double eSalary = sc.nextDouble();
            employees[i] = new Employee(eNo, eName, eSalary);
        }
        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchNo) {
                employees[i].display();
                found = true;
                break;
            }
        }
			 if (!found) {
            System.out.println("Employee with Employee Number " + searchNo + " not found.");
        }

        sc.close();
    }
}

