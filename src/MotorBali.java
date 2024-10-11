
// Kelas anak kedua
class MotorBali extends Motor {
    private String ukiranKhas;
    private Mesin mesin;

    public MotorBali(String nama, String warna, int tahunProduksi, String ukiranKhas) {
        super(nama, warna, tahunProduksi);
        this.ukiranKhas = ukiranKhas;
        this.mesin = new Mesin(125);
    }

    @Override
    public void suaraKlakson() {
        System.out.println(nama + " membunyikan klakson: Teettt Teettt!");
        mesin.hidupkanMesin();
    }

    // Getter dan Setter tambahan
    public String getUkiranKhas() {
        return ukiranKhas;
    }

    public void setUkiranKhas(String ukiranKhas) {
        this.ukiranKhas = ukiranKhas;
    }
}
