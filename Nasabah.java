public class Nasabah{
    private String nama, nik, dob;
    //jenisAsuransi : Asuransi

    public Nasabah(String nama){
        setNama(nama);
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void cetakData(){
        System.out.println("Nama Nasabah = "+getNama());        
    }
}