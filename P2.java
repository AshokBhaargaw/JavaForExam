public class P2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 36; i++) {
            System.out.print(i + "\t");
            if (i == 10 || i == 20 || i == 30) {
                System.err.println();
            }
        }
    }
}
