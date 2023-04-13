package JavaLabH6Ornekler.Arraylar;
import java.security.SecureRandom;
import java.util.Scanner;
public class OgrenciYemekPuanlamasi {
    public static void main(String[] args) {

// 20 ogrenci yemekhanenin yemeklerini puanlıyorlar. 1 çok kötü 5 en iyi olacak şekilde puanlanacaktır.
// 20 cevabı arrayde tutup frekansını bulunuz...
        Scanner input = new Scanner(System.in);
        SecureRandom randomSayi= new SecureRandom();
            int[] puanlama= new int[20];
            int[] frekans = new int[6];
        System.out.println("Rastgele atama mı yapmak istersiniz? Yoksa kendiniz mi verileri gireceksiniz?");
        System.out.print("Rastgele ise 1'e, Kendiniz girecekseniz 2'ye basınız.\nSeçiminiz:");

            int tercih=input.nextInt();
            int cevap=0;

        if(tercih==1){
            for(int i=0; i<20; i++){
                puanlama[i]=1+randomSayi.nextInt(5);
                System.out.println((i+1)+".Ögrencinin puanı:"+puanlama[i]);
            }
        }

        if(tercih==2){
            for(int i=0; i<20; i++){
                System.out.print((i+1)+".Öğreninin puanını giriniz:");
                puanlama[i]= input.nextInt();
            }
            System.out.println("\n------------------------------");
            for(int i=0; i<20; i++){
                System.out.println((i+1)+".Ögrencinin puanı:"+puanlama[i]);
            }
        }

        for(int answer=0; answer<puanlama.length; answer++){

            try{
                ++frekans[puanlama[answer]];
                cevap++;
            }
            catch (Exception hataGoster){
                System.out.println("Hata Oluştu! "+ hataGoster.toString() );
            }
        }

        System.out.printf("%s%10s\n","Puanlama","Frekans");

        for(int puan=1; puan<frekans.length; puan++){
            System.out.printf("%4d%10d\n",puan,frekans[puan]);
        }
    }
}
