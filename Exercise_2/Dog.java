package Exercise_2;

public class Dog extends Animal{

    Dog(){
        super();
    }

    Dog(String name, String type){
        super(name, type);
    }
    
    public void speak(){
        System.out.println("Bow wow wow");
    }

    public void eat(){
        System.out.println("Throw a dog a bone!");
    }
}
