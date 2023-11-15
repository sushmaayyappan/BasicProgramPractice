public class Square extends Shape {


    @Override
    public double area() {
        area=10*10;
        return area;
    }
    @Override
    public void color(){
        System.out.println("blue");
    }
}
