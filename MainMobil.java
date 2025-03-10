import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        // untuk meminta inputan dari user (no.3)
        Scanner input = new Scanner(System.in);

        // instansiasi class mobil
        Mobil m1 = new Mobil();

        System.out.println("Masukkan kecepatan mobil anda : ");
        m1.setKecepatan(input.nextDouble());
        input.nextLine();
        System.out.println("Masukkan merek mobil anda : ");
        m1.setmanufaktur(input.nextLine());
        System.out.println("Masukkan no plat mobil anda : ");
        m1.setNoPlat(input.nextLine());
        System.out.println("Masukkan warna mobil anda : ");
        m1.setwarna(input.nextLine());
        System.out.println("Masukkan waktu tempuh : ");
        m1.setWaktu(input.nextDouble());
        m1.display();
        System.out.println("========================");

        // instansiasi class mobil
        Mobil m2 = new Mobil();

        System.out.println("Masukkan kecepatan mobil anda : ");
        m2.setKecepatan(input.nextDouble());
        input.nextLine();
        System.out.println("Masukkan merek mobil anda : ");
        m2.setmanufaktur(input.nextLine());
        System.out.println("Masukkan no plat mobil anda : ");
        m2.setNoPlat(input.nextLine());
        System.out.println("Masukkan warna mobil anda : ");
        m2.setwarna(input.nextLine());
        System.out.println("Masukkan waktu tempuh : ");
        m2.setWaktu(input.nextDouble());
        m2.display();
        System.out.println("========================");
        
        input.close();
    }
}
