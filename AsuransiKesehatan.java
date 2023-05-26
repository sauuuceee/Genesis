public class AsuransiKesehatan extends Asuransi{
    private String kelasKamar;
    
    public void setKelasKamar(String kk){
        kelasKamar = kk;
    }
    
    public String getKelasKamar(){
        return kelasKamar;
    }
    
    public int claimRawatInap(){
        int biayaPertanggungan=0;
        if(kelasKamar.equals("VVIP"))
            biayaPertanggungan = 25 * maxBiayaPertanggungan /100;
        else if(kelasKamar.equals("Vip")) 
            biayaPertanggungan = 50 * maxBiayaPertanggungan /100;
        else
            biayaPertanggungan = maxBiayaPertanggungan;
            
        return biayaPertanggungan;
    }
    
    //override
    public void cetakClaim(){
        super.cetakClaim();
        System.out.println("Biaya pertanggungan = Rp " + claimRawatInap());
    }
    
}