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
    private static void Teknologi(){
        Buku buku1 = new Buku("Buku Teknologi 1", new ArrayList<String>(), "UB");
        Buku buku2 = new Buku("Buku Teknologi 2", new ArrayList<String>(), "UB");
        Buku buku3 = new Buku("Buku Teknologi 3", new ArrayList<String>(), "UB");

        buku1.addPenulis(buku1, "Nunu");
        buku2.addPenulis(buku2, "Nunu");
        buku3.addPenulis(buku3, "Nunu");

        buku1.tampilkanBuku();
        buku2.tampilkanBuku();
        buku3.tampilkanBuku();
    }
    private static void Sejarah(){
        Buku buku1 = new Buku("Buku Sejarah 1", new ArrayList<String>(), "UB");
        Buku buku2 = new Buku("Buku Sejarah 2", new ArrayList<String>(), "UB");
        Buku buku3 = new Buku("Buku Sejarah 3", new ArrayList<String>(), "UB");

        buku1.addPenulis(buku1, "Nunu");
        buku2.addPenulis(buku2, "Nunu");
        buku3.addPenulis(buku3, "Nunu");

        buku1.tampilkanBuku();
        buku2.tampilkanBuku();
        buku3.tampilkanBuku();
    }
    private static void Filsafat(){
        Buku buku1 = new Buku("Buku Filsafat 1", new ArrayList<String>(), "UB");
        Buku buku2 = new Buku("Buku Filsafat 2", new ArrayList<String>(), "UB");
        Buku buku3 = new Buku("Buku Filsafat 3", new ArrayList<String>(), "UB");

        buku1.addPenulis(buku1, "Nunu");
        buku2.addPenulis(buku2, "Nunu");
        buku3.addPenulis(buku3, "Nunu");

        buku1.tampilkanBuku();
        buku2.tampilkanBuku();
        buku3.tampilkanBuku();
    }
    private static void Fiksi(){
        Buku buku1 = new Buku("Buku Fiksi 1", new ArrayList<String>(), "UB");
        Buku buku2 = new Buku("Buku Fiksi 2", new ArrayList<String>(), "UB");
        Buku buku3 = new Buku("Buku Fiksi 3", new ArrayList<String>(), "UB");

        buku1.addPenulis(buku1, "Nunu");
        buku2.addPenulis(buku2, "Nunu");
        buku3.addPenulis(buku3, "Nunu");

        buku1.tampilkanBuku();
        buku2.tampilkanBuku();
        buku3.tampilkanBuku();
    }

    private static void TestPenulis(){
        System.out.println("Test Penulis");
        Buku buku1 = new Buku("Buku Fiksi 1", new ArrayList<String>(), "UB");
        buku1.addPenulis(buku1, "Nunu");
        buku1.addPenulis(buku1, "Cantik");
        buku1.addPenulis(buku1, "Sekali");
        buku1.addPenulis(buku1, "Tiada");
        buku1.addPenulis(buku1, "Banding");
        buku1.addPenulis(buku1, "Nunu Terlalu menghalu");
        buku1.tampilkanBuku();
    }
    public static void main(String[] args) {
        Teknologi();
        Sejarah();
        Filsafat();
        Fiksi();
        TestPenulis();
    }
}