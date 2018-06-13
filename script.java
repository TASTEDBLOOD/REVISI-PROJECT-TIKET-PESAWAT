/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisi2;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.Arrays;

public class Revisi2 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static int[] ongkos = {270000, 480000, 550000, 650000, 575000, 450000};
    static String[] waktu = {"30 menit", "2 jam 20 menit", "3 jam 10 menit"};
    static String[] waktu1 = {"40 menit", "1 jam 10 menit", "2 jam 10 menit"};
    static String[] waktu2 = {"50 menit", "2 jam 30 menit", "1 jam 5 menit"};
    static String[] waktu3 = {"8 jam 20 menit", "5 jam 5 menit", "4 jam 25 menit"};
    static String[] Rute = {"malang-surabaya", "malang-jakarta", "malang-sumatra barat"};
    static String[] Rute1 = {"surabaya-jakarta", "jakarta-kuala lumpur", "malang-irian jaya"};
    static String[] Rute2 = {"malang-maluku", "jakarta-banjarmasin", "malang-jawa barat"};
    static String[] Rute3 = {"jakarta-jedah", "jakarta-hokaido jepang", "jakarta-los angles"};
    static String[] Maskapai = {"Lion Air", "Citilink", "Batik Air", "Air Asia"};
    static int pilih, milih, tiket, total;

    public static void main(String[] args) {
        // TODO code application logic here
        for (int x = 0; x < Maskapai.length; x++) {
            System.out.println((x + 1) + ": " + Maskapai[x]);
        }

        System.out.print("pilih maskapai : ");
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                a();
                break;
            case 2:
                b();
                break;
            case 3:
                c();
                break;
            case 4:
                d();
                break;
            default:
                System.out.println("inputan salah");
        }

    }

    private static void a() {
        for (int x = 0; x < Rute.length; x++) {
            System.out.println((x + 1) + ": " + Rute[x] + "   ( " + waktu[x] + " )");
        }
        pilihan();
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.println("Maskapai : " + Maskapai[i]);
            System.out.println("Rute: " + Rute[i]);
        }

        System.out.println(tiket + " Tiket");
        System.out.println("Bayar : Rp " + total);
    }

    private static void b() {
        for (int x = 0; x < Rute.length; x++) {
            System.out.println((x + 1) + ": " + Rute1[x] + "   ( " + waktu1[x] + " )");
        }
        pilihan();
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.println("Maskapai : " + Maskapai[i]);
            System.out.println("Rute: " + Rute1[i]);
        }

        System.out.println(tiket + " Tiket");
        System.out.println("Bayar : Rp " + total);
    }

    private static void c() {
        for (int x = 0; x < Rute.length; x++) {
            System.out.println((x + 1) + ": " + Rute2[x] + "   ( " + waktu2[x] + " )");
        }
        pilihan();
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.println("Maskapai : " + Maskapai[i]);
            System.out.println("Rute: " + Rute2[i]);
        }

        System.out.println(tiket + " Tiket");
        System.out.println("Bayar : Rp " + total);
    }

    private static void d() {
        for (int x = 0; x < Rute.length; x++) {
            System.out.println((x + 1) + ": " + Rute3[x] + "   ( " + waktu3[x] + " )");
        }
        pilihan();
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        for (int i = 0; i < 1; i++) {
            System.out.println("Maskapai : " + Maskapai[i]);
            System.out.println("Rute: " + Rute3[i]);
        }

        System.out.println(tiket + " Tiket");
        System.out.println("Bayar : Rp " + total);
    }

    private static void pilihan() {

        System.out.print("pilih rute : ");
        milih = sc.nextInt();
        switch (milih) {
            case 1:
                System.out.print("jumlah tiket : ");
                tiket = sc.nextInt();
                total = tiket * ongkos[(milih - 1)];
                System.out.println("bayar : " + total);
                break;
            case 2:
                System.out.print("jumlah tiket : ");
                tiket = sc.nextInt();
                total = tiket * ongkos[(milih - 1)];
                System.out.println("bayar : " + total);
                break;
            case 3:
                System.out.print("jumlah tiket : ");
                tiket = sc.nextInt();
                total = tiket * ongkos[(milih - 1)];
                System.out.println("bayar : " + total);
                break;
            case 4:
                System.out.print("jumlah tiket : ");
                tiket = sc.nextInt();
                total = tiket * ongkos[(milih - 1)];
                System.out.println("bayar : " + total);
                break;
            default:
                System.out.println("ERROR");
        }
    }

}
