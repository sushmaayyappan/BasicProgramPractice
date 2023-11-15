public class Tester {
    public static void main(String[] args) {
        System.out.println("Add(10,20):"+Calculator.Operations.add(10,20));
        System.out.println("Multiple(10,20):"+Calculator.Operations.multiply(10,20));

        Vehicle vehicle2w=new Vehicle();
        vehicle2w.setType("2 Wheeler");
        Vehicle.sale_colume=20;


        Vehicle vehicle4w=new Vehicle();
        vehicle4w.setType("4 Wheeler");
        Vehicle.sale_colume++;
        System.out.println("Sale Volume:"+Vehicle.sale_colume);
    }
}
