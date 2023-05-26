public class AsuransiKetenagaKerjaan extends Asuransi{
    private int thnKerja;
    
    public AsuransiKetenagaKerjaan(){
        //super(0);
        thnKerja=5;
    }
    public int claimKecelakaanKerja( ){
        return maxBiayaPertanggungan * thnKerja/100;
    }
    
    //override
    public void cetakClaim(){
        super.cetakClaim();
        System.out.println("Biaya pertanggungan = Rp " + claimKecelakaanKerja());
    }
}