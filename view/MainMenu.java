package UTSS.view;
import UTSS.controller.*;
import java.util.Scanner;

public class MainMenu {
    static Scanner scn = new Scanner(System.in);
    static Controller controller = new Controller();

    public static void menu(){
        System.out.print("\033[H\033[2J");  
        System.out.println("SELAMAT DATANG");
        System.out.println("silahkan pilih menu yang ada ");
        System.out.println("1. calculate Payment \n2. Generate Revenue Report");
        int input = Integer.parseInt(scn.nextLine());
        switch (input) {
            case 1:
                calculatePayment();
                break;
            case 2:
                controller.GenerateRevenueRecord();
                System.out.println("\ntekan Enter untuk lanjut");
                scn.nextLine();
                break;
            case 0 : 
                System.out.println("terima kasih ");
                System.exit(0);
            default:
            System.out.println("maaf pilihan yang ada input tidak ada!!");
                break;
        }
        menu();
    }

    public static void calculatePayment(){
        System.out.print("\033[H\033[2J");  
        System.out.println("");
    }
    public static void showArtist(){

    }
    public static void showVendor(){

    }
    public static void show
}

