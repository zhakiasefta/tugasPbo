import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 dan 100. Coba tebak!");

        // Membuat objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Random untuk menghasilkan angka acak
        Random random = new Random();
        int angkaRandom = random.nextInt(100) + 1;

        // Inisialisasi variabel untuk menyimpan tebakan pengguna
        int tebakan;

        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();

            if (tebakan > angkaRandom) {
                System.out.println("Tebakan terlalu besar. Coba lagi!");
            } else if (tebakan < angkaRandom) {
                System.out.println("Tebakan terlalu kecil. Coba lagi!");
            } else {
                System.out.println("Selamat! Anda berhasil menebak angka " + angkaRandom + "!");
            }
        } while (tebakan != angkaRandom);

        // Menutup Scanner setelah pengguna selesai
        scanner.close();
    }
}
