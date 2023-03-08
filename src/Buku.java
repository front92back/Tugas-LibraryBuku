public class Buku {
    static String nama, penulis[], penerbit;

    public Buku(String nama, String[] penulis, String penerbit) {
        this.nama = nama;
        this.penulis = new String[5];
        this.penerbit = penerbit;
    }

    public static void addPenulis(Buku buku, String nama) {
        for (int i = 0; i < penulis.length; i++) {
            if (buku.penulis[i] == null){
                buku.penulis[i] = " " + nama;
                return;
            }
        }
    }

    public static void tampilkanBuku(Buku buku) {
        System.out.printf
        (
            "\nNama Buku: " + buku.nama +
            "\nNama Penulis: " + String.join(", ", buku.penulis) +
            "\nNama Penerbit: " + buku.penerbit + "\n"
        );
    }

    public static void main(String[] args) throws Exception {
        // Buku 4 Kategori
        Buku[][] buku4Kategori = new Buku[4][3];

        buku4Kategori[0][0] = new Buku("Buku Teknologi 1", penulis, "UB");
        buku4Kategori[0][1] = new Buku("Buku Teknologi 2", penulis, "UB");
        buku4Kategori[0][2] = new Buku("Buku Teknologi 3", penulis, "UB");
        buku4Kategori[1][0] = new Buku("Buku Filsafat 1", penulis, "UB");
        buku4Kategori[1][1] = new Buku("Buku Filsafat 2", penulis, "UB");
        buku4Kategori[1][2] = new Buku("Buku Filsafat 3", penulis, "UB");
        buku4Kategori[2][0] = new Buku("Buku Sejarah 1", penulis, "UB");
        buku4Kategori[2][1] = new Buku("Buku Sejarah 2", penulis, "UB");
        buku4Kategori[2][2] = new Buku("Buku Sejarah 3", penulis, "UB");
        buku4Kategori[3][0] = new Buku("Buku Fiksi 1", penulis, "UB");
        buku4Kategori[3][1] = new Buku("Buku Fiksi 2", penulis, "UB");
        buku4Kategori[3][2] = new Buku("Buku Fiksi 3", penulis, "UB");

        addPenulis(buku4Kategori[0][0], "Ali");
        addPenulis(buku4Kategori[0][1], "Nunu");
        addPenulis(buku4Kategori[0][2], "Adi");
        addPenulis(buku4Kategori[1][0], "Dai");
        addPenulis(buku4Kategori[1][1], "Wawan");
        addPenulis(buku4Kategori[1][2], "Maul");
        addPenulis(buku4Kategori[2][0], "Nabil");
        addPenulis(buku4Kategori[2][1], "Dinda");
        addPenulis(buku4Kategori[2][2], "Gava");
        addPenulis(buku4Kategori[3][0], "Liam");
        addPenulis(buku4Kategori[3][1], "Mani");
        addPenulis(buku4Kategori[3][2], "Rara");

        for (int i = 0; i < buku4Kategori.length; i++) {
            System.out.println("\nKategori " + (i + 1) + " : ");
            System.out.println("============================");
            for (int j=0; j < buku4Kategori[i].length; j++){
                tampilkanBuku(buku4Kategori[i][j]);
            }
        }
    }
}