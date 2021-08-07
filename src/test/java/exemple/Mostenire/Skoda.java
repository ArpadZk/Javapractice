package exemple.Mostenire;

public class Skoda extends Masina {


    public Skoda(String marca, String model, String culoare, int an, String dotari) {
        super(marca, model, culoare, an, dotari);


    }

    public void esteElectrica (){
        System.out.println("Masina cu marca "+marca+" ,modelul "+model+", din anul"+ an+" este electrica" );

    }

    public void afiseazaDetalii(){
        printinformatii();

    }
}
