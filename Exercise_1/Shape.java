package Exercise_1;

abstract class Shape{

    protected String color;
    protected Boolean filled;

    public Shape(){};

    public Shape(String color, boolean filled){};

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public boolean isFilled() {
        return filled;
    };

    public void setFilled(boolean filled) {
        this.filled = filled;
    };

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();

}