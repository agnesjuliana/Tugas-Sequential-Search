/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Agnes Juliana mencari data dan mencari banyak data tersebut dalam
 * array
 */
public class Nomor1 {

    public static void jawaban1() {
        //Deklarasi variable yang dipakai
        int cari;
        boolean ditemukan = true;
        int a=0;

        //membentuk array yang berisi data
        int[] angka = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        
        //mengeluarkan array
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka [i]+"\t");

            
        }


        //meminta user memasukkan angka yang hendak dicari
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nMasukkan angka yang ingin anda cari dibawah sini");
        cari = keyboard.nextInt();

        //proses pencarian atau pencocokan data pada array
        for (int i = 0; i < angka.length; i++) {
            if (cari == angka[i]) {
                ditemukan = true;
                
                System.out.println("Angka yang anda masukkan ada didalam data ini");
                
                break;
            }

        }
        //proses hitung data
        if (ditemukan == true) {
            
            for (int i = 0; i < angka.length; i++) {
                if (angka[i]== cari){
                    a++;
                }
                
            }

        }
        
        System.out.println("Selamat data anda dengan angka "+cari+ " ditemukan sebanyak "+a);
    }
    
    public static void main(String[] args) {
        jawaban1();
    }

}
