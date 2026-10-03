public class Convertendo {
    public static void main(String[] args) {

        double numero1 = 60.5;
        int numero2 = 23;

        int conversor = (int) (numero1);
        System.out.println(conversor);

        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroInteiro);

    }
}
