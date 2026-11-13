package encapsulation.example;

public class MainEncapsulation {
    public static void main(String[] args){

        Teacher teacher1 = new Teacher();

        teacher1.setId(101);
        teacher1.setName("Deepika");
        teacher1.setEmail("deepika@gmail.com");
        teacher1.setQualification("Msc");
        teacher1.setSalary(30000.00);

        System.out.println("teacher1 name is : "+ teacher1.getName());
    }
}
