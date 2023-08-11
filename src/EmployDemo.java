public class EmployDemo {
    int emp_Id;
    String emp_name;
    String emp_deptname;
    int salary;

   public void method1(){
       System.out.println("class method");

   }

    public static void main(String[] args) {
        EmployDemo employobj1 = new EmployDemo();
        employobj1.emp_Id = 101;
        employobj1.emp_name= "bala";
        employobj1.emp_deptname = "a";
        employobj1.salary = 1500;
employobj1.method1();
        System.out.println(employobj1.emp_Id);
        System.out.println("employee name is  "+employobj1.emp_name);



    }
}
