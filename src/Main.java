import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println(riempiColori());
    }

    public static HashSet<String> riempiColori() {

        HashSet<String> colori = new HashSet<>(Arrays.asList("Rosa", "Bianco", "Blu"));

        HashSet<String> colori1 = new HashSet<>(Arrays.asList("Verde", "Giallo"));

        colori.addAll(colori1);

        System.out.println("Il colore verde fa parte del set di colori: " + colori.contains("Verde"));

        return colori;
    }
}