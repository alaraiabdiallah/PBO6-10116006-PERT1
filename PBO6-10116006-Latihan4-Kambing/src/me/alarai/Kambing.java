package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program untuk mempelajari lokal variabel
 * */
public class Kambing {

    public void tambahKambing() {
        //Deklarasi variable lokal
        int jumlahKambing = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: "+ jumlahKambing);
    }

    public static void main(String[] args) {
	    Kambing kambingJantan = new Kambing();
	    kambingJantan.tambahKambing();
    }
}
