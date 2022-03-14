package gl.email.application.services;

import gl.email.app.Employee;

import java.util.Random;

public class CredentialsGenerator {
    private Employee employee;
    private String generatedEmailID;
    private String generatedPassword = "";
    String departmentShortName;

    public CredentialsGenerator(Employee employee){
        this.employee = employee;
        departmentShortName = getDepartmentShortName();
    }


    public void generatedEmailID(){
       String departmentShortName = getDepartmentShortName();
        String emailID = employee.getFirstName().toLowerCase()+"."+employee.getLastName().toLowerCase()+"@"+departmentShortName+"."+"gl.com";
        this.generatedEmailID = emailID;
    }
    private String getDepartmentShortName(){
        String departmentName = employee.getDepartment();

        if(departmentName.equals("Technical")){
            return "tech";
        }else if(departmentName.equals("Admin")){
            return "adm";
        }else if(departmentName.equals("Human Resource")){
            return "hr";
        }else if(departmentName.equals("Legal")){
            return "lgl";
        }
        return "";
    }

    public void generatedPassword(){
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String specialCaseCharacters = "!@#$%^&*()-_+=[]{};':|,./<>?`~";
        String allValues = upperCaseLetters + lowerCaseLetters + numbers + specialCaseCharacters;
        Random obj = new Random();

        for (int i = 0; i<6; i++){
            int boundValue = allValues.length();
            int randomIndex = obj.nextInt(boundValue);
            char randomChar = allValues.charAt(randomIndex);
            generatedPassword = generatedPassword + randomChar;

        }
    }

    public void displayCredentials(){
        System.out.println("Dear "+ employee.getFirstName() + ",");
        System.out.println("Your Credentials have been generated as follows:- ");
        System.out.println("EmailID: ");
        System.out.println(generatedEmailID);
        System.out.println("Password: ");
        System.out.println(generatedPassword);
    }




}
