package gl.email.application.ui;

import java.util.Scanner;
import gl.email.app.Employee;
import gl.email.application.services.CredentialsGenerator;

public class EmailAppUI {
    public void init(){
        Employee employee = buildUI();
        service(employee);
    }
    private Employee buildUI(){
        buildWelcomeSection();
        Employee employee = buildEmployeeDetailsSection();
        return employee;
    }
    private void buildWelcomeSection(){
        System.out.println("**************************************");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to Email Application Programme");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("**************************************");
    }
    private Employee buildEmployeeDetailsSection(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear employee please enter your first name");
        String firstName = sc.nextLine();
        System.out.println("Dear employee please enter your last name");
        String lastName = sc.nextLine();

        System.out.println("Please enter your department name");

        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        System.out.println("Please select 1/2/3/4 for employee's department");

        int departmentID = sc.nextInt();
        String departmentName = getDepartmentName(departmentID);
        Employee employee = new Employee(firstName, lastName, departmentName);

        sc.close();
        return employee;
    }

    private String getDepartmentName(int departmentID){
        if(departmentID == 1){
            return "Technical";
        }else if(departmentID == 2){
            return "Admin";
        }else if(departmentID == 3){
            return "Human Resource";
        }else if(departmentID == 4){
            return "Legal";
        }else {
            return "";
        }
    }

    private void service(Employee employee){
        CredentialsGenerator credentialsGenerator = new CredentialsGenerator(employee);

        credentialsGenerator.generatedEmailID();
        credentialsGenerator.generatedPassword();
        credentialsGenerator.displayCredentials();
    }

}
