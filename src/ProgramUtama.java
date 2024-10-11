public class ProgramUtama {
    public static void main(String[] args) {
        MotorJawa motorJawa = new MotorJawa("Semar", "Coklat Batik", 2022, "Kawung");
        MotorBali motorBali = new MotorBali("Barong", "Merah Tua", 2023, "Patra Punggel");
        MotorKalimantan motorKalimantan = new MotorKalimantan("Dayak", "Hitam-Kuning", 2021, true);

        Motor[] motorArray = {motorJawa, motorBali, motorKalimantan};
        for (Motor motor : motorArray) {
            System.out.println("Nama: " + motor.getNama());
            System.out.println("Warna: " + motor.getWarna());
            System.out.println("Tahun Produksi: " + motor.getTahunProduksi());
            motor.suaraKlakson();
            System.out.println();
        }

        // Demonstrasi setter
        motorJawa.setMotifBatik("Megamendung");
        System.out.println("Motif batik motor Jawa setelah diubah: " + motorJawa.getMotifBatik());

        motorBali.setUkiranKhas("Karang Boma");
        System.out.println("Ukiran khas motor Bali setelah diubah: " + motorBali.getUkiranKhas());

        motorKalimantan.setAdaAksesorisMandau(false);
        System.out.println("Motor Kalimantan memiliki aksesori mandau: " + motorKalimantan.isAdaAksesorisMandau());
    }
}