// method overloading



public class EmployeeModule {
    String firstName;
    String lastName;
    String dept;
    int Id;
    char gender;
    String Qualification;
    Boolean TechnicalCertification;

    public void m1() {
        firstName = "Balaji";
        lastName = "Nagappan";
        dept = "Testing";
        Id = 1874;
        gender = 'M';
        Qualification = "relevant experience";
        this.TechnicalCertification = true;
        System.out.println(firstName+" "+lastName);
    }

    public static void main(String[] args) {
        EmployeeModule Module1 = new EmployeeModule();
        System.out.println(Module1.firstName+"" +Module1.lastName);


    }



        }



