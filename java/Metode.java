public class Metode {
    public static void main(String[] args) {
        
        System.out.println("Vor der Methodenaufruf");
        doSomething(22, 22);
        System.out.println("nach dem Metohdenaufruf");

    }

    public static void doSomething(int number1, int number2) {
        int x = number1;
        int y = number2;
        int result = x + y;
        System.out.println(result);
    }

}
