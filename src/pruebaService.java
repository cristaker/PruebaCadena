public class pruebaService implements pruebaAPI {

    @Override
    public int suma(int a, int b) {

        System.out.println("La suma es: " + (a+b));

        return 1;
    }
}
