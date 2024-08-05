import java.util.ArrayList;
public class arrayList2{
    public static void main(String...args) {
        //PRINT DATA STRING TYPE
        ArrayList<String> pdetails = new ArrayList<String>();
        pdetails.add("Name: Neha Kumari");
        pdetails.add("Father's Name: Anil Kumar");
        pdetails.add("Mothers Name: Manju Devi");
        pdetails.add("Address: A.P.Colony, Gaya | Bihar");
        //traverse data
        for(String s : pdetails){
            System.out.println("String Data"+s);
        }

        //Print data of integer type
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        //traverse data
        for(Integer i : numbers){
            System.out.println("Integer Types Data"+numbers);
        }

        //Print data of float type
        ArrayList<Float> fnum = new ArrayList<>();
        fnum.add(20.4f);
        fnum.add(10.0f);
        fnum.add(30.54f);
        fnum.add(44.00f);
        //traverse data
        for (Float float1 : fnum) {
            System.out.println("Float Type Data"+fnum);
        }

    }
}