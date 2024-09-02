public class Nilai {
    // Variabel untuk menyimpan data
    public String nim;
    public String nama;
    public double nilaiAbsen;
    public double nilaiTugas;
    public double nilaiUTS;
    public double nilaiUAS;

    // Method untuk mengisi data
    public void Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    // Method untuk mencetak nilai
public void cetakNilai() {
    double nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    // Menggunakan %-25s untuk lebar kolom tetap pada label
    System.out.printf("%-25s : %s\n", "NIM", nim);
    System.out.printf("%-25s : %s\n", "Nama", nama);
    System.out.printf("%-25s : %.1f\n", "Nilai Absen [10%%]", nilaiAbsen);
    System.out.printf("%-25s : %.1f\n", "Nilai Tugas [20%%]", nilaiTugas);
    System.out.printf("%-25s : %.1f\n", "Nilai UTS   [30%%]", nilaiUTS);
    System.out.printf("%-25s : %.1f\n", "Nilai UAS   [40%%]", nilaiUAS);
    System.out.printf("%-25s : %.1f\n", "Nilai Akhir", nilaiAkhir);
}
}
  
