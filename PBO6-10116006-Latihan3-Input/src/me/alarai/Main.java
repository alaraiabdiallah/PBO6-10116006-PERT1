package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program untuk memasukkan nilai dari keyboard
 * */
public class Main {

    public static void main(String[] args) {
	    System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.nextLine();
        System.out.println("Nama anda adalah "+nama);
    }
}
