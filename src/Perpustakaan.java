import java.util.ArrayList; // Untuk ArrayList<String>

class Buku { // Class yang digunakan untuk struktur buku dalam program Perpustakaan ini
    private String nama, penerbit; // Deklarasi untuk Judul Buku dan Nama Penerbit
    private ArrayList<String> penulis; // Deklarasi untuk List Nama Penulis
    private int limitPenulis = 4; // Index 4 untuk <ArrayList> yang memiliki 5 anggota
    
    public Buku(String nama, ArrayList<String> penulis, String penerbit) { // Ini adalah constructor untuk object Buku
        this.penulis = new ArrayList<String>();
        this.nama = nama;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public void addPenulis(Buku buku, String nama){ // Ini adalah method untuk menambahkan penulis
        if (buku.penulis.size() <= limitPenulis){buku.penulis.add(nama);} 
        else {System.out.println("Penulis sudah melebihi batas");}
    }

    public void tampilkanBuku(){ // Ini adalah methodd untuk menampilkan buku
        System.out.println("Buku: " + this.nama);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Penerbit: " + this.penerbit + "\n");
    }
}

public class Perpustakaan{
    public static void main(String[] args) {
        Buku buku1 = new Buku("Buku Teknologi 1", new ArrayList<String>(), "UB");
        buku1.addPenulis(buku1, "Nunu");
        // Ulangi baris 29-30 untuk setiap buku
        System.out.println("Sebelum Tambah Penulis");
        System.out.println("======================");
        buku1.tampilkanBuku();
        // Ulangi baris 32-34 untuk output "Sebelum Tambah" unntuk setiap buku
        System.out.println("Setelah Tambah Penulis");
        System.out.println("======================");
        buku1.addPenulis(buku1, "Cantik");
        buku1.addPenulis(buku1, "Sekali");
        buku1.addPenulis(buku1, "Tiada");
        buku1.addPenulis(buku1, "Banding");
        buku1.addPenulis(buku1, "Nunu Terlalu menghalu"); // Penulis melebihi batas sehingga tak dimasukka
        // Ulangi baris 36-41 untuk output "Setelah Tambah" unntuk setiap buku
        buku1.tampilkanBuku();
        // Ulangi baris 43 untuk tampilkan buku
    }
}