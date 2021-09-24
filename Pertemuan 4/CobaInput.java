import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan nama Anda :");
        String namaDepan = scanner.nextLine();

        System.out.println("Masukan umur Anda :");
        String umur = scanner.nextLine();

        System.out.println("Nama anda adalah " + namaDepan);
        System.out.println("Umur anda adalah " + umur);
    }
}