public class methoden_mit_rückgabewert {
    public static void main(String[] args) {
        
        System.out.println("Vor der Methodenaufruf");
        int resultfromdosomething = doSomething(30, 50);
        System.out.println(resultfromdosomething);
        int diffdosomething = doSomething(20, 30);
        System.out.println(diffdosomething);
        System.out.println("nach dem Metohdenaufruf");

    }

    public static int doSomething(int number1, int number2) {
        return number1 + number2;
    }

}
