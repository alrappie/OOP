public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Al'Ravie Mutiar Mahesa","205150200111041");
        Perpustakaan perpustakaan = new Perpustakaan(pegawai);
        //init pegawai
        pegawai.menambahkanPelanggan("Hayasaka","99001110009");
        pegawai.menambahkanPelanggan("Miyuki","99001100008");
        pegawai.menambahkanPelanggan("Kei","990011110077");
        //init nambah buku
        pegawai.menambahkanBuku("Heavens","Tiancan",3);
        pegawai.menambahkanBuku("Kaguya-sama","Akasaka",3);
        pegawai.menambahkanBuku("Solo Leveling","Chugong",1);
        //init peminjaman
        perpustakaan.pinjam("Hayasaka","Overlord");
        perpustakaan.pinjam("Miyuki","Solo Leveling");
        perpustakaan.pinjam("Kei","Solo Leveling");
        perpustakaan.pinjam("Hayasaka","Kaguya-sama");
        //init nambah buku
        pegawai.menambahkanBuku("Overlord","Maruyama",3);
        pegawai.menambahkanBuku("Kaguya-sama","Akasaka",3);
        pegawai.menambahkanBuku("Solo Leveling","Chugong",1);
        //init peminjaman
        perpustakaan.pinjam("Kei","Heavens");
        perpustakaan.pinjam("Miyuki","Solo Leveling");
        perpustakaan.pinjam("Kei","Kaguya-sama");
        //init pelanggan
        pegawai.menambahkanPelanggan("Shinomiya","2");
        pegawai.menambahkanPelanggan("Miyuki","1");
        //init peminjaman
        perpustakaan.pinjam("Shinomiya","Solo Leveling");
        perpustakaan.pinjam("Shirogane","Kaguya-sama");
        //tampilkan
        perpustakaan.tampilkanInfoPerpustakaan();
    }
}
