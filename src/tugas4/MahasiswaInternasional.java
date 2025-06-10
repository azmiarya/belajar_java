
package tugas4;

public class MahasiswaInternasional extends Mahasiswa{
    private String negaraAsal;
    
    public MahasiswaInternasional(String nama, String npm, String negaraAsal) {
        super(nama, npm);
        this.negaraAsal = negaraAsal;
    }
    
    public String getNegaraAsal(){
        return negaraAsal;
    }
    
    public void setNegaraAsal(String negaraAsal){
        this.negaraAsal = negaraAsal;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Negara asal: "+negaraAsal);
    }
    
    public void belajar(String mataKuliah, int jam){
        System.out.println(getNama()+" dari "+negaraAsal+" sedang belajar " +mataKuliah+" selama "+jam+" jam.");
    }
    
    
    
}
