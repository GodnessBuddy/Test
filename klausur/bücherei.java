package klausur;

public class bücherei {
    public static void main(String[] args) {
        Mangas[] manga = new Mangas[101];
        manga[2] = new Mangas();


        System.out.println("der titel lautet:"+ manga.getTitel[2]);

        manga[100] = manga[2];
        manga[2] = null;

        manga[101] = null;


    }
}
