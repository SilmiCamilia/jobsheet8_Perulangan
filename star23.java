import java.util.Scanner;

public class star23 {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N = ");
        int N = star.nextInt();

        for (int i = 1; i <=N; i++) {
            System.out.print("*");
        }
    }
}
