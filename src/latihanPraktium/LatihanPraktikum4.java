/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPraktium;
import java.util.Scanner;

/**
 *
 * @author Agnes Juliana
 */
public class LatihanPraktikum4 {
    
    public static void utama4(){
    Scanner keyboard = new Scanner (System.in);
    String cari;
    System.out.print("Masukkan sebuah kata/ kalimat yang hendak anda temukan: ");
    cari = keyboard.nextLine();
    
    int a = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a'){
                a++;
            }
            
        }
        System.out.println("Jumlah huruf a pada kalimat yang anda masukkan adalah "+ a);
    }
    
    public static void main(String[] args) {
        utama4();
    }
}
