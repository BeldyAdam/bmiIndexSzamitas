package bmiindexszamitas;

import java.util.Scanner;


public class BmiIndexSzamitas {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
//        20 a sovany
//        25 a normal
//        30 a tulsuly
//        40 a elhizott
//        korosan elhizott
    bmiFeladat();
    }

    private static void bmiFeladat() {
        kiir("BMI kiszámítása\n");
        int m = beker("Testmagasság: ", 100, 200);
        int t = beker("Testtömeg: ", 40, 150);
        double bmi = bmiSzamit(t, m);
        ertekeles(bmi, m, t);
        System.out.println(bmi);
    }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }

    private static int beker(String kerdes, int min, int max) {
        kiir(kerdes);
        int szam = sc.nextInt();
        while (szam < min || szam > max){
            kiir(kerdes);
            szam = sc.nextInt();
        }
        return szam;
    }

    private static double bmiSzamit(int t, int m) {
       return (t/Math.pow(1.0*m/100,2));
    }

    private static void ertekeles(double bmi, int m, int t) {
        if(bmi < 20){
            kiir("Ön sovány\n");
        }else if(bmi < 25){
            kiir("Ön normál\n");
        }else if(bmi < 30){
            kiir("Ön túlsúlyos\n");
        }else if(bmi < 40){
            kiir("Ön elhított\n");
        }else if(bmi > 40){
            kiir("Ön kórosan elhízott\n");
        }
    }
    
}
