public class LogicalOperations {


        public int checkBiggerNumber(int first, int second) {
            if (first < second) {
                return second;
            } else {
                return first;
            }
        }

        public String verifyText(String text) {
            if (text.equals("FastTrackIT")) {
                return "Learning text comparison";
            } else {
                return "Got to try some more";
            }

        }
    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number<=3) {
            return text+number;
        } else {
            return number+text;
        }

    }
    public String verifyTextAndNumber6(int number){

        if (number > 8 || number == 6) {

            return "The amount of snow this winter was(cm): " + number;

        } else {

            return "The forecast snow is(cm): " + number;

        }

    }

    public String verifyTextAndNumber7(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {

            return "The number is equal to 4";

        } else if (number < 3) ;
        {

            return "The number is lower than 3";

        }
    }

    public void control(int number){
            switch (number){
                case 0:
                    System.out.println("The number is: 0");
                    break;
                case 1:
                    System.out.println("The number is 1");
                    break;
                case 2:
                    System.out.println("The number is 2");
                    break;
                case 3:
                    System.out.println("The number is 3");
                default:
                    System.out.println("The number is out of range");
            }
    }
    public int biggest(int one, int two, int three) {
        if(one > two){
            if(one > three){
                return one;
            }
            else{
                return three;
            }
        }
        else{
            if(two > three){
                return two;
            }
            else{
                return three;
            }
        }
    }
    public boolean isNumberEven(int number){
        if (number % 2 == 0){

            return true;

        } else {

            return false;

        }

    }
    // Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public boolean isEligibleToVote(int number){
            if (number >= 18) {
                return true;
            }else{
                return false;
            }
    }

    public void printToHundred(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void countMinusHundred(int b) {

        for (int i = b; i >= -100; i--) {

            System.out.println(i);

        }

    }
    public void countBetween(int c, int d) {
        for (int i = c; i <= d; i++) {
            System.out.println(i);
        }
        for (int i = c; i >= d; i--) {
            System.out.println(i);
        }

    }

    //Creati o metoda in clasa LogicalOp,
    // care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void countBetweenef(int e, int f) {
        if(e < f){
            for (int i = e; i <= f; i++) {
                System.out.println(i);
            }
        } else if(f < e){
            for (int i = f; i <= e; i++) {
                System.out.println(i);
            }
        }else{
            System.out.println("Numbers are equals");
        }
    }
    public void displayEvenNumbers() {

        for(int i = 0; i<= 100;i++){

            if(i % 2 == 0){

                System.out.println(i);

            }

        }

    }
    public void displayUnevenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
        public int returnSum(int a) {
            int sum = 0;
            for(int i = a; i<= 100;i++){
                sum += i;
            }

            return sum;

        }
    public int returnAverage(int a) {
        int sum = 0;
        int counter = 0;
        for(int i = a; i<= 100;i++){
            sum += i;
            counter ++;
        }
        return sum/counter;

    }
    }




