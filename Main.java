import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double tutar,kdvTutar,kdvliTutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        if(tutar >= 0 && tutar <= 1000){
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;
        }else{
            kdvOran = 0.08;
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;
        }

        System.out.println("Kdvsiz tutar: "+tutar);
        System.out.println("Kdvli tutar: "+kdvliTutar);
    }
}