import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.GERMANY);

        Bebida cafe = new BebidaCafe();
        System.out.println(cafe);

        Bebida cafeComLeite = new BebidaComLeite(cafe);
        System.out.println(cafeComLeite);

        Bebida cafeComAcucar = new BebidaComAcucar(cafe);
        System.out.println(cafeComAcucar);

        Bebida cafeComAcucarELeite = new BebidaComAcucar(cafeComLeite);
        System.out.println(cafeComAcucarELeite);
    }
}
