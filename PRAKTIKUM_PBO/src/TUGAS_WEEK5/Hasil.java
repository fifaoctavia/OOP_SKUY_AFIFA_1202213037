package TUGAS_WEEK5;
// AFIFA NUR OCTAVIANI - 1202213037 - SI4501
import java.util.Scanner;

class Hasil{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String married, golongan;
    int anak;

    System.out.println("Golongan : ");
    golongan = input.nextLine();
    System.out.println("married : ");
    married = input.nextLine();
    System.out.println("Anak : ");
    anak = input.nextInt();

    Class hasil = new Class();
    System.out.println("Total gaji anda adalah : " + 
    (hasil.detectgolongan(golongan)+(hasil.detectmarried(married)*
    hasil.detectgolongan(golongan))+hasil.detectanak(anak)));
  }
}
