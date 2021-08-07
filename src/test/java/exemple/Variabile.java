package exemple;

import org.junit.Test;
public class Variabile {
    // Clasa = o colectie de variabile si metode
    // Structura = access control (public) + class + nume clasa + acolade
    // Intr-un fisier java pot sa ai mai multe clase!
    // Fiecare clasa trebuie sa aiba un nume diferit
    // Daca vrem mai  multe clase int-un fisier = 1 clasa public si restul nu!

    // O variabila + atributul unei clase
    // Tipuri variabile = 2 tipuri (globale si locale)
    // Sructura globa = acces control (public) + tip variabila + nume +';'
    // Structura locala = tip variabila + nume
    // O variabila poate sau nu sa primeasca o valoare

    public int numar;
    public char litera;
    public String nume;
    public double numarVirgula;

    // O metoda = "actiune" pe care o poate face o clasa cu sau fara variabile;
    // Metodele sunt de 2 tipuri = 1. Metode "void" (metode care nu arata ceva)
    //                            2. Metode "return"( metode care nu returneaza ceva)
    // Structura metoda void = access control(public) + void(tip metoda) + nume + "()" {}
    // Metodele pot sau nu sa contina parametri
    // Parametri fac referire la valori care vin din afara metodei
    // Facem o metoda de test
    // Ca sa fie o metoda de test = ma folosesc de JUnit
    // JUnit = "@Test" deasupra metodei
    @Test
     public void Metodatest() {
        //apelez metoda care imi afiseaza numele pe tastatura
        Afisarenume();
        Afiseazadata();
        Infinteazavariabile();
        //Hozza adni barmilyen nevet!
        Afisareunnumegeneral("Bogdan");
        Afisareunnumegeneral("Cristi");
        Afisareunnumegeneral("Zsolt");
        Calculsuma(4, 6, 10);
        Calculsuma(4, 10, 10);
        System.out.println("Salariul este: " + getSalariu());
        System.out.println(getmesaj());
    }

    // Metoda care imi afiseaza numele pe tastatura
    public void Afisarenume() {
         nume="Arpad";
         System.out.println("Cerinta 1:");
         System.out.println(nume);
    }
    //Metoda care afiseaza un nume pe tastatura!! (orice nume/nivel generala)
    // ex. faci un cont(cu ce data vrei tu)
    //Parametri se scriu intre "()"
    //Parametri se dlimiteaza cu","
    //Parametri au structura ca o variabila locala
    //Barmilyen nev hozza adasa!
    public void Afisareunnumegeneral(String Numegeneral){
        nume=Numegeneral;
        System.out.println("Cerinta 4:");
        System.out.println(nume);
    }

    //Metoda care afiseaza data si ziua de astazi
    public void Afiseazadata(){
         String data="10 Iulie 2021";
         String ziua="Sambata";
         System.out.println("Cerinta 2:");
         System.out.print(data+" ");
         System.out.println(ziua);

    }
    //Metoda care initializeaza restul variabilelor
    public void Infinteazavariabile(){
         numarVirgula=2.5;
         numar=20;
         litera='A';
         System.out.println("Cerinta 3:");
         System.out.println(numarVirgula);
         System.out.println(numar);
         System.out.println(litera);
    }

    //Metoda care calcueaza suma 3 numere intregi
    //local mert itt szamolja ki es csak az eredmenyt irja ki
    public void Calculsuma(int nr1, int nr2, int nr3){
         System.out.println("Cerinta 5:");
         int suma=nr1+nr2+nr3;
         System.out.println("Suma celor 3 numere este: " + suma);
    }

    //O metoda care returneaza salarul unui angajat
    //Structura metoda "return" = access control(public) + tip de valoare de returnat + nume +"()" + "{}"

    public double getSalariu(){
         System.out.println("Cerinta 6: ");
         double Salariu =10.589;
         return Salariu;
    }
    // Metoda care returneaza un mesaj

    public String getmesaj(){
        System.out.println("Cerinta 7: ");
        String mesaj= "Masodik ora!";
        return mesaj;
    }
}
