package klausur;

public class wald {

    public static void main(String[] args) {
        baumfall(5);
    }

    public static void baumfall(int a){
        System.out.println("hacken");
        if(a <= 1){
            System.out.println("Baumfällt");
        }
        else{
            baumfall(a-1);
        }
    }
    
}

