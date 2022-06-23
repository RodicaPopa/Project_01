import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("rezultatul primei metode este: " + metoda1());
        System.out.println("rezultatul metodei nr.2 este: " + metoda2());
        System.out.println("rezultatul metodei nr.3 este: " + metoda3());
        System.out.println("rezultatul metodei nr.4 este: " + metoda4());
        System.out.println("rezultatul metodei nr.5 este: " + metoda5());
        System.out.println("rezultatul metodei nr.6 este: " + metoda6());
        System.out.println("Rezultatul adunarii este: " + adunare(2, 3));
        System.out.println("Rezultatul scaderii este: " + scadere(2, 3));
        System.out.println("Rezultatul inmultirii este:" + inmultire(2, 3));
        System.out.println("Rezultatul impartirii este:" + impartire(2, 3));
        printStars();
        System.out.println("Rezultatul mediei este: " + media(2, 3, 5));
        System.out.println("Rezultatul restului este:" + rest(5, 6));
        System.out.println("Rezultatul temperaturii este: " + temperatura(90));
        System.out.println("Rezultatul metrilor este: " + metri(50));
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

    public static int adunare(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    }

    public static int scadere(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;

    }

    public static int inmultire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public static float impartire(float primulNumar, float alDoileaNumar) {
        float rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }

    public static void printStars() {
        System.out.println
                ("     *   \n" +
                        "    ***  \n" +
                        "   ***** \n");

    }

    public static float media(int primulNumar, int alDoileaNumar, int alTreileaNumar) {

        float rezultat = (primulNumar + alDoileaNumar + alTreileaNumar) / 3f;

        return rezultat;

    }

    public static float rest(int primulNumar, int alDoileaNumar) {

        float rezultat = (primulNumar % alDoileaNumar);

        return rezultat;

    }

    public static float temperatura(float fahrenheit) {

        float temperatura = (5f / 9f * (fahrenheit - 32));

        return temperatura;

    }

    public static float metri(float inch) {

        float metri = inch * 0.0254f;

        return metri;

    }
}
