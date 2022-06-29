import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        LogicalOperations lo = new LogicalOperations();

        System.out.println("rezultatul primei metode este: " + metoda1());
        System.out.println("rezultatul metodei nr.2 este: " + metoda2());
        System.out.println("rezultatul metodei nr.3 este: " + metoda3());
        System.out.println("rezultatul metodei nr.4 este: " + metoda4());
        System.out.println("rezultatul metodei nr.5 este: " + metoda5());
        System.out.println("rezultatul metodei nr.6 este: " + metoda6());
        System.out.println("Rezultatul adunarii este: " + calc.adunare(2, 3));
        System.out.println("Rezultatul scaderii este: " + calc.scadere(2, 3));
        System.out.println("Rezultatul inmultirii este:" + calc.inmultire(2, 3));
        System.out.println("Rezultatul impartirii este:" + calc.impartire(2, 3));
        printStars();
        System.out.println("Rezultatul mediei este: " + calc.media(2, 3, 5));
        System.out.println("Rezultatul restului este:" + calc.rest(5, 6));
        System.out.println("Rezultatul temperaturii este: " + calc.temperatura(90));
        System.out.println("Rezultatul metrilor este: " + calc.metri(50));
        System.out.println("Rezultatul verificarii textului este: " + lo.verifyText("Mama mia"));
        System.out.println("Rezultatul exercitiului 5: "+ lo.verifyTextAndNumber("FastTrackIT", 2));
        System.out.println("Rezultatul exercitiului 6: "+lo.verifyTextAndNumber6(2));
        System.out.println("Rezultatul exercitiului 7: "+lo.verifyTextAndNumber7(7));
        System.out.println("Rezultatul compararii a 3 numbere: " + lo.biggest(10, 10, 5));
        lo.control(5);
        System.out.println("Rezultatul exercitiului 9:"+lo.isNumberEven(10));
        System.out.println("Rezultatul exercitiului 10:"+lo.isEligibleToVote(10));

    }

    static int metoda1() {
        int numar1 = 33;
        int numar2 = 4;
        int rezultat1 = numar1 + numar2;
        return rezultat1;
    }


    static float metoda2() {
        float numar3 = 10f;
        float numar4 = 3f;
        float rezultat2 = numar3 / numar4;
        return rezultat2;
    }

    static int metoda3() {
        int numar5 = -5;
        int numar6 = 8;
        int numar7 = 6;
        int rezultat3 = -5 + 8 * 6;
        return rezultat3;
    }

    static int metoda4() {
        int numar8 = 55;
        int numar9 = 9;
        int rezultat4 = (numar8 + numar9) % numar9;
        return rezultat4;
    }

    static float metoda5() {
        float numar10 = 20;
        float numar11 = -3;
        float numar12 = 5;
        int numar13 = 8;
        float rezultat5 = numar10 + numar11 * numar12 / numar13;
        return rezultat5;
    }

    static float metoda6() {
        float numar10 = 20;
        float numar11 = -3;
        float numar12 = 5;
        int numar13 = 8;
        float rezultat6 = numar10 + numar11 * numar12 / numar13;
        return rezultat6;
    }


    public static void printStars() {
        System.out.println
                ("     *   \n" +
                        "    ***  \n" +
                        "   ***** \n");

    }

}
