package Exercise_2;

public class Cat extends Animal{
    
    Cat(){
        super();
    }

    Cat(String name, String type){
        super(name, type);
    }

    public void speak(){
        System.out.println("Meoooow");
    }

    public void eat(){
        System.out.println("MMMMMM......TUNA!!");
    }

    public String toString(){
        return super.toString();
    }

}
