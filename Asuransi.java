public class Asuransi{
    
    final int maxBiayaPertanggungan=1000;
    protected int biayaPolis;
    protected Nasabah nasabah;
    
    Asuransi(int b){
        biayaPolis=b;
    } 
    
    public Asuransi(){
        biayaPolis=0;
    }
    
    public void setBiayaPolis(int biayaPolis){
        this.biayaPolis = biayaPolis;
    }
    
    public int getBiayaPolis(){
        return biayaPolis;
    }
    
    public void setNasabah(Nasabah n){
        this.nasabah = n;
    }
    
    public Nasabah getNasabah(){
        return nasabah;
    }
    
    
    public void cetakClaim(){
        nasabah.cetakData();
        //System.out.println("Biaya pertanggungan = Rp " + claimKecelakaanKerja());
    }
    
}