public class CallerValues {
    public static void main(String[] args) {
       /* AccessModifiers am=new AccessModifiers();
        int add=am.add(1,2);
        System.out.println("add:"+add);
        String name=am.names("moni","ayyappan");
        System.out.println("name"+name);

        System.out.println("name"+am.names("Vidharth","moni"));*/
        Constructors con=new Constructors();

        Constructors bed=new Constructors(5,10);
        System.out.println("len:"+bed.len);
        System.out.println("hei:"+bed.hei);


        Constructors diwan= new Constructors(4,10,8);
        System.out.println("len:"+diwan.len);
        System.out.println("hei:"+diwan.hei);
        System.out.println("wid:"+diwan.wid);

       Constructors conn=new Constructors(bed);
        System.out.println("len:"+bed.len);
        System.out.println("hei:"+bed.hei);

    }
}
