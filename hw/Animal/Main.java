public class Main {
    public static void main(String...args) {
        Dog myDog=new Dog();
        Cat myCat=new Cat();
        Cow myCow=new Cow();

        myDog.animalType();
        myDog.property();
        myDog.sound();
        
        myCat.animalType();
        myCat.property();
        myCat.sound();

        myCow.animalType();
        myCow.property();
        myCow.sound();

    }
}
