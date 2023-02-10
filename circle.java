package Shapes;
class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){this.radius = radius;}

    public Circle(double radius , String color , boolean filled){
        super(color , filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return ((int)(Math.PI * radius * radius * 100))/100.0;
    }

    public double getPerimeter(){
        return (int)(2 * Math.PI * radius * 100) /100.0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
