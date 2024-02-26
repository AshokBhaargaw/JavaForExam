import java.util.Scanner;

public class P5{
    public static void main(String[] agrs) {
        int Salery;
        double tax;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Salery: ");
        Salery = sc.nextInt();

        if(Salery <= 10000){
            System.out.println("Kuchh kama bhosdike, kya taxt dega tu is pe");
    }
        else if(Salery >= 10000 && Salery <= 1_000_000  ){
            tax = Salery * 0.10;
            System.out.println("Text lagega re baba, "+ Salery + " pe " + tax + " lagega.");
    }
        else{
            tax = Salery * 0.20;
            System.out.println("Text lagega re baba, bahut lagega. "+ Salery + " pe " + tax + " lagega.");
    }
    }
}