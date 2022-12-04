public class mainclass {
    public static void main(String[] args) {
        perangkat Perangkat = new perangkat("Elektronik", 128, 5.7f);
        Perangkat.informasi();

        System.out.println();

        handphone hape = new handphone("Samsung", 128, 3.2f, false);
        hape.informasi();
        hape.telfon(81245);
        hape.kirimSMS(8124);
        hape.kirimSMS(8123, 8134);

        System.out.println();

        laptop lp = new laptop("ASUS", 500, 7.8f, true);
        lp.informasi();
        lp.bukagame("PUBG");
        lp.kirimemail("putrasrg");
        lp.kirimemail("putrasrg", "99corp");
    }
    
}
