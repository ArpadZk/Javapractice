package exemple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multime {

    @Test
    public void metodaTest(){
        AfiseazalistanumeArray();
        AfiseazalistanumeList();
        AfiseazalistanumeMap();
    }

    // o multime --> string[]
    public void AfiseazalistanumeArray() {
        String[] listanume = new String[5];
        listanume[0] = "Szabi";
        listanume[1] = "Peter";
        listanume[2] = "Arpad";
        listanume[3] = "Balazs";
        listanume[4] = "Tamas";
        for (int i = 0; i < listanume.length; i++) {
            System.out.println(listanume[i]);
        }
    }
    // Diferente
    // la List nu este lim.maxim
    //inser

    public void  AfiseazalistanumeList(){
        System.out.println();
        List<String> listanume = new ArrayList<>();
        listanume.add("Emese");
        listanume.add("Reka");
        listanume.add("Attila");
        for(int i = 0; i<listanume.size(); i++){
            System.out.println(listanume.get(i));
        }
    }
    public void AfiseazalistanumeMap(){
        System.out.println();
        HashMap<String,List<String>> listanumeMap = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj Napoca");
        oraseRomania.add("Brasov");
        oraseRomania.add("Sfantu Gheorghe");
        oraseRomania.add("Timisoara");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Alicante");

        listanumeMap.put("Spania",oraseSpania);
        listanumeMap.put("Romania",oraseRomania);


        System.out.println(listanumeMap);
    }
}
