/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPraktium;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class LatihanPraktikum2 {
    public static void coba2(){
        int cari;
        boolean found = false;
        int [] angka = new int []{8,90,56,90,87,76,40};
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Silahkan masukkan data yang akan anda cari! ");
        cari = keyboard. nextInt ();
        for (int i = 0; i < angka.length; i++) {
            if (cari == angka [i]){
                found = true;
                System.out.println("Data ditemukan di indeks ke-"+ i);
            
        }
        }
        if (found != true){
            System.out.println("Data tidak ditemukan!\nsilahkan coba lagi dengan memasukkan data lainnya");
        }
    }
    public static void main(String[] args) {
        coba2();

    }
}
