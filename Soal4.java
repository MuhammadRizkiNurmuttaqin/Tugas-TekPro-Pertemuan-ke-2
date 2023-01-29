package dingngoding;
/*	Deskripsi
 * Nama     : Muhammad Rizki Nurmuttaqin
 * Kelas    : D4-1B
 * NIM      : 221524051
 */

 import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args){
        int gaji = 500000;
        int hargaitem = 50000;
        int item, hasil = 0;

        Scanner sc = new Scanner(System.in);

        item = sc.nextInt();
        sc.close();

        hasil = (item >= 40) ? gaji + (((hargaitem * 25)/100)*item) : (item > 80) ? gaji + (((hargaitem * 35)/100)*item) : (item < 15) ? gaji - (((15 - item)* hargaitem) * 15 / 100) : gaji + (((hargaitem * 10)/100) * item);

        System.out.println(hasil);
    }
}