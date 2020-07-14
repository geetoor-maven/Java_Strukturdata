
package Array;

import java.util.Scanner;


public class Aplikasi {


    public static void main(String[] args) {
        
        // Inialisasi semua variabel
        boolean kondisi = false;
        int data,pilihan;
        String merek;
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("--------------------------- INPUT DATA MOBIL---------------------------");
         System.out.println("_________________________________");
         System.out.print("-- Berapa merek mobil sekarang : ");
         data = input.nextInt();
         Mobil [] mobil = new Mobil[data];
        
//        System.out.println("_________________________________");
//        System.out.println("-------- SEMUA MEREK MOBIL ---------");
//        System.out.println("_________________________________");
//        
//        for(int i = 0; i<mobil.length; i++){
//            System.out.println("-- Merek mobil ke "+(i+1)+" : "+mobil[i].getMerek());
//        }
        
        while(kondisi == false){
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input Data Mobil  ");
            System.out.println("2. Tampil Data Mobil  ");
            System.out.println("3. Hapus Data Mobil  ");
            System.out.println("4. Cari Data Mobil  ");
            System.out.println("0. Keluar Program ");
            System.out.print("Masukan Menu Pilihan[1,2,3,4,5,6] : ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                
                case 1:
                           System.out.println("_________________________________");

                                    for(int i = 0; i<mobil.length; i++){
                                        System.out.print("-- Merek Ke "+(i+1)+" : ");
                                        merek = input.next();
                                        mobil[i] = new Mobil();
                                        mobil[i].setMerek(merek);
                                    }
                           System.out.println("_________________________________");         
                           break;
                           
                case 0:
                            kondisi = true;
                            System.out.println("--------------- TERIMA KASIH ------------------");
                            System.out.println("------- develop by : agus kurniawan --------");
                default:
                            System.out.println("-----------MAAF INPUTAN TIDAK TERSEDIA----------");
            
            } // akhir pilihan
            
        }// akhir while
        
        
    }
    
}
