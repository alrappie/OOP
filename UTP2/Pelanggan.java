public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku[] bukuPinjaman = new Buku[3];
    private int index;

    public Pelanggan(String nama, String nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        this.index = 0; 
    }

    public  String getNama() {
       return this.nama;
    }

    public  void setNama(String nama) {
        this.nama = nama;
    }

    public  String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public  void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public  Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public  void setBukuPinjaman(Buku buku) {
        this.bukuPinjaman[index]=buku;
        if (bukuPinjaman[index]!=null) {
            int temp = bukuPinjaman[index].getJumlah();
            temp--;
            bukuPinjaman[index].setJumlah(temp);
            index++;
        }
    }
    public  void tampilkanInfoPelanggan(){
        System.out.println("Nama               : "+this.nama);
        System.out.println("Nomor Pelanggan    : "+this.nomorPelanggan);
        System.out.println("Buku yang Dipinjam : ");
            for(int i =0;i< bukuPinjaman.length;i++){
                if (bukuPinjaman[i]==null)break;
                System.out.println((i+1)+". "+bukuPinjaman[i].getJudul());
            }

        System.out.println();
    }

    public int getIndex() {
        return index;
    }
}
