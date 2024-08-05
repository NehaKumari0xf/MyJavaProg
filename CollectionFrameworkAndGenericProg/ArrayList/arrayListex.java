import java.util.ArrayList;

public class arrayListex {
        public static void main(String...ar)
        {
            ArrayList<String> list1=new ArrayList();
            ArrayList<String> list2=new ArrayList(5);
    
            System.out.println("Size of list1="+list1.size());
            System.out.println("Size of list2="+list2.size());
    
            list1.add("Kajal Kumari");
            list1.add("Neha Kumari");
            list1.add("Anshu Mala");
            list1.add("Rekha Kumari");
    
            System.out.println("Size of list1="+list1.size());
            System.out.println("Size of list2="+list2.size());
    
            list2.add("Rahul Kumar");
            list2.add("Manish Kumar");
            list2.add("Ankit Kumar");
    
            list1.add(0,"Rakhi Kumari");
    
            System.out.println("Content of list1:");
            for(int i=0;i<list1.size();i++)
            {
                System.out.println(list1.get(i));
            }
    
            System.out.println("\ncontent of list2:");
            
            for(String name:list2)
            System.out.println(name);
    
            list1.remove(0);
            System.out.println("Content of list1(After removing):");
            for(int i=0;i<list1.size();i++)
            {
                System.out.println(list1.get(i));
            }
    
            list1.remove("Kajal Kumar");
            System.out.println("Content of list1(After removing):");
            for(int i=0;i<list1.size();i++){
                System.out.println(list1.get(i));
            }
            list1.clear();
    
            if(list1.isEmpty())
            System.out.println("List1 is empty");
            else 
            System.out.println("List1 is not empty");
    
            if(list2.isEmpty())
            System.out.println("List2 is empty");
            else
            System.out.println("List2 is not empty");
    
            //create arraylist with arraylist
            //copying
            ArrayList<String> list3=new ArrayList<String>(list2);
            System.out.println("Size of list3="+list3.size());
            System.out.println("Content of list3=");
            for(String name:list3)
            System.out.println(name);
    
            ArrayList<String> list4=list2;
            list2.remove(1);
            System.out.println("Content of list2=");
            for(String name:list2)System.out.println(name);
            System.out.println("content of list3=");
            for(String name:list3)System.out.println(name);
    
            //Creating ArrayList with array
            String namesArray[]={"Ravi Kumar","Anil Singh","Suresh Prasad","Ramesh Kumar"};
            ArrayList<String> bnames=new ArrayList<String>();
            for(String name:namesArray)
            bnames.add(name);
    
            System.out.println("content of Array:");
            for(String name:namesArray)System.out.println(name);
    
            System.out.println("Content of list(bnames):");
            for(String name:bnames)System.out.println(name);
    
            //Convertin ArrayList to array
            String arrayEx[]=new String[list2.size()];
            list2.toArray(arrayEx);
            System.out.println("content of array arrayEx:");
            for(String name:arrayEx)System.out.println(name);   
    
        }
    }