import java.util.Scanner;
public class Main {

    public static void main(String[] args){



        daireAlan();
        //taksimetreHesaplama();
        //ucgenAlan();
        //noteHesaplama();
        //kdvHesaplama();

    }

    private static void daireAlan() {
        int r,aci;
        double pi=3.14,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("Yari capa giriniz :");
        r=input.nextInt();
        System.out.print("Merkez acisina giriniz :");
        aci=input.nextInt();
        alan=(pi*(r*r)*aci)/360;
        System.out.print("Dairenin Alani :"+alan);
    }

    private static void taksimetreHesaplama() {
        int KM;
        double perKM=2.2,total=10;
        System.out.print("Mesafeyi KM cinsinden giriniz :");
        Scanner input=new Scanner(System.in);
        KM=input.nextInt();
        total+=perKM*KM;
        total=total<20?20:total;
        System.out.print("Toplam :"+total);
    }

    private static void ucgenAlan() {
        int a,b,c;
        double cevre,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("A kenarina giriniz :");
        a=input.nextInt();

        System.out.print("B kenarina giriniz :");
        b=input.nextInt();

        System.out.print("C kenarina giriniz :");
        c=input.nextInt();

        cevre=(a+b+c)/2;
        alan=Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));
        System.out.print("Ucgenin Alani :"+alan);
    }


    private static void kdvHesaplama() {
        // Ödev: KDV Tutarı Hesaplama
        // Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program
        Scanner input = new Scanner(System.in);
        double tutar, kdvtutari, kdvOran;

        System.out.print("Tutar Giriniz:");
        tutar = input.nextDouble();
        kdvOran=(tutar>0 && tutar<1000) ? 0.18 : 0.08;
        double kdvfiyat = tutar + tutar * kdvOran;
        double kdvtutar = kdvfiyat - tutar;

        System.out.println("KDV'li tutar: " + kdvfiyat);
        System.out.println("KDV Tutari: " + kdvtutar);

    }

    private static void noteHesaplama() {
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
