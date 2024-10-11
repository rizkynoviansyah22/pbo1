abstract class Motor {
    protected String nama;
    protected String warna;
    protected int tahunProduksi;

    public Motor(String nama, String warna, int tahunProduksi) {
        this.nama = nama;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    public abstract void suaraKlakson();

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}

// Kelas induk kedua
class Mesin {
    private int kapasitas;

    public Mesin(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void hidupkanMesin() {
        System.out.println("Mesin " + kapasitas + " cc dihidupkan");
    }
}