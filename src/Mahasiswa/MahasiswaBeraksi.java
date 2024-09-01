package Mahasiswa;

public class MahasiswaBeraksi {

    public static void main(String[] args) {
        // Membuat objek dari kelas Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();

        // Memanggil method membaca
        mahasiswa1.membaca();
        
        // Memanggil method nyontek
        mahasiswa2.nyontek();
        
        // Memanggil method modifikasi
        mahasiswa3.modifikasi();
    }
}


