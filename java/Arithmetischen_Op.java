import java.util.Scanner;

public class Arithmetischen_Op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int number1 = 5;
        int number2 = 3;
        System.out.println(number1 +""+ number2);
        System.out.println("bitte titel eingebn");
        Buch b1=new Buch(sc.nextLine(), "bumse Biene");
        System.out.println(b1.titel);
        System.out.println("bitte nummer eingeben");
        while(number2==3){ 
        if(sc.hasNextInt()==true){ 
        number1 = sc.nextInt(); 
        number2=1; 
        }
        else{
            System.out.println("1");
            System.out.println("Falsche Eingabe!");
            System.out.println("1");
            
            break;
        }
        }
    }

}
