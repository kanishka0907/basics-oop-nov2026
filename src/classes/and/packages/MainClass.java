package classes.and.packages;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Hello all,Welcome to Spring1 module!!") ;

        Student student1 = new Student();
        System.out.println("student1 before assigning values is: "+student1) ;

        student1.id=101;
        student1.name="Ajay";
        student1.email="ajay.k@gmail.com";
        student1.dob="12/12/2001";
        student1.grade="10th";

        System.out.println("student1 after assigning values is: "+student1) ;

        Student student2 = new Student((123), "Vijay", "vijay@gmail.com", "12/12/2012", "8th");
        System.out.println("student2 is :"+student2);
    }
}
