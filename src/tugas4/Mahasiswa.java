
package tugas4;

public class Mahasiswa {
     String nama;
     String npm;
    
    public Mahasiswa(String nama, String npm){
        this.nama = nama;
        this.npm = npm;
    }
    
    public String getNama(){
        return nama;
    }
    public String getNpm(){
        return npm;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNpm(String npm){
        this.npm = npm;
    }
    
    //Method biasa
    public void tampilInfo(){
        System.out.println("Nama: "+ nama);
        System.out.println("Npm: "+npm);
    }
    
    //overloading
    public void belajar(){
        System.out.println(nama + " sedang belajar ");
    }
    public void belajar(String mataKuliah){
        System.out.println(nama + " sedang belajar "+mataKuliah+".");
    }
    
}
