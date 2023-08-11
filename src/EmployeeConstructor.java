public class EmployeeConstructor {
    String firstName;
    String lastName;
    String dept;
    public EmployeeConstructor() {
        firstName = "Balaji";
        lastName = "Nagappan";
        dept = "Testing";

    }

    public static void main(String[] args) {
        EmployeeConstructor EmpId = new EmployeeConstructor();
        System.out.println(EmpId.firstName);
        System.out.println(EmpId.lastName);

    }


    }

