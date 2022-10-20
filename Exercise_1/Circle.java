package Exercise_1;

public class Circle extends Shape{

    protected double radius;

    public Circle(){};

    public Circle(double radius){
        this.radius = radius;
    };

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    };

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public String toString(){
        return ("Circle [ radius=" + radius + "Color=" + color + "Filled=" + filled);
    }
    
}
