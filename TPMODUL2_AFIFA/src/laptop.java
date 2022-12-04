
public class laptop extends perangkat {
    protected boolean webcam;

    public laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    public void informasi() {
        System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " 
        + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu Laptop ini juga "
        + (webcam == false ? "Tidak memiliki webcam." : "memiliki webcam."));
    }

    public void bukagame(String namagame) {
        System.out.println("Laptop berhasil membuka game " + namagame);
    }

    public void kirimemail(String email1) {
        System.out.println("Laptop berhasil mengirim email ke " + email1);
    }

    public void kirimemail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email1 + " dan ke " + email2);
    }

}
