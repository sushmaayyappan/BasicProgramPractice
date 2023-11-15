public abstract class Shape {
    public double area;
    public abstract double area();
    final void Shape(){
        System.out.println("this is abstract");
    }
    public void color(){
        System.out.println("the color is white");
    }
    public void main(){
        System.out.println("this is main");
    }

}
