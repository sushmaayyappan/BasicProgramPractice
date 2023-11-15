public class Polymorphism {
    public static void main(String[] args) {
       /* Mutiply mulObj=new Mutiply();
        System.out.println(mulObj.multiplyValue(2,3));
        System.out.println(mulObj.multiplyValue(2.0,5.6));
        System.out.println(mulObj.multiplyValue(1,2,4));*/

       Tree tre=new Tree();

       tre=new BananaTree();
       tre.tree();

       tre=new MangoTree();
       tre.tree();
    }
}
