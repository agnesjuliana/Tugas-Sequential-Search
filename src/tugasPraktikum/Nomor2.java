/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Agnes Juliana
 */
public class Nomor2 {

    public static void jawaban2() {

        //Deklarasi variable yang dipakai
        float average;
        int jumlah = 0;
        int i = 0;

        //pembuatan array 
        int[] nilai = new int[]{83, 76, 45, 90, 85, 80, 78, 74};

        System.out.println("Data pada array:");

        for (i = 0; i < nilai.length; i++) {
            jumlah = jumlah + nilai[i];
            System.out.print(nilai[i] + "\t");

        }
        //menampilkan hasil rata rata
        average = jumlah / i;
        System.out.println("\nRata-rata nilai array " + average);
        System.out.println("Nilai yang diatas rata-rata");

        for (int j = 0; j < nilai.length; j++) {
            if (nilai[j] > average) {
                System.out.print(nilai[j] + "\t");
            }

        }

    }

    public static void main(String[] args) {
        jawaban2();
    }

}
