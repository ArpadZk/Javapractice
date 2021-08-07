package TEME;

import org.junit.Test;

public class Hazi2 {
    public String nume;


//    EXERCISES     Clasa noua creeate
//    Rezolvam urmatoarele:
//      1) Citim 3 numere cu valori diferite.Daca suma primelor 2 numere este mai mare decat al 3 lea numar afisam un mesaj corespunzator
//          +valoarea sumei, altfel afisam contrariul
//      2) Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre
//      3) Problema de mai sus intr-un alt fel rezolvata
//      4) Primele 5 numere divizibile cu 3
//            4.1 -- Primele 3 numere dibizibile cu 5
//            4.2 -- Primele 4 numere pozitive si pare
//      5) Suma numerelor pana la 10
//            5.1 -- Produsul numerelor pana la 5
//            5.2 -- Problemele de mai sus le rescriem si in for/while in functie de ce abordare a avut fiecare

    @Test
    public void Test() {
        Treinumerecuvaloridiferite(12, 10, 33);
        AfisarecuvantulDA();
        Afisareprimele5numerediv3();
        Afisareprimele3numerediv5();
        Afisareprimele4numerepozitive();
        Sumanumerelorpanala10();
        Produsulnumerelor();
        Sumanumerelorpanala10while();

    }

    public void Treinumerecuvaloridiferite(int nr1, int nr2, int nr3) {
        int sum = nr1 + nr2;
        if (sum > nr3) {
            System.out.println("Cele trei numere: " + " " + nr1 + "," + nr2 + "," + nr3);
            System.out.println("Suma Nr1+Nr2 este:" + sum);
            System.out.println("Numarul 3 este: " + nr3);
            System.out.println("Suma Nr1 si Nr2 este mai mare de cat al 3 lea numar");
        } else {
            System.out.println("Cele trei numere: " + " " + nr1 + "," + nr2 + "," + nr3);
            System.out.println("Suma Nr1+Nr2 este:" + sum);
            System.out.println("Numarul 3 este: " + nr3);
            System.out.println("Suma Nr1 si Nr2 nu este mai mare de cat al 3 lea numar");
        }
    }
    public void AfisarecuvantulDA() {
        nume = "DA";
        System.out.println();
        System.out.println("Afisare cuvantul DA: ");
        System.out.println(nume + " " + nume + " " + nume + " " + nume + " " + nume);
    }
    public void Afisareprimele5numerediv3() {
        System.out.println("Primele 5 numere divizibile cu 3:");
        for (int index = 1; index <= 15; index++) {
            if (index % 3 == 0) {
                System.out.print(" " + index);
            }
        }
    }
    public void Afisareprimele3numerediv5() {
        System.out.println();
        System.out.println("Primele 5 numere divizibile cu 3:");
        for (int index = 1; index <= 15; index++) {
            if (index % 5 == 0) {
                System.out.print(" " + index);
            }
        }
    }
    public void Afisareprimele4numerepozitive() {
        System.out.println();
        System.out.println("Primele 4 numere pozitive:");
        for (int index = 1; index <= 8; index++) {
            if (index % 2 == 0) {
                System.out.print(" " + index);
            }
        }
    }
    public void Sumanumerelorpanala10(){
        int sum=0;
        for (int index=1;index<=10;index++){
            if(index<=10){
                sum=sum+index;
            }
            else{
                break;
            }
        }
        System.out.println();
        System.out.println("Suma primele 10 numar este: "+sum);
    }
    public void Produsulnumerelor(){
        int sum=1;
        for (int index=1;index<=5;index++){
            if(index<=5){
                sum=sum*index;
            }
            else{
                break;
            }
        }
        System.out.println();
        System.out.println("Suma produsul primele 5 numar este: "+sum);
    }
    public void Sumanumerelorpanala10while(){
        System.out.print("Suma primele 10 numar este: ");
        int index=0;
        while (index<=10){
            index++;
            System.out.print(","+index);
        }
    }
}