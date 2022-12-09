public class MainClass {
    public static void main(String[] args) {
        TransportasiAir transportasiair = new TransportasiAir(200, 200000);
        transportasiair.Informasi();
        transportasiair.Berlayar();
        transportasiair.Berlabuh();

        System.out.println();

        Sampan sampan = new Sampan(10, 5000, 2);
        sampan.Informasi();
        sampan.Berlayar();
        sampan.Berlabuh();
        sampan.Berlabuh(2);

        System.out.println();

        Kapal kapal = new Kapal(500, 100000, "Diesel");
        kapal.Informasi();
        kapal.Berlayar();
        kapal.Berlayar(3);
        kapal.Berlabuh();
    }
}
