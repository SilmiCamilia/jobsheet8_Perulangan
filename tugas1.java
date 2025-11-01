import java.util.Scanner;
public class tugas1 {
    public static void mimi(int N) {
        if (N < 3) {
            System.out.println("Nilai N minimal 3");
            return;
        }
        String numersz = String.valueOf(N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(numersz + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner nyecan = new Scanner(System.in);
        String inputUlang = "ya"; 
        System.out.println("--- Pola Persegi Angka Berulang ---");

        do {
            System.out.print("\nMmsukkan nilai N persegi (minimal 3): ");
            if (nyecan.hasNextInt()) {
                int N = nyecan.nextInt();
                nyecan.nextLine(); 
                
                System.out.println("\npola untuk N = " + N + ":");
                mimi(N);
                
            } else {
                System.out.println("input tidak valid, masukkan angka untuk N.");
                nyecan.nextLine(); 
                
                continue; 
            }
            System.out.print("\nApakah Anda ingin membuat persegi lain? (ya/tidak): ");
            inputUlang = nyecan.nextLine().toLowerCase();
            
        } while (inputUlang.equals("ya"));

        System.out.println("\nprogram selesai yh");
}
}
