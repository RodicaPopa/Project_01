package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog ralf = new Dog();
        System.out.println(ralf.name);
        ralf.play();


        AdaptorIlinca ilinca = new AdaptorIlinca();
        System.out.println(ilinca.name);
        System.out.println(ilinca.sum);
        ilinca.buy();


        DogFood kaja = new DogFood();
        System.out.println(kaja.name);
        System.out.println(kaja.price);
        System.out.println(kaja.quantitykg);
        kaja.setPrice();
        kaja.setNameOfFood();
        kaja.availablequantity();

        Doctor xfile = new Doctor();
        System.out.println(xfile.name);
        xfile.setJob();
        xfile.setName();
    }
}