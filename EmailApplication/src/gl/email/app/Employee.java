package gl.email.app;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;

    public  Employee(String firstName, String lastName, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
  //Getter and Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Employee name = new Employee("Shubham","Sharma","Technical");
        name.setFirstName("Shubham");
        name.setLastName("Sharma");
        name.setDepartment("Technical");
    }
}
