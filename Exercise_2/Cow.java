package Exercise_2;

public class Cow extends Animal{

    Cow(){
        super();
    }
    
    Cow(String name, String type){
        super(name, type);
    }

    public void speak(){
        System.out.println("Mooo");
    }

    public void eat(){
        System.out.println("Got any grass?");
    }
}
