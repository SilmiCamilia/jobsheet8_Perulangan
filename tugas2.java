import java.util.Scanner;

public class tugas2 {
    
    public static void kelolaData() {
        Scanner datahh = new Scanner(System.in);
        
        int jumlahPoliteknik = 0;
        String namaPoliteknik;
        String namaAtlet;
        String cabangSaatIni = ""; 
        
        String daftarNamaAtlet = "";  
        int grandTotalAtlet = 0;

        System.out.println("--- Data Atlet Porseni ---");
        
        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        
        if (datahh.hasNextInt()) {
            jumlahPoliteknik = datahh.nextInt();
            datahh.nextLine(); 
        } else {
            System.out.println("Input tidak valid, Program dihentikan.");
            return;
        }

        if (jumlahPoliteknik < 1) {
            System.out.println("Jumlah Politeknik harus minimal 1. Program dihentikan.");
            return;
        }

        System.out.println("\n" + "=".repeat(60));
        System.out.println("               input data atlet mulai");
        System.out.println("=".repeat(60));

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.print("\nMasukkan nama Politeknik ke-" + i + ": ");
            namaPoliteknik = datahh.nextLine();
            
            System.out.println("--- Input Atlet untuk " + namaPoliteknik.toUpperCase() + " ---");
            
            for (int c = 1; c <= 4; c++) {
                
                switch (c) {
                    case 1:
                        cabangSaatIni = "Badminton";
                        break;
                    case 2:
                        cabangSaatIni = "Tenis Meja";
                        break;
                    case 3:
                        cabangSaatIni = "Basket";
                        break;
                    case 4:
                        cabangSaatIni = "Bola Voly";
                        break;
                }
                
                System.out.println("\nCabang: " + cabangSaatIni.toUpperCase());
                
                for (int k = 1; k <= 5; k++) { 
                    System.out.print("  > Masukkan nama atlet ke-" + k + ": ");
                    namaAtlet = datahh.nextLine();
                    
                    daftarNamaAtlet += "    - " + namaAtlet + " | Cabang: " + cabangSaatIni + " | Asal: " + namaPoliteknik + "\n";
                    
                    grandTotalAtlet++;
                }
            }
        }
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("              Tampilan Data Atlet Porseni");
        System.out.println("=".repeat(60));
        
        System.out.println("Jumlah Politeknik yang berpartisipasi: " + jumlahPoliteknik);
        System.out.println("Total Keseluruhan Atlet yang Diinput: " + grandTotalAtlet);
        
        System.out.println("\n--- DAFTAR LENGKAP ATLET ---");
        System.out.print(daftarNamaAtlet);

        int totalPerCabang = jumlahPoliteknik * 5;
        
        System.out.println("\n--- Perkiraan Total Atlet Berdasarkan Cabang ---");
        System.out.println("BADMINTON: " + totalPerCabang + " Atlet");
        System.out.println("TENIS MEJA: " + totalPerCabang + " Atlet");
        System.out.println("BASKET: " + totalPerCabang + " Atlet");
        System.out.println("VOLY: " + totalPerCabang + " Atlet");
        System.out.println("=".repeat(60));
    }

    public static void main(String[] args) {
        kelolaData();
    }
}