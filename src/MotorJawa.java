class MotorJawa extends Motor {
    private String motifBatik;
    private Mesin mesin;

    // Constructor overloading
    public MotorJawa(String nama, String warna, int tahunProduksi) {
        super(nama, warna, tahunProduksi);
        this.motifBatik = "Parang";
        this.mesin = new Mesin(150);
    }

    public MotorJawa(String nama, String warna, int tahunProduksi, String motifBatik) {
        super(nama, warna, tahunProduksi);
        this.motifBatik = motifBatik;
        this.mesin = new Mesin(150);
    }

    @Override
    public void suaraKlakson() {
        System.out.println(nama + " membunyikan klakson: Tinnnn Tinnnn!");
        mesin.hidupkanMesin();
    }

    // Getter dan Setter tambahan
    public String getMotifBatik() {
        return motifBatik;
    }

    public void setMotifBatik(String motifBatik) {
        this.motifBatik = motifBatik;
    }
}
