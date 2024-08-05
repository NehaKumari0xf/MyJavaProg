import java.util.ArrayList;
class Student{
    private String name;
    private int roll;
    public Student()
    {
        name="Noname";
        roll=0;
    }
    public Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    @Override
    public String toString()
    {
        return name+" - "+roll;
    }
}

public class arrayList
{
    public static void main(String...args)
    {
        ArrayList<String> names=new ArrayList<String>();
        names.add("Kajal Kumari");
        names.add("Neha Kumari");
        names.add("Manish Kumar");
        names.add("Rahul Kumar");
        System.out.print("All names are:");
        for(String n:names)
        System.out.println(n);

        ArrayList<Integer> nums=new ArrayList<Integer>();

        nums.add(89);
        nums.add(67);
        nums.add(23);
        nums.add(230);
        nums.add(213);
        System.out.println("All numbers are:");
        for(Integer i:nums)
        System.out.println(i);

        ArrayList<Float> fnums=new ArrayList<Float>();
        fnums.add(56.89f);
        fnums.add(0.9f);
        fnums.add(23.67f);
        System.out.println("All entered float values are:");
        for(Float f:fnums)
        System.out.println(f);

        ArrayList<Student> students=new ArrayList<Student>();
        students.add(new Student("Kajal Kumari",67));
        students.add(new Student("Neha Kumari",12));
        students.add(new Student("Manish Kumar",1));
        students.add(new Student());
        System.out.println("All students:");
        for(Student s:students)
        {
            System.out.println(s);
        }
    }
}