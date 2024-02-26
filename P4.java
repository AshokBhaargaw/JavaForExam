import java.util.Random;

class P4{
    public static void main(String[] agrs){
        Random rd = new Random();
        int[] arry = new int[4];
        for(int i=0; i < arry.length; i++ ){
            arry[i] = rd.nextInt();
            System.out.println(arry[i]);
        }
    }

}