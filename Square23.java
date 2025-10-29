import java.util.Scanner;

public class Square23 {
    public static void main(String[] args) {
        Scanner starz = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = starz.nextInt();

        for (int outer = 1; outer <=N; outer++) {
            
        
        for (int i = 1; i <=N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}