class Animal {
    public void animalType(){}
    public void property(){
        System.out.println("I have two eyes, four legs, one tail.");
    }
    public void sound() {}
}

class Dog extends Animal {
    @Override
    public void animalType(){
        System.out.println("I am a Dog.");
    }
    @Override
    public void sound() {
        System.out.println("My sound is bhow....bhow...");
    }
}

class Cat extends Animal {
    @Override
    public void animalType(){
        System.out.println("I am a Cat.");
    }
    @Override
    public void sound() {
        System.out.println("My sound is meow....meow...");
    }
}
class Cow extends Animal {
    @Override
    public void animalType(){
        System.out.println("I am a Cow.");
    }
    @Override
    public void sound(){
        System.out.println("My sound is mow....mow.....");
    }  
}