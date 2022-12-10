public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    public void informasi(){
        System.out.println("Transportasi Air berjenis Sampan dengan " +jumlahKursi+ " kursi ditetapkan dengan biaya sebesar Rp. " +biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air berjenis Sampan sedang berlayar dengan " +layar+ " layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air berjenis Sampan diketahui sedang berlabuh di pantai tanpa menggunakan jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air berjenis Sampan diketahui sedang berlabuh di pantai dengan " +jangkar+ " jangkar");
    }
}
