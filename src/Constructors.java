public class Constructors {
    public int len;
    public int hei;
    public int wid;
    public Constructors(){
        System.out.println("Default Constructor");
    }
    public Constructors(int len1,int hei){
        System.out.println("Parameterised Consturctor");
        len=len1;
        this.hei=hei;
    }
    public Constructors(int len,int hei, int wid){
        System.out.println("3 Parameterised Constructor");
        this.len=len;
        this.hei=hei;
        this.wid=wid;
    }
    public Constructors(Constructors con){
        System.out.println("Copy Constructor");
        this.len=len;
        this.hei=hei;
        this.wid=wid;
    }

}
