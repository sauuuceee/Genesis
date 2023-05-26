public class AsuransiTestDrive{
    public static void main(String args[]){
        AsuransiKetenagaKerjaan b = new AsuransiKetenagaKerjaan();
        b.setNasabah(new Nasabah("Unyil"));
        b.cetakClaim();
        
        AsuransiKesehatan a = new AsuransiKesehatan();
        a.setNasabah(new Nasabah("Usrok"));
        a.setKelasKamar("Vip");
        a.cetakClaim();
    }
}