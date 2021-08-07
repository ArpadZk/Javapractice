package TEME;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class hazi1<numarVirgula> {
//    Clasa noua creeata
//    Afiseaza pe ecran urmatoarele:
//    PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI
//
//    - Hello World 1
//    - Varsta ta (numar) 2
//    - Numele si prenumele pe 2 randuri 3
//    - (Tot) Care ii data de astazi? 4
//      1/13/2019 1
//      18:30 PM 1
//      Marti/Joi 1
//    - Cat face [2+(3*4)-3]/3 ?  5
//      Rezultatul corect este: {rezultatul}
//    - afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj 6
//    - afiseaza pe ecran produsu a 2 numere integer intr-o variabila de acelasi tip+mesaj 7
//    - concateneaza la valoarile rezultate de mai sus mesajul "Stiu ca am calculat bine" si afiseaza-l pe ecran cu tot cu rezultatul calculului 8
//    - Adauga la "Salut" caracterul "M" la final  9
//    - Adauga la "Hello" caracterul "H" la inceput  10
//    - Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z" 11
//    - Comenteaza cerinta 2 4 6 12
//    - Decomenteaza cerintele comentate 13
//    - Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!" 14

    public int numar;
    public char litera = 'z';
    public String nume;
    public double numarVirgula;

    @Test
    public void Metodatest() {
        //apelez metoda care imi afiseaza numele pe tastatura
        AfisareHW();
        Afisarevarsta();
        Afisarenume();
        AfisareTD();
        Calcul(2,3,4,3,3);
        Calcul3(2.5,2.5,2.5);
        System.out.println(getmesaj());
        Calcul2(10,10);
        System.out.println(getmesaj2());
        AfisareS();
        AfisareH();
        AfisareAna();
    }

    public void AfisareHW() {
        nume = "Hello World";
        System.out.println("Cerinta 1:");
        System.out.println(nume);
        System.out.println();
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
    }

    public void Afisarevarsta(){
        numar = 27;
        System.out.println("Cerinta 2:");
        System.out.println(numar);
        System.out.println();
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
    }

    public void Afisarenume(){
        nume="Kisgyorgy";
        System.out.println("Cerinta 3:");
        System.out.println(nume);
        nume= "Arpad Zsolt";
        System.out.println(nume);
        System.out.println();
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
    }

    public void AfisareTD() {
        System.out.println("Cerinta 4:");
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
        System.out.println();
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
    }

    public void Calcul(double nr1, double nr2, double nr3, double nr4, double nr5) {
        System.out.println("Cerinta 5: ");
        double suma = (nr1 + (nr2 * nr3) - nr4)/nr5;
        System.out.println("Rezultatul corect este: "+ suma);
        System.out.println();
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
    }

    public void Calcul3(double nr1, double nr2, double nr3) {
        System.out.println("Cerinta 6:");
     double suma =nr1+nr2+nr3;
        System.out.println("Rezultatul corect este: "+suma);
    }

    public String getmesaj(){
        String mesaj="Stiu ca am calcualt bine";
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
        return mesaj;
    }

    public void Calcul2(int nr1, int nr2){
        System.out.println();
        System.out.println("Cerinta 7: ");
        int suma =  nr1*nr2;
        System.out.println("Rezultatul corect este:"+ suma);
    }

    public String getmesaj2() {
        String mesaj = "Stiu ca am calcualt bine";
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
        return mesaj;
    }

    public void AfisareS() {
        nume = "Salut";
        litera= 'M';
        System.out.println();
        System.out.println("Cerinta 9:");
        System.out.println(nume+litera);
        System.out.println();
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
    }

    public void AfisareH() {
        nume = "Hello";
        litera='H';
        System.out.println("Cerinta 10:");
        System.out.println(litera+nume);
        System.out.println();
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
    }

    public void AfisareAna() {
        nume = "Ana are mere,pere,prune";
        litera ='z';
        System.out.println("Cerinta 11:");
        System.out.println(nume + litera);
        System.out.println();
        System.out.println("Poti pleca acasa dupa ce iti verific munca");
        System.out.println();
    }

}


