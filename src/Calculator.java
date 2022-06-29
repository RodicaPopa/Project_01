public class Calculator {


        public int adunare ( int primulNumar, int alDoileaNumar){

            int rezultat = primulNumar + alDoileaNumar;

            return rezultat;

        }
    public int scadere(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;

    }
    public int inmultire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }
    public float impartire(float primulNumar, float alDoileaNumar) {
        float rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }
    public float media(int primulNumar, int alDoileaNumar, int alTreileaNumar) {

        float rezultat = (primulNumar + alDoileaNumar + alTreileaNumar) / 3f;

        return rezultat;

    }
    public float rest(int primulNumar, int alDoileaNumar) {

        float rezultat = (primulNumar % alDoileaNumar);

        return rezultat;

    }
    public float temperatura(float fahrenheit) {

        float temperatura = (5f / 9f * (fahrenheit - 32));

        return temperatura;

    }
    public float metri(float inch) {

        float metri = inch * 0.0254f;

        return metri;

    }
}
