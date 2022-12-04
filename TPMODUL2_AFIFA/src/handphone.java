
public class handphone extends perangkat {
    protected boolean fingerprint;

    public handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi() {
        System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " 
        + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini "
        + (fingerprint == false ? "TIDAK memiliki fingerprint." : "memiliki fingerprint."));
    }

    public void telfon(int nomor1) {
        System.out.println("Handphone berhasil menyambung telfon ke nomor " + nomor1);
    }

    public void kirimSMS(int nomor1) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + nomor1);
    }
    
    public void kirimSMS(int nomor1, int nomor2) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor" + nomor1 + " dan ke nomor " + nomor2);
    }
    
}
