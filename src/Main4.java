public class Main4 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();

        int x = 10;
        op.printToHundred(x);
        int b = 3;
        op.countMinusHundred(b);
        int c = 4; int d = 6;
        op.countBetween(c,d);
        int e = 10; int f = 13;
        op.countBetweenef(e,f);
        op.displayEvenNumbers();
        op.displayUnevenNumbers();

        System.out.println(op.returnSum(5));
        System.out.println(op.returnAverage(2));
    }



}