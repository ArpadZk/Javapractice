package exemple;

import java.util.List;

public class Telefon {

    // OOP -- Programare orientate obiect
    // Constructor = Are ca rol sa initializeze variabilele unei clase
    // Constructor = public + nume clasa + (poate sa aiba sau nu perametri) + {}
    // Intr-o clasa exista un constructor fara parametri
    // Pot sa ai mai multi constructori intr-o clasa
    // Nume constructor = Nume clasa (ugyanaz kell legyen)

    // value type vs reference type

    public String Marca;
    public String Model;
    public String Culoare;
    public Boolean Camera;          // Boolean =True/Fals

    //Constructor    //this se uita la variabile
    public Telefon(String Marca, String Model, String Culoare, Boolean Camera) {
        this.Marca = Marca;
        this.Model = Model;
        this.Culoare = Culoare;
        this.Camera = Camera;
    }
    //Constructor 2
    public Telefon(String Marca, String Model, String Culoare){
        this.Marca = Marca;
        this.Model = Model;
        this.Culoare = Culoare;
    }

    public void printMarca(){
        System.out.println("Marca telefon este:"+ Marca);
    }
    public void printModel(){
        System.out.println("Model:"+ Model);
    }
    public void printCuloare(){
        System.out.println("Culoarea telefonului este:"+Culoare);
    }
    public void printCamera() {
        System.out.println("Telefonul are sau nu camera:"+ Camera);
    }
    public void areIncarcator(){
        if (Marca.equals("Iphone")) {
            System.out.println("Nu are incarcator.");
        }
        else {
            System.out.println("Are incarcator.");

        }
    }

    public void areCamera(){
        if (Camera==null || Camera.equals(false)){
            System.out.println("NU are camera.");
        }
        else {
            System.out.println("Are camera.");
        }
    }
    public void numarTelefoaneStoc(List<Telefon> telefoane) {
        System.out.println("Numarul telefoanelor din stoc este:"+ telefoane.size());
    }
}
