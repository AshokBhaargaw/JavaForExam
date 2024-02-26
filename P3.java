public class P3 {
    public static void main(String[] args) {
        int i, n = 10, a = 0, b = 1, c;
        System.out.print(a + "," + b + ", ");
        for (i = 0; i < n - 2 ; i++) {
            c = a +b;
            System.out.print(c + ", ");
            a = b;
            b = c; 
        }
    }
}
