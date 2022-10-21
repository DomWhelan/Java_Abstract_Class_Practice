package Exercise_2;

abstract class Animal {

    protected String name;
    protected String type;

    public Animal(){};

    public Animal(String nameOfAnimal, String type){
        this.name = nameOfAnimal;
        this.type = type;
    };

    abstract void speak();

    abstract void eat();

    public String toString(){
        return "This animal is a " + type + " named " + name;
    }
}
