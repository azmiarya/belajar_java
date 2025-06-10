
package method;


public class MahasiswaMain {
    public static void main(String[]args){
        Mahasiswa Putra = new Mahasiswa("Putra", "2310010123", 3.0); //constructor
        
        // merubah nilai ipk objek si Putra
        Putra.setIpk(2.4);
        
        System.out.println("Nama: "+Putra.getNama());
        System.out.println("NPM: "+Putra.getNpm());
        System.out.println("IPK: "+Putra.getIpk());
        System.out.println("Status: "+Putra.getStatus());
        
        
        System.out.println("========================================================");
        Mahasiswa Putri = new Mahasiswa("Putri", "2310010124", 2.0); //constructor
        
        // merubah nilai ipk objek si Putra
        Putri.setIpk(4.0);
        
        System.out.println("Nama: "+Putri.getNama());
        System.out.println("NPM: "+Putri.getNpm());
        System.out.println("IPK: "+Putri.getIpk());
        System.out.println("Status: "+Putri.getStatus());
    }
    
}
