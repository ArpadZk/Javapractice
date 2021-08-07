package exemple.incapsulare;

public class Student extends persoana {


    public Student(String nume, String prenume, int varsta, int cnp) {
        super(nume, prenume, varsta, cnp);

    }

    public void afiseazadetaliistudent(){
        System.out.println("Numele este "+getNume());
        System.out.println("Prenumele este "+getPrenume());
        System.out.println("CNP "+getCNP());
        System.out.println("Varsta:  "+getVarsta());

    }

    public void modificadate(String nume,String prenume){

        setNume(nume);
        setPrenume(prenume);

    }

}
