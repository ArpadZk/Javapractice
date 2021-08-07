package exemple.Mostenire;

import org.junit.Test;

public class masiniTest {


    @Test
    public void testammasini(){

//     Audi audi = new Audi("Audi","A8","Negru", 2019, "GPS, mod sport,incalzire scaune");
//        audi.rezistentaMasina();
//        audi.afiseazadetaliiModel();
//        audi.printinformatii();

    //..................................................................................//


        Reanult renault = new Reanult("Renault", " Clio", "alb", 2014, " AC si bluetooth ");
        renault.marca="trabant";
        renault.Afiseazainformatii();

        Dacia sandero = new Dacia ("Dacia", "Sandero", "gri", 2005, "Plastic");
        sandero.Afiseazainformatii();


//        System.out.println("_______________________________________________________________________________");
//        Skoda skoda = new Skoda("Skoda ", " Fabio", " Gri", 1998, "A/C");
//
//        skoda.esteElectrica();
//        skoda.afiseazaDetalii();
//        skoda.printinformatii();







    }



}
