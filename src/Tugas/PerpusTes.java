
package Tugas;
import java.util.Scanner;
public class PerpusTes extends buku {

    public PerpusTes(String novel, String komik, String dongeng) {
        super(novel, komik, dongeng);
    }
 public static void main(String[] arg){ 
     Scanner s = new Scanner(System.in);
     PerpusTes a = new PerpusTes("1.\tLaskar Pelangi", "1.\tKomik Doraemon", "1.\tSi Kancil");
     System.out.println("1. Novel");
     System.out.println("2. Komik");
     System.out.println("3. Dongeng");
     System.out.println("Pilih : ");
     int pilih = s.nextInt();
     if (pilih == 1){
         System.out.println(a.novel);
     } if (pilih == 2){
         System.out.println(a.komik);
     }if (pilih == 3){
     System.out.println(a.dongeng);
     }
 }
}
