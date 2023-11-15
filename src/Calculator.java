public class Calculator
{
    static class Operations {
        public static Integer add(Integer a, Integer b) {
            return (a + b);
        }

        public static Integer multiply(Integer a, Integer b) {
            System.out.println("This is version1");
            return (a * b);
        }
    }
}
