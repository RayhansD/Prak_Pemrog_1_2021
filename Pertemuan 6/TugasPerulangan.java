// Tugas Pertemuan 6
import java.util.Scanner;

public class TugasPerulangan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan maksimal yang akan ditampilkan = ");
        int n = scan.nextInt();
        int i = 1;
        while (i != n) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}