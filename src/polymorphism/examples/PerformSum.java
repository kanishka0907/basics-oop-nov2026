package polymorphism.examples;

public class PerformSum {
    public void sum(int a,int b){
        System.out.println("Sum of two int numbers is: "+(a+b));
    }

    public void sum(int a,int b,int c){
        System.out.println("Sum of three int numbers is: "+(a+b+c));
    }
}
