public class InterfaceTest {
    public static void main(String[] args){
        Bank ban=new SBIBank();
        System.out.println(ban.rateOfInterest());

        Bank ba=new ICICIBank();
        System.out.println(ba.rateOfInterest());

        Bank bank=new CanaraBank();
        System.out.println(bank.rateOfInterest());
    }
}
