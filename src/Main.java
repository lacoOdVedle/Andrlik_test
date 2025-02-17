import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //5. Zadání
        //1D pole řetezců
        String[] slova = {"kanec", "žába", "tučňák", "kočka"};
        System.out.println((String.join(" - ", slova)));
        //1D pole znaků
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo N: ");
        int N = sc.nextInt();
        sc.nextLine();
        String[] pismena = new String[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Zadej " + (i + 1) + "-té jméno");
            pismena[i] = sc.nextLine();
        }
        System.out.println("Kolikáté písmeno by jsi chtěl znát???");
        int cislo = sc.nextInt();
        if (cislo > pismena.length) {
            System.out.println("Pole je moc malé!");
        }
        else {
            System.out.println(pismena[cislo - 1]);
        }
        //pole objektů
        Hodnoceni[] vysvedceni = new Hodnoceni[5];
    }
}