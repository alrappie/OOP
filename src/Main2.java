public class Main2 {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Al'Ravie Mutiar Mahesa","205150200111041");
        Perpustakaan perpustakaan = new Perpustakaan(pegawai);
        //init pegawai
        pegawai.menambahkanPelanggan("Dilluc","1");
        pegawai.menambahkanPelanggan("Armic","2");
        pegawai.menambahkanPelanggan("Pak Steve","3");
        //init nambah buku
        pegawai.menambahkanBuku("Java","Graita",5);
        pegawai.menambahkanBuku("Phyton","Safir",20);
        pegawai.menambahkanBuku("Javascript","Machsun",2);
        pegawai.menambahkanBuku("Javascript","Machsun",5);
        pegawai.menambahkanBuku("Cara menjadi Kaya 7 turunan","Nabila Kol",10);
        pegawai.menambahkanBuku("Seni Berkayu","Hashiram Senju",10);
        pegawai.menambahkanBuku("Attack On Titan 139","Eren Iyega",10);
        pegawai.menambahkanBuku("Panduan Bermain Genshin Impact","Cantika",3);
        pegawai.menambahkanBuku("Cara membuat toko online","Pak Kalapak",5);
        pegawai.menambahkanBuku("Golang","Cantika",2);
//        //init peminjaman
        perpustakaan.pinjam("Dilluc","Golang");
        perpustakaan.pinjam("Dilluc","Golang");
        perpustakaan.pinjam("Pak Steve","Phyton");
        perpustakaan.pinjam("Pak Steve","Panduan Bermain Genshin Impact");
        perpustakaan.pinjam("Armic","Panduan Bermain Genshin Impact");
        perpustakaan.pinjam("Armic","Javascript");
        perpustakaan.pinjam("Armic","Golang");
        perpustakaan.pinjam("Dilluc","Panduan Bermain Genshin Impact");
        perpustakaan.pinjam("Armic","Golang");
        perpustakaan.pinjam("Pak Steve","Golang");
        perpustakaan.pinjam("Pak Steve","Cara membuat toko online");
        //tampilkan
        perpustakaan.tampilkanInfoPerpustakaan();
    }
}
