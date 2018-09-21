package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program untuk belajar tentang static dan konstanta
 * */


public class KambingStatic {

    public static final String NAMA_KAMBING = "JAKA";

    public static void main(String[] args) {
	    Mamalia.jumlahKambing = 500000;
	    System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "+ Mamalia.jumlahKambing);
    }
}
