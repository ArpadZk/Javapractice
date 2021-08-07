package exemple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TelefonTest {

    // Obiect = instanta unei clase
    // Obiect recunost dupa "new"
    // Obiect = numele clase + nume obiect = new nume clasa(se apeleaza constructorul clasei) + valori pentru parametri daca are
    // Pot sa ai cate obiecte vrei, dar sa aibe nume unic


    @Test
    public void metodaTest() {
        Telefon Samsung = new Telefon("Samsung", "S21", "Negru", true);
        Telefon Iphone = new Telefon("Iphone", "11", "Negru", true);
        Telefon Huawei = new Telefon("Huawei", "P30", "Alb", true);
        Telefon Nokia = new Telefon("Nokia", "2001", "Negru");
        Telefon Asus = new Telefon("Asus", "C12", "Negru", true);
        Telefon Oneplus = new Telefon("Oneplus", "Nord", "Alb", true);


        System.out.println("--------------");
        List<Telefon> telefoane = new ArrayList<>();
        telefoane.add(Samsung);
        telefoane.add(Huawei);
        telefoane.add(Nokia);
        telefoane.add(Iphone);
        telefoane.add(Asus);
        telefoane.add(Oneplus);
        Samsung.numarTelefoaneStoc(telefoane);

        System.out.println("--------------");

        Samsung.printMarca();
        Huawei.printMarca();
        Iphone.printCuloare();
        Iphone.printMarca();
        Nokia.printCamera();
        Samsung.areIncarcator();
        Iphone.areIncarcator();
        Nokia.areIncarcator();
        Huawei.areCamera();
        Nokia.areCamera();

        System.out.println("---------------");
        Samsung.printModel();
        Samsung.Model = "S20";
        Samsung.printModel();

        System.out.println("---------------");
        Nokia.areCamera();
        Nokia.Camera = true;
        Nokia.areCamera();


    }
}
