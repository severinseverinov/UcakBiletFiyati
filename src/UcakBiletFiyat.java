import java.util.Scanner;

public class UcakBiletFiyat {
    public static void main(String[] args) {
        int distance,age,travelType;
        double ageDRate=0,travelTRate=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance=input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        travelType=input.nextInt();

        if((distance>0) && (age>0 && age<=115) && (travelType==1 || travelType==2)) {
            if (age < 12) {
                ageDRate = 0.50;
            }
            if (age >= 12 && age <= 24) {
                ageDRate = 0.10;
            }
            if (age >= 65) {
                ageDRate = 0.30;
            }
            if (travelType == 2) {
                travelTRate = 0.20;
            }
            ;

            double amount = distance * 0.10;
            double ageDiscount = amount * ageDRate;
            double newAmount = amount - ageDiscount;
            double travelTDiscount = newAmount * travelTRate;
            newAmount = newAmount - travelTDiscount;
            newAmount=newAmount*travelType;

            System.out.println("Toplam Tutar = "+newAmount+"TL dir.");

        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
