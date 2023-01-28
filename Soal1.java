package dingngoding;
/*	Deskripsi
 * Nama : Muhammad Rizki Nurmuttaqin
 * Kelas : D4-1B
 * NIM : 221524051
 */
import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		int count = 0;
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Masukan kata");
		String kata = Keyboard.nextLine();
		Keyboard.close();
		String[] ubah = kata.split("[,.!?_'@ ]");
		for (String n: ubah){
			count++;	
		} System.out.println(""+count);
		for (String n : ubah){
			System.out.println(n);
		}
	}

}
