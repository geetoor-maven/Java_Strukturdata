
package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Aplikasi {

   
    public static void main(String[] args) {
        System.out.println("__________________________________________________________________________________________");
        System.out.println("--------------------------- DATA KEPEMILIKAN KENDARAAN MOBIL ---------------------------");
        System.out.println("__________________________________________________________________________________________");
        
        int pilihan;
        boolean kondisi = false;
        
        String merekmobil;
        String namapemilik;
        Integer tahunkeluar;
        Integer harga;
        
        Scanner input = new Scanner(System.in);
        ArrayList<Mobil> mobil = new ArrayList<Mobil>();
        
        while (kondisi == false) {            
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input Data Kepemilikan Mobil : ");
            System.out.println("2. Tampil Data Kepemilikan Kendaraan Mobil : ");
            System.out.println("3. Hapus Data Kepemilikan Mobil : ");
            System.out.println("4. Cari Data Kepemilikan Mobil : ");
            System.out.println("5. Keluar ");
            System.out.print("Masukan Menu Pilihan[1,2,3,4,5] : ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                
                  case 1:
                      // input data
                      break;
                  
                  case 2:
                      // tampil data
                      break;
                   
                  case 3:
                      // hapus data
                      break;
                      
                  case 4:
                      // cari data
                      break;
                  
                  case 5:
                      kondisi = true;
                      System.out.println("__________________________________________________________________________________________");
                      System.out.println("------------------------ TERIMA KASIH , SILAHKAN BERISTIRAHAT YAH ------------------------");
                      System.out.println("__________________________________________________________________________________________");
                      break;
                      
                  default:
                      System.out.println("__________________________________________________________________________________________");
                      System.out.println("------------------------ MAAF MENU INPUTAN TIDAK ADA  ------------------------");
                      System.out.println("__________________________________________________________________________________________");


            }
        }
        
    }
    
}
