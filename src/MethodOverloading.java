import javax.naming.Name;

public class MethodOverloading {
    String firstName="BAKLA";
    String lastName= "JI";
    String middleName = "Ji";



    public void conc() {
        String name = firstName + middleName + lastName;
        System.out.println("merging:" + name);
    }

        public void userName(String un){
            System.out.println("Method1:" + un);


        }
        public void userId(String uid){
            System.out.println("Method2:" +uid);
        }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.userName("Bala");
        mo.userId("001");
        mo.conc();
    }
}
