package exemple;

import org.junit.Test;

public class Structuri {
    // 2 tipuri de structuri: alternative si repetitive
    // la alternativa: daca.. (conditie).. atunci
    //                                   altfel
    // repetitive: se executa o bucata de cod de 1... m ori
    // repetitive: while sau for

    @Test
    public void Test() {
        VerificaNumere(5, 2);
        VerificaNumere(6, 8);
        VerificaNumere(2, 2);
        VerificaNumere(-3, -4);
        Verificapropozitia("Ana are mere", "mere");
        Verificapropozitiedemaimultecuvinte("Ana are mere si pere", "mere", "pere");
        Verificadacaccontienunsingurcuvant("Ana are mere,pere,prune", "mere", "cirese");
        Afiseaza100numere();
        Afiseazanumeredela1000();
        Afisaredela0while();
        Calculeazasuma();
        Afiseazaprimele5numere();
        Afiseazanumerepare();
        Sumanumerelorimpare();
    }

    // verificam daca numarul 5 > 3
    // verificam daca primul nr > al doilea
    public void VerificaNumere(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("Pentru numerele " + nr1 + " si " + nr2 + " rezultatul este corect ");
        } else {
            System.out.println("Pentru numerele " + nr1 + " si " + nr2 + " rezultatul este incorect ");
        }
    }

    // Verificam daca o propozitie contine un anumit cuvant
    public void Verificapropozitia(String porozitie, String cuvant) {
        if (porozitie.contains(cuvant)) {
            System.out.println();
            System.out.println("Propozitia contine cuvantul ");
        } else {
            System.out.println("Propozitia nu contine cuvantul");
        }
    }

    // Verifica daca o propozitie contine mai multe cuvinte
    // && --> si
    public void Verificapropozitiedemaimultecuvinte(String propozitie, String cuvant1, String cuvant2) {
        if (propozitie.contains(cuvant1) && propozitie.contains(cuvant2)) {
            System.out.println();
            System.out.println("Propozitia contine cuvintele ");
        } else {
            System.out.println("Propozitia nu contine cuvintele");
        }
    }

    //Verifica daca contine numai 1 din 2
    // || --> sau
    public void Verificadacaccontienunsingurcuvant(String propozitie, String cuvant1, String cuvant2) {
        if (propozitie.contains(cuvant1) || propozitie.contains(cuvant2)) {
            System.out.println();
            System.out.println("Propozitia contine 1 din 2");
        } else {
            System.out.println();
            System.out.println("Propozitia nu contine nici una");
        }
    }

    // Afisam pe tastatura primele 100 numere
    // for --> 3 conditii: 1) de la ce numar incepi
    //                     2) conditia pana cad sa parcurg
    //                     3) conditia sa treaca la elementul urmator
    // <= sau <+1
    // index++ => index=index+1
    public void Afiseaza100numere() {
        System.out.println();
        System.out.print("Numere de la 0 - 100:");
        for (int index = 0; index <= 1000; index++) {
            System.out.print("," + index);
        }
    }

    //Afisam numerele de la 1000 la 0
    public void Afiseazanumeredela1000() {
        System.out.println();
        System.out.print("Numere de la 1000 - 0:");
        for (int index = 1000; index >= 0; index--) {
            System.out.print("," + index);

        }
    }

    //Afisam numerele de la 0 la 100 (while)
    public void Afisaredela0while() {
        System.out.print("Numerele de la 0--100 while: ");
        int index=0;
        while (index<=100){
            index++;
            System.out.print(","+index);
        }
    }
    // Calculeaza suma primelor 5 numere de la 1->20
    public void Calculeazasuma(){
        int suma=0;
        for (int index=1;index<=20;index++){
            if (index<=12){
                suma = suma+index;

            }
            else {
                break;
            }
        }
        System.out.println();
        System.out.println("Suma numerelor este: "+suma);
    }

    //Afisam primele 5 numere din intervalul 1-20
    public void Afiseazaprimele5numere(){
        System.out.println("Primele 5 numere: ");
        for (int index=1;index<=20;index++){
            if (index<=5){
                System.out.print(","+index);
            }
            else {
                break;
            }
        }
    }
    // Afisam numerele pare de la 1 pana la 50
    // daca rest => %
    // cat => /
    // = atribui o valoare
    // == reprezinta egalul pe care noi intelegem
    public void Afiseazanumerepare(){
        System.out.println();
        System.out.println("Numere pare:");
        for(int index=1; index<=50; index++){
            if (index%2==0){
                System.out.print("," + index);
            }
        }
    }
    // Afiseaza suma numerelor impare de la 1 pana la 50
    public void Sumanumerelorimpare(){
        int suma=0;
        for(int index=1; index<=50; index++){
            if (index%2==1){
                suma=suma+index;
            }
        }
        System.out.println();
        System.out.println("Suma numerelor impare este: "+suma);
    }
}


