package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program untuk belajar tentang global variabel
 * */
public class KambingGlobal {
    // Variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 100;

    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: "+ jumlahKambing);
    }

    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
	    KambingGlobal kambingSusu = new KambingGlobal();

	    //Menampilkan jumlah kambing yang ada saat program pertama x berjalan

        kambingSusu.getJumlahKambing();

        //Menambah 5 kambing
        kambingSusu.tambahKambing();
    }
}
