
package method;

public class Mahasiswa {
    String nama, npm, status;
    double ipk;
    
    // constructor
    public Mahasiswa(String nama, String npm, double ipk){
        this.nama = nama;
        this.npm = npm;
        setIpk(ipk);
    }
    
    // mutator
    void setIpk(double ipk){
        this.ipk = ipk;
        if(ipk >= 2.5){
            status = "Lulus";
        } else {
            status = "Tidak lulus";
        }
    }
    
    // accessor
    String getNama(){
        return nama;
    }
    
    String getNpm(){
        return npm;
    }
    
    double getIpk(){
        return ipk;
    }
    
    String getStatus(){
        return status;
    }
    
}
