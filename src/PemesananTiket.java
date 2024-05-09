class PemesananTiket {
   // Do your magic here...
   private String namaPemesan;
    private String kodePesanan;
    private String tanggalPesanan;
    private String namaTiket;
    private double totalHarga;

    public PemesananTiket(String namaPemesan, String kodePesanan, String tanggalPesanan, String namaTiket, double totalHarga) {
        this.namaPemesan = namaPemesan;
        this.kodePesanan = kodePesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.namaTiket = namaTiket;
        this.totalHarga = totalHarga;
    }

    public void cetakDetailPesanan() {
        System.out.println("---- Detail Pesanan ----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Pesanan: " + kodePesanan);
        System.out.println("Tanggal Pesanan: " + tanggalPesanan);
        System.out.println("Jenis Tiket: " + namaTiket);
        System.out.println("Total Harga: " + totalHarga + "USD");
    }
 }