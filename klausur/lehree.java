package klausur;

public class lehree {
    private String nachname;
    private String vorname;
    private int alter;  
    
    public void setNachname(String nachname){
        if(nachname == null || nachname.equals("") || nachname.length() > 50){
            System.out.println("Falsche Eingabe");
       }
       else{
           this.nachname = nachname;
           System.out.println("Nachname wurde geändert");
       }
    }

    public void setAlter(int alter){
        if(alter < 16 || alter > 70){
            System.out.println("alter ist ungültig");
        }
        else{
            this.alter = alter;
            System.out.println("alter ist gültig");
        }
    }
    public int getAlter() {
        return alter;
    }
    public String getNachname() {
        return nachname;
    }
    public String getVorname() {
        return vorname;
    }
}
