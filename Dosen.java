public class Dosen {

        private String nama;
        private String nidn;

        public Dosen(String nama, String nidn) {
            this.nama = nama;
            this.nidn = nidn;
        }

        public void mengajar(MataKuliah mataKuliah) {
            System.out.println(nama + " mengajar matakuliah " + mataKuliah.getNama());
        }
}
