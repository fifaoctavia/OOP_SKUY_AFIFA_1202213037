import java.util.Scanner;

class Hasil {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String status, golongan;
    int anak;

    System.out.println("Golongan : ");
    golongan = input.nextLine();
    System.out.println("Status : ");
    status = input.nextLine();
    System.out.println("Anak : ");
    anak = input.nextInt();

    ClassData hasil = new ClassData();
    System.out.println("Total gaji anda adalah : " + (hasil.detectgolongan(golongan)+(hasil.detectstatus(status)*hasil.detectstatus(status))+hasil.detectanak(anak)));
  }
}
