
public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void Informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void Berlayar(){
        System.out.println("Transportasi Air jenis tidak diketahui sedang berlayar");
    }
    public void Berlabuh(){
        System.out.println("Transportasi Air jenis tidak diketahui berlabuh di pantai");
    }

}
