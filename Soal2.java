package dingngoding;
/*	Deskripsi
 * Nama : Muhammad Rizki Nurmuttaqin
 * Kelas : D4-1B
 * NIM : 221524051
 */
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        String[] kata = new String[3], angka = new String[3];

        Scanner kyb = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            kata[i] = kyb.nextLine();
            angka[i] = kata[i].split(" ")[1];
            kata[i] = kata[i].split(" ")[0];
        }

        kyb.close();

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.print(kata[i]);
            for (int j = 0; j < (15 - kata[i].length()); j++) {
                System.out.print(" ");
            }
            if (angka[i].length() < 3) {
                for (int k = 0; k < (3 - angka[i].length()); k++) {
                    System.out.print("0");
                }
                System.out.println(angka[i]);
            } else {
                System.out.println(angka[i]);
            }
        }
        System.out.println("================================");
    }
}
