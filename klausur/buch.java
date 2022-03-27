package klausur;
public class buch{

    String titel;
    String autor;
    int isbn;
    double preis;
    static int anzahl;

    buch(String pT, String pAu, int pI, double pP){
        titel = pT;
        autor = pAu;
        isbn = pI;
        preis = pP;
        buch.anzahl++;
    }

}