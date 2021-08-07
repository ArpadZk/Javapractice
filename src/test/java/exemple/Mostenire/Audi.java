package exemple.Mostenire;
//mostenirea se face la nivel de clasa.
public class Audi extends Masina {


    public Audi(String marca, String model, String culoare, int an, String dotari) {   // prima data se apeleaza constructorul din clasa de baza
        super(marca, model, culoare, an, dotari);     // apoi se apeleaza constructorul pentru copil/ subclasa;
                                                        // In momentul in care o clasa mosteneste o alta clasa= prima data se apeleaza construcotul din clasa parine si apoi din clasa copil ;
                                                        // Ca sa apelezi constructoul dintr-o clasa parinte din clasa copil => super; ctrl+click pe super =te duce la constructor;
    }

    public void rezistentaMasina(){

        System.out.println("Masina cu marca "+marca+" ,modelul "+model+", din anul"+ an+" se strica repede" );

    }

    public void afiseazadetaliiModel (){
        System.out.println("O masina audi consuma mult : ( "); // Detalii despte o masina audi
        printinformatii();

    }

}
