package czitnetwork;

public class Pojisteny {
    String jmeno;
    String prijmeni;
    int vek;
    String telefon;

    // vytvoreni pojisteneho
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    // vypsani pojisteneho
    @Override
    public String toString() {
        return "Jméno: " + jmeno + " " +  "Příjmení: " + prijmeni + " " +  "Věk: " + vek + " " + "Telefon: " + telefon;
    }
}