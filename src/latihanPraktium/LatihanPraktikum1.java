/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPraktium;

import java.util.Scanner;

/**
 *
 * @author Agnes JUliana
 */
public class LatihanPraktikum1 {

    public static void utama1() {
        int cari;
        boolean found = false;
        int[] data = new int[]{29, 4, 10, 94, 96}; //data array bertipe int
        Scanner input = new Scanner(System.in);  //membuat objek pembacaan 
        System.out.println("Masukkan data angka yang ingin dicari");
        cari = input.nextInt();
        for (int i = 0; i < data.length; i++) {
            if (cari == data[i]) {
                found = true;
                break;
            }

        }
        if (found == true) {
            System.out.println("Data ditemukan ya!");
        } else {
            System.out.println("Maaf, Data tidak ditemukan! ");
        }
    }

    public static void challenge1() {
        String cari;
        boolean found = false;
        String[] nama = new String[]{
            "Iqbal", "Amanda", "Billy", "Laili", "Haidar"}; //data array bertipe String
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data nama yang ingin dicari");
        cari = input.nextLine();
        for (int i = 0; i < nama.length; i++) {
            if (cari.equals(nama[i])) {
                found = true;
                break;
            }
        }
         if (found == true) {
            System.out.println("Data ditemukan ya!\n"+cari+ " Merupakan teman yang ada didekat Agnes");
        } else {
            System.out.println("Maaf, Data tidak ditemukan!\n "+cari+ " Mungkin tidak duduk di dekat Agnes");
        }
    }
    
    public static void main(String[] args) {
        utama1();
        
        System.out.println(" ");
        System.out.println("===========================================");
        System.out.println(" ");
        
        challenge1();
    }
}
