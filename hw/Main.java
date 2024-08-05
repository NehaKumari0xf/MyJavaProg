import java.util.Scanner;
public class Main {
    public static void main(String...args) {
        String name, gen, mob, clas;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-----------------------------------------");
        System.out.println("Please Enter Student's Detail Below:");
        System.out.println("\n-----------------------------------------");
        // Accept input from user
        System.out.print("Enter Name: ");
        name=sc.nextLine();

        System.out.print("Enter Gender: ");
        gen=sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        mob=sc.nextLine();

        System.out.print("Enter Class: ");
        clas=sc.nextLine();

        // now we create a student obj
        Student s=new Student(name, gen, mob, clas);

        System.out.print("\n-----------------------------------------");
        System.out.println("\n\tStudent Detail:");
        System.out.println("-----------------------------------------");
        System.out.println("Name: " + s.getName());
        System.out.println("Gender: " + s.getGender());
        System.out.println("Mobile: " + s.getMobile());
        System.out.println("Class: " + s.getClas());
        System.out.println("\n------------------x-----------------------");
    }
}
