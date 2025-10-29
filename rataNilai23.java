import java.util.Scanner;

public class rataNilai23 {
    public static void main(String[] args) {
        Scanner rata = new Scanner(System.in);
        int i = 1, j;
        float nilai, totalNilai, rataNilai;
        while (i<=5) { 
            System.out.println("Input nilai mahasiswa ke "+i);
            totalNilai=0;
            for(j=1; j<=5; j++){
                System.out.print("Nilai ke-"+j+" =");
                nilai = rata.nextFloat();
                totalNilai+= nilai;
            }
            rataNilai = totalNilai/5;
            i++;
            System.out.println("Rata rata nilai mahasiswa ke "+i+" adalah "+rataNilai);

        }
    }
}
