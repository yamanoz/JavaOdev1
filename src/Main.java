import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int matematik,kimya,fizik,turce,tarih,muzik,sonuc;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik Notuna Giriniz : ");
        matematik=inp.nextInt();
        System.out.print("Fizik Notuna Giriniz : ");
        fizik=inp.nextInt();
        System.out.print("Turkce Notuna Giriniz : ");
        turce=inp.nextInt();
        System.out.print("Tarih Notuna Giriniz : ");
        tarih=inp.nextInt();
        System.out.print("Müzik Notuna Giriniz : ");
        muzik=inp.nextInt();
        System.out.print("Kimya Notuna Giriniz : ");
        kimya=inp.nextInt();
        sonuc=(matematik+kimya+fizik+tarih+turce+muzik)/6;
        System.out.println(sonuc>60 ? "Geçti":"Kaldı");



    }


}
