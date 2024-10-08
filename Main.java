package Modul3Nomer3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Truk");
        
        int pilihan = scanner.nextInt();
        
        Kendaraan kendaraan;
        
        if (pilihan == 1) {
            kendaraan = new Mobil();  
        } else if (pilihan == 2) {
            kendaraan = new Motor();  
        } else if (pilihan == 3) {
            kendaraan = new Truk();
        } else {
            System.out.println("Pilihan tidak valid.");
            return; 
        }
        
       
        kendaraan.bergerak();
        
        kendaraan.kecepatanMaksimum();

        kendaraan.kapasitasMuatan();
    }
}

