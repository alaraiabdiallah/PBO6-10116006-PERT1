package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program untuk mempelajari deklarasi variabel
 * */
public class Main {

    public static void main(String[] args) {
	    //Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; // konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;

        //Memberi nilai ke variabel
        nilaiInt = 90;
        nilaiLogika = false;
        nilaiKarakter = 'D';

        // Menampilkan Hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel karakter = " + nilaiKarakter);
    }
}
