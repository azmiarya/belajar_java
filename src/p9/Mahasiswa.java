
package p9;

public class Mahasiswa {
    // Integer (tipe data bisa jadi class)
    // int (tipe data primitive)
    private Integer usia;
    private static final String perguruanTinggi = "UNISKA"; //nilai tetap //tiap object berbagi wadah nilai(bukan masing2)
    
    public void sebutNama(String nama, String kelas){
        String prodi = "Teknik Informatika";
        
        System.out.println("Nama: "+nama);
        System.out.println("Kelas: "+kelas);
        System.out.println("Prodi: "+prodi);
        System.out.println("Perguruan Tinggi: "+perguruanTinggi);
    }
    
    public static void tahunAjaran(){ //tidak perlu ada object untuk memanggil method yang bernilai tetap
        System.out.println("Tahun akademik: 2024/2025");
    }
    
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.usia = 20;
        mhs1.sebutNama("Arya", "4c");
        System.out.println("Usia: "+mhs1.usia);
//      mhs.1tahunAjaran(); contoh jika menggunakan object
        tahunAjaran();
        
        //////////////////////////////////////////////
        System.out.println("===================================================");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.usia = 19;
        mhs2.sebutNama("Wahab", "4c");
        System.out.println("Usia: "+mhs2.usia);
        tahunAjaran();
    }
}
