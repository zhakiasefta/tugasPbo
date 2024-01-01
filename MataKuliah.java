public class MataKuliah {
    private String kode;
    private String nama;

    public MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public void informasiMataKuliah() {
        System.out.println("Matakuliah " + nama + " dengan kode " + kode);
    }

    public String getNama() {
        return nama;
    }
}
