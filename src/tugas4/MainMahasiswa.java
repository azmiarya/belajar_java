
package tugas4;

public class MainMahasiswa {
    public static void main(String[] args) {
       Mahasiswa mhs1 = new Mahasiswa("Arya","2310010370");
       
       mhs1.tampilInfo();
       mhs1.belajar();
       mhs1.belajar("Pemrograman Java");
       
       Mahasiswa mhs2 = new Mahasiswa("Andi", "2310010390");
       mhs2.tampilInfo();
       mhs2.belajar();
       mhs2.belajar("Bahasa Inggris");
    }
}
