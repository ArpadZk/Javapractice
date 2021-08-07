package exemple.incapsulare;

public class persoana {

    private String nume;
    private String prenume;
    private int varsta;
    private int cnp;

    public persoana(String nume, String prenume, int varsta,int cnp){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.cnp=cnp;
    }

    public String getNume(){
        return nume;
    }

    public String getPrenume(){
        return prenume;
    }

    public int getVarsta(){
        return varsta;
    }

    public int getCNP(){
        return cnp;
    }

    public void setNume(String nume){
        this.nume=nume;

    }

    public void setPrenume(String prenume){
        this.prenume=prenume;

    }







}
