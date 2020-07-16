
package Array;

import java.util.Scanner;


public class Aplikasi {


    public static void main(String[] args) {
        
        // Inialisasi semua variabel
        boolean kondisi = false;
        int data,pilihan;
        String merek,hapusmerek,carimerek;
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("--------------------------- INPUT DATA MOBIL---------------------------");
         System.out.println("_________________________________");
         System.out.print("-- Berapa merek mobil sekarang : ");
         data = input.nextInt();
         System.out.println("_________________________________");
         
         Mobil [] mobil = new Mobil[data];
        
        while(kondisi == false){
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input Data Mobil  ");
            System.out.println("2. Tampil Data Mobil  ");
            System.out.println("3. Hapus Data Mobil  ");
            System.out.println("4. Cari Data Mobil  ");
            System.out.println("0. Keluar Program ");
            System.out.print("Masukan Menu Pilihan[1,2,3,4,5,0] : ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                
                case 1:
                           System.out.println("_________________________________");
                           System.out.println("-------- INPUT MEREK MOBIL -----------");
                           System.out.println("_________________________________");

                                    for(int i = 0; i<mobil.length; i++){
                                        System.out.print("-- Merek Ke "+(i+1)+" : ");
                                        merek = input.next();
                                        mobil[i] = new Mobil();
                                        mobil[i].setMerek(merek);
                                    }
                           System.out.println("_________________________________");         
                           break;
                
                case 2:
                            System.out.println("_________________________________");
                            System.out.println("-------- SEMUA MEREK MOBIL ---------");
                            System.out.println("_________________________________");
                                
                                    for(int i = 0; i<mobil.length; i++){
                                            System.out.println("-- Merek mobil ke "+(i+1)+" : "+mobil[i].getMerek());
                                    }
                                    
                            System.out.println("_________________________________");         
                           break;
                 
                case 3:
                            System.out.println("_________________________________");
                            System.out.println("-------- HAPUS MEREK MOBIL ---------");
                            System.out.println("_________________________________");
                            System.out.print("-- Masukan merek mobil yang ingin dihapus : ");
                            hapusmerek = input.next();
                            
                                    for(int i = 0; i<mobil.length; i++){
                                            
                                            if(hapusmerek.equals(mobil[i].getMerek())){
                                                       for(int j = i; j<mobil.length-1; j++){
                                                           mobil[j] =  mobil[j+1];
                                                       }
                                                       break;
                                            }
                                    }
                                    for(int i =0; i<mobil.length-1; i++){
                                         System.out.println("-- Merek mobil ke "+(i+1)+" : "+mobil[i].getMerek());
                                    }
                             System.out.println("_________________________________");
                            break;
                            
                case 4:
                            System.out.println("_________________________________");
                            System.out.println("-------- CARI MEREK MOBIL -------------");
                            System.out.println("_________________________________");
                            System.out.print("-- Masukan merek mobil yang ingin dicari : ");
                            carimerek = input.next();
                            
                                    for(int i = 0; i<mobil.length; i++){
                                        if(carimerek.equals(mobil[i].getMerek())){
                                            System.out.println("Hasil pencarian "+mobil[i].getMerek()+" di temukan");
                                        }else{
                                            System.out.println("Hasil pencarian tidak di temukan");
                                        }
                                    }
                             System.out.println("_________________________________");
                            break;
                            
                case 0:
                            kondisi = true;
                            System.out.println("--------------- TERIMA KASIH ------------------");
                            System.out.println("------- develop by : agus kurniawan --------");
                            break;
                default:
                            System.out.println("-----------MAAF INPUTAN TIDAK TERSEDIA----------");
            
            } // akhir pilihan
            
        }// akhir while
        
        
    }
    
}
