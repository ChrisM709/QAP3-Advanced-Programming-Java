abstract class Shape {
    protected String name;


    //constructor
    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    //getters 
    public String getName(){
        return name;
    }

    //setters
    public void setName(String name){
        this.name= name;
    }

    @Override
    public String toString() {
        return name + " - Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}