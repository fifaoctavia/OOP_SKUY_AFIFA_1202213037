import java.util.Scanner;

class GametebakAngka {
  public static void main(String[] args) {
   int a = (int)(Math.random() *10);// acak angka dari 0-10
  int batas = 2;
    System.out.println("PERMAINAN TEBAK ANGKA JAVA :");
    System.out.println("Tebaklah angka 0-10 dan kamu hanya memiliki 3 kesempatan");
 
do{
    System.out.println("    MASUKKAN ANGKA YANG ANDA TEBAK!");
    
    Scanner jawab = new Scanner (System.in);
    int b = jawab.nextInt();

if (batas > 0 ){
if ( b == a ){
    System.out.println("Selamat, angka yang anda masukkan BENAR!");
    break;}
else if ( b < a ){
    System.out.println("Maaf, angka yang anda masukkan terlalu KECIL.");}
else if ( b > a ){
    System.out.println("Maaf, angka yang anda masukkan terlalu BESAR.");}

    System.out.println("    Anda Memiliki " + batas + " Kesempatan Lagi");
    System.out.println("---------------------------------------------------");
    batas--;}
else{
    System.out.println("---------------------------------------------------");
    System.out.println("ANDA SALAH! KESEMPATAN TELAH HABIS. SILAHKAN COBA LAGI");
    System.out.println("ANGKA YANG DIMAKSUD ADALAH " + a);
    System.out.println("---------------------------------------------------");
    break;
    }
   }
while ( batas >=0 );
  }
}
