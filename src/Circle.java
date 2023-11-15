public class Circle extends Shape{
    @Override
    public double area() {
        double area=3.14*2*2;
        return area;
    }
    @Override

    public void color() {
        System.out.println("red");
    }
    public void main(){
        System.out.println("thi is sub");
    }

}
