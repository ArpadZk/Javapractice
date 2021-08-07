package exemple.Mostenire;

// 4 concepte de oop ;

// OOP - Mostenire = Bunici- Casa - obiecte - nepoti
// Mostenirea e conceptul prin care o clasa mosteneste o alta clasa; In Java poti sa mostenesti o singura clasa;
// Ca sa mostenesti o clasa == folosim cuvantul extends;
// Clasa care extinde o alta clasa == este o subclasa/ clasa copii;
// Clasa care e extinsa de o alta clasa = clasa de baza/ clasa parinte ;
//

//
public class Masina {

    String marca;
    String model;
    String culoare;
    int an;
    String dotari;



    public void printinformatii(){
        System.out.println(" Marca este" + marca);
        System.out.println(" Modelul este" + model);
        System.out.println("Culoarea este" +culoare);
        System.out.println("Anul este:" +an);
        System.out.println("Dotarile sunt " + dotari);

    }

    public Masina(String marca, String model, String culoare, int an, String dotari) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
        this.dotari = dotari;
    }
}
