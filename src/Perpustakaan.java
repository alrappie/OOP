import java.util.List;

public class Perpustakaan {
    public static Buku[] listBuku = new Buku[100];
    public Pegawai  pegawaiPerpus;
    public static Pelanggan[] listPelanggan = new Pelanggan[20];

    public Perpustakaan(Pegawai pegawaiPerpus) {
        this.pegawaiPerpus = pegawaiPerpus;
    }
    public void pinjam(String namaPelanggan, String judulBuku){
        int j=0;
        for (int i =0;i<namaPelanggan.length();i++){
            if (listPelanggan[i].getNama().equalsIgnoreCase((namaPelanggan))){
                if (listPelanggan[i].getIndex()==3){
                    return;
                }
                while (listBuku[j] != null) {
                    if (listBuku[j].getJudul().equalsIgnoreCase(judulBuku)&&listBuku[j].getJumlah() > 0) {
                        listPelanggan[i].setBukuPinjaman(cariBuku(judulBuku));
                        return;
                    }
                    j++;
                }
            }
            if (listPelanggan[i+1]==null){
                break;
            }
        }
    }
    public Buku cariBuku(String judulBuku){
        for (int i =0;i< listBuku.length;i++){
            if (listBuku[i].getJudul().equalsIgnoreCase((judulBuku))&&listBuku[i].getJumlah()!=0){
                return listBuku[i];
            }
            if (listBuku[i+1]==null){
                break;
            }
        }
        return null;
    }
    public void tampilkanInfoPerpustakaan(){
        pegawaiPerpus.tampilkanInfoPegawai();
        System.out.println("===============");
        System.out.println("Daftar Pelanggan di Perpustakaan\n");
        {
            int i =0;
            while (listPelanggan[i] != null) {
                listPelanggan[i].tampilkanInfoPelanggan();
                i++;
            }
        }
        System.out.println("===============");
        System.out.println("Daftar Buku di Perpustakaan\n");
        {
            int i =0;
            while (listBuku[i] != null) {
                listBuku[i].tampilkanInfoBuku();
                i++;
            }
        }
    }
}
