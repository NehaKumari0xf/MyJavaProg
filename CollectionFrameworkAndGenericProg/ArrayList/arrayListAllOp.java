import java.util.ArrayList;
import java.util.Scanner;

public class arrayListAllOp {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        int choice;
        String addElement;
        
       Scanner kb=new Scanner(System.in);

       do{
        System.out.println("Our Services ");
        System.out.println("1. Insert Element");
        System.out.println("2. Add Element");
        System.out.println("3. Delete Element");
        System.out.println("4. Update Element");
        System.out.println("5. Exit");
        System.out.print("Kindly Enter your choice Sir/Mam :");
        choice=kb.nextInt();

        switch (kb) {
            case 1:
            System.out.print("Enter element to insert");
                break;
            case 2:
                System.out.print("Enter element to add in list: ");
                addElement=sc.next();
                list.add(addElement);
                System.out.print("Element added successfully....");
                break;
            
            case 5:
                System.out.print("Exiting the program.");
            default:
            System.out.print("Invalid choice. Please enter valid choice.");
       }
    }while(choice!=5);
    }    
}
