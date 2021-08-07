package exemple.incapsulare;

import org.junit.Test;

public class testincapsulare {

    @Test
    public void testaminapsulare(){


        Student Mihai = new Student("Jina","Mihai",24,1008839447);

        Mihai.afiseazadetaliistudent();
        Mihai.modificadate("Dorca", "Mircea");
        Mihai.afiseazadetaliistudent();


    }

}
