public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void mengambilMataKuliah(MataKuliah mataKuliah) {
        System.out.println(nama + " mengambil matakuliah " + mataKuliah.getNama());
    }
}