import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        double arm=2.14,elm=3.67,dom=1.11,muz=0.95,pat=5,tutar;
        int arsay,elsay,dosay,musay,pasay;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kac Kilo ? :");
        arsay=input.nextInt();
        System.out.print("Elma Kac Kilo ? :");
        elsay=input.nextInt();
        System.out.print("Domates Kac Kilo ? :");
        dosay=input.nextInt();
        System.out.print("Muz Kac Kilo ? :");
        musay=input.nextInt();
        System.out.print("Patlıcan Kac Kilo ? :");
        pasay=input.nextInt();
        tutar=arm*arsay+elm*elsay+dom*dosay+muz*musay+pat*pasay;
        System.out.print("Toplam tutar :"+tutar);






        //vkiHesaplama();
        //daireAlan();
        //taksimetreHesaplama();
        //ucgenAlan();
        //noteHesaplama();
        //kdvHesaplama();

    }

    private static void vkiHesaplama() {
        double boy,kilo ,VKI;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuza (metre cinsinde) giriniz :");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuza giriniz :");
        kilo=input.nextDouble();
        VKI=kilo/(boy*boy);
        System.out.print("Vücut Kilte İndeksiniz :"+VKI);
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
