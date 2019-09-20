/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;


/**
 *
 * @author Agnes Juliana
 */
public class Nomor3 {
    public static void jawaban3(){
        //deklarasi variable yang digunakan
        int sisabagi=0;
        
        
        //Membuat array
        int[]angka=new int[] {92,98,76,72,84,101,39};
        
        //menampilkan array 
        System.out.println("nilai pada array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]+"\t");
            
        }
        //menampilkan bilangan kelipatan 3
        System.out.println("\nNilai yang merupakan kelipatan 3:");
        for (int i = 0; i < 10; i++) {
            if (angka[i]%3==0){
                System.out.println(angka [i]);
            }
        }
    }
    
    public static void main(String[] args) {
        jawaban3();
    }
    
    
}
