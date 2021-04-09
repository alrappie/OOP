public class Pegawai {
    private String nama;
    private String nomorPegawai;
    private int indexBuku =0;
    private int indexPelanggan =0;
    public Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }
    public void tampilkanInfoPegawai(){
        System.out.println("Nama\t\t  : " +this.nama);
        System.out.println("Nomor Pegawai : " +this.nomorPegawai);
    }
    public void menambahkanPelanggan(String nama, String nomorPelanggan){
        Perpustakaan.listPelanggan[indexPelanggan] = new Pelanggan(nama,nomorPelanggan);
        indexPelanggan++;
    }
    public void menambahkanBuku(String judul,String penulis,int jumlahBuku){
        int index=0;
        while (Perpustakaan.listBuku[index]!=null){
            if (Perpustakaan.listBuku[index].getJudul().equalsIgnoreCase(judul)){
                int temp = Perpustakaan.listBuku[index].getJumlah();
                Perpustakaan.listBuku[index].setJumlah(temp+jumlahBuku);
                return;
            }
            index++;
        }
        Perpustakaan.listBuku[indexBuku] = new Buku(judul,penulis,jumlahBuku);
        indexBuku++;
    }
}
