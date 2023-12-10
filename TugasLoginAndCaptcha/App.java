import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan Username: ");
            String inputUsername = scanner.nextLine();

            System.out.println("Masukkan Password: ");
            String inputPassword = scanner.nextLine();

            // Membuat Objek User
            User user = new User(inputUsername, inputPassword);
            Login login = new Login();

            if (login.verifikasi(user)) {
                System.out.println("Login berhasil! Selamat datang " + inputUsername + " di ALFAMART");
            } else {
                System.out.println("Login gagal. Username atau Password Salah!");
            }

            Captcha captchaGenerator = new Captcha();
            String captcha = captchaGenerator.generateRandomCaptcha(); // The captcha you see

            System.out.println("Captcha: " + captcha);

            System.out.println("Mohon Isi Captcha yang Anda Lihat: ");
            String userInput = scanner.nextLine();

            // Membuat Objek Captcha
            CaptchaInput captchaInput = new CaptchaInput(captcha, userInput);

            if (userInput.equalsIgnoreCase(captcha)) {
                System.out.println("Captcha yang Anda isi Benar!");
            } else {
                System.out.println("Captcha yang Anda isi Salah!");
            }

            System.out.println("Input Nomor Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.println("Input Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.println("Input Nomor HP: ");
            String noHp = scanner.nextLine();

            System.out.println("Input Alamat: ");
            String alamat = scanner.nextLine();

            System.out.println("Input Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.println("Input Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.println("Input Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.println("Input Jumlah Barang yang Dibeli: ");
            double jumlahBeli = scanner.nextDouble();

            scanner.close();

            // Membuat Objek Barang Pembayaran

            BarangPembayaran barangPembayaran = new BarangPembayaran(kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Membuat Objek Faktur

            Faktur faktur = new Faktur(user, captchaInput, noFaktur, namaPelanggan, noHp, alamat, barangPembayaran);

            // Menampilkan Faktur

            faktur.cetakFaktur();

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memproses input " + e.getMessage());
        }

    }

}