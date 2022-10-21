package Exercise_2;

public class AnimalTest {

    public static void main(String[] args) {
        
        Animal c = new Cat("Fluffy", "cat");
        System.out.println(c.toString());
        c.speak();
        c.eat();
        

        Dog d = new Dog("Spot", "dog");
        System.out.println(d.toString());
        d.speak();
        d.eat();

        Cow c2 = new Cow("Bessy", "cow");
        System.out.println(c2.toString());
        c2.speak();
        c2.eat();

    }
    
}
