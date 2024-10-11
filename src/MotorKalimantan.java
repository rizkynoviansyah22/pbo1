// Kelas anak ketiga
class MotorKalimantan extends Motor {
    private boolean adaAksesorisMandau;

    public MotorKalimantan(String nama, String warna, int tahunProduksi, boolean adaAksesorisMandau) {
        super(nama, warna, tahunProduksi);
        this.adaAksesorisMandau = adaAksesorisMandau;
    }

    @Override
    public void suaraKlakson() {
        System.out.println(nama + " membunyikan klakson: Nguoonggg Nguoonggg!");
    }

    // Getter dan Setter tambahan
    public boolean isAdaAksesorisMandau() {
        return adaAksesorisMandau;
    }

    public void setAdaAksesorisMandau(boolean adaAksesorisMandau) {
        this.adaAksesorisMandau = adaAksesorisMandau;
    }
}
