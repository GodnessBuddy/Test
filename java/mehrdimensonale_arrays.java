public class mehrdimensonale_arrays {
    public static void main(String[] args) {
        
        String[][] firstandlastname = new String[5][2];

        firstandlastname[0][0] = "Franz";
        firstandlastname[0][1] = "Bauer";

        firstandlastname[1][0] = "Felix";
        firstandlastname[1][1] = "Huber";

        firstandlastname[2][0] = "Fritz";
        firstandlastname[2][1] = "Meier";

        //Äßere For-Schleife: Zeilenidex -> i
        //innere For-Schleife: Spaltenindex -> j
        for(int i = 0; i < firstandlastname.length; i++) {
            for(int j = 0; j < firstandlastname[i].length; j++){
                System.out.print(firstandlastname[i][j] + " ");
           }
           System.out.println();
        }


    }
}
