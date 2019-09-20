/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Agnes Julana
 *
 */
public class Nomor4 {

    public static void jawaban4() {
        Scanner keyboard = new Scanner(System.in);
        String cari;
        System.out.print("Masukkan sebuah kata/ kalimat yang hendak anda temukan: ");
        cari = keyboard.nextLine();

        int a = 0;
        int i2 = 0;
        int u = 0;
        int e = 0;
        int o = 0;

        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a') {
                a++;
            }
            if (cari.charAt(i) == 'i') {
                i2++;
            }
            if (cari.charAt(i) == 'u') {
                u++;
            }
            if (cari.charAt(i) == 'e') {
                e++;
            }
            if (cari.charAt(i) == 'o') {
                o++;
            }
        }
        System.out.println("Jumlah huruf a= "+a);
        System.out.println("Jumlah huruf i= "+i2);
        System.out.println("Jumlah huruf u= "+u);
        System.out.println("Jumlah huruf e= "+e);
        System.out.println("Jumlah huruf o= "+o);
        
    }
    
    public static void main(String[] args) {
        jawaban4();
    }
}
