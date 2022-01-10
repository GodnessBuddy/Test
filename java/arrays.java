public class arrays {
    public static void main(String[] args) {
        
        String[] names = new String[3];//die größe eines Arrays wird immer bei der initialisirung fest gelegt
        
        names[0] = "Hendrick";
        names[1] = "Paul";
        names[2] = "Fabienne";
        /*
        System.out.println(names[1]);
        */

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }
}
