public class P6{
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("enter 2 number"); 
            return; 
        }

        int firstNumber = Integer.parseInt(args[0]);
        int lastNumber = Integer.parseInt(args[1]);

        if(firstNumber >= lastNumber){
            System.out.println("first Number must be less then the last number");
            return;
        }

        System.out.println("Prime numbers between " + firstNumber + " and " + lastNumber + ":");
        for(int i = firstNumber; i <= lastNumber; i++ ){
            if(isPrimeNumber(i)){
                System.out.print(i + ", ");
            }
        }
    }

    static boolean isPrimeNumber(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}