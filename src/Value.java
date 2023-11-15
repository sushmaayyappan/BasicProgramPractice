public class Value extends Add {
    @Override
    public int value(int a){
        super.value(a);
        return a;
    }

    @Override
    public void sub(int a, int b) {
        super.sub(a, b);
    }
}
