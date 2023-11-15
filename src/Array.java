public class Array {
    public static void main(String[] args) {
       String[][] value = {{"moni", "vani"}, {"vidhu", "vothavakaraayyappan", "venku", "barath"}};
        for (int i = 0; i <value.length; i++) {
            for (int j = 0; j <value[i].length; j++) {
                System.out.println(value[i][j]);
            }
        }
    }
}
