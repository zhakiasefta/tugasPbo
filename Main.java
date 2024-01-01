public class Main {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen = new Dosen("Dr. John Doe", "123456");

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Alice", "2021001");

        // Membuat objek MataKuliah
        MataKuliah mataKuliah = new MataKuliah("CS101", "Pemrograman Dasar");

        // Interaksi antara Dosen dan Mahasiswa
        dosen.mengajar(mataKuliah);
        mahasiswa.mengambilMataKuliah(mataKuliah);

        // Informasi MataKuliah
        mataKuliah.informasiMataKuliah();
    }
}
