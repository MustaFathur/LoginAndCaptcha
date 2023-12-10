public class BarangPembayaran extends Barang implements Pembayaran {
    private double jumlahBeli;

    public BarangPembayaran(String kodeBarang, String namaBarang, double hargaBarang, double jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.jumlahBeli = jumlahBeli;
    }

    public double getJumlahBeli() {
        return jumlahBeli;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }
}
