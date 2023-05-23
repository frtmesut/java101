import java.util.Scanner;
public class weatherEvent {
    public static void main(String[] args){

        int sic;
        String evn1, evn2, evn3, evn4;
        evn1 = "kayak";
        evn2 = "sinema";
        evn3 = "piknik";
        evn4 = "yüzme";

        Scanner veri = new Scanner (System.in);
        System.out.print("Sıcaklık giriniz : ");
        sic = veri.nextInt();

        if (sic <5){
            System.out.println(" Bu hava koşullarında " + evn1 + " etkinliği sizin için uygun.");
        } else if (sic >= 5 && sic <= 13) {
            System.out.println("Bu hava koşullarında " + evn2 + " etkinliği sizin için uygun.");
        } else if (sic > 13 && sic <= 18) {
            System.out.println("Bu hava koşullarında " + evn2 + " ve " + evn3 + " etkinliği sizin için uygun.");
        } else if (sic > 18 && sic <= 25) {
            System.out.println("Bu hava koşullarında " + evn3 + " etkinliği sizin için uygun.");
        } else {
            System.out.println("Bu hava koşullarında " + evn4 + " etkinliği sizin için uygun.");
        }
    }
}
