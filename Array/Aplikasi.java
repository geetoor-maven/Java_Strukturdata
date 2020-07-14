
package Array;

import java.util.Scanner;


public class Aplikasi {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("_________________________________");
        System.out.print("-- Berapa merek mobil sekarang : ");
        
        int data = input.nextInt();
        
        Mobil [] mobil = new Mobil[data];
        System.out.println("_________________________________");
        
        for(int i = 0; i<mobil.length; i++){
            System.out.print("-- Merek Ke "+(i+1)+" : ");
            String merek = input.next();
            mobil[i] = new Mobil();
            mobil[i].setMerek(merek);
        }
        
        System.out.println("_________________________________");
        System.out.println("-------- SEMUA MEREK MOBIL ---------");
        System.out.println("_________________________________");
        
        for(int i = 0; i<mobil.length; i++){
            System.out.println("-- Merek mobil ke "+(i+1)+" : "+mobil[i].getMerek());
        }
    }
    
}
