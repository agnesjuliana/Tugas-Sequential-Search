/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPraktium;

/**
 *
 * @author Agnes Juliana
 * Mencari nilai terkecil sebuah array
 */
public class LatihanPraktikum3 {
    public static void utama3(){
        int min = 0;
        int [] angka= new int []{-21, 33, 90,76, -50, 100};
        System.out.println("data angka pada array");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]+"\t");
            if (angka[i]<min){
                min = angka[i];
            }
            
        }
        System.out.println("\n Data terkecil yang ada di array ini adalah" +min);
    }
    
    
   //Chalenge mencari elemen terbesar
    public static void challenge3(){
        int max = 0;
        int [] angka= new int []{-21, 33, 90,76, -50, 100};
        System.out.println("data angka pada array");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]+"\t");
            if (angka[i]>max){
                max = angka[i];
            }
            
        }
        System.out.println("Data terbesar yang ada di array ini adalah" +max);
    }
    public static void main(String[] args) {
        utama3();
        System.out.println(" ");
        System.out.println("================================================");
        System.out.println(" ");
        challenge3();
    }
}
