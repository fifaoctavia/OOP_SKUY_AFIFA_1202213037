import java.util.Scanner;

public class Hitungnilai {
    Scanner myObj = new Scanner(System.in);
    public double hitungtubes(double nilaitubes){
        double tubes;
        System.out.println("Masukkan nilai tubes : ");
        tubes = (0.3*nilaitubes);
        System.out.println("Tubes : " + tubes);
        return tubes;
    }
    public double hitungquiz(double nilaiquiz){
        double quiz;
        quiz =(0.1*nilaiquiz);
        return quiz;
    }
    public double hitungtugas( double nilaitugas){
        double tugas;
        tugas =(0.1*nilaitugas);
        return tugas;
    }
    public double hitungUTS( double nilaiUTS){
        double uts;
        uts =(0.25*nilaiUTS);
        return uts;
    }
    public double hitungUAS( double nilaiUAS){
        double UAS;
        UAS =(0.1*nilaiUAS);
        return UAS;
    }
}
