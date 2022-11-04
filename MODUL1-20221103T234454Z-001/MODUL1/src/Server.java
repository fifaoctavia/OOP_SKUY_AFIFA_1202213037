package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        System.out.println("Selamat datang di restoran EAD \n Silahkan register terlebih dahulu \n ====================================");
        Scanner input = new Scanner(System.in);
        String Nama;
        int NIM;

        System.out.println("Nama : ");
        Nama = input.nextLine();
        System.out.println("NIM  : ");
        NIM = input.nextLine();
        ClassUser user = new ClassUser();
        classUser.setUserName(user.get);
        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database

        // TODO Display Main Menu

        // TODO Create User

        // Display Menu
    }
}
