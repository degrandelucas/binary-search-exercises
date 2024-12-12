import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.random.RandomGenerator;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Set<Integer> listaNumeros = new TreeSet<>();
        Random generator = new Random();
        int numeroProcurado = 28;

        do  {
            listaNumeros.add(generator.nextInt(129));
        } while (listaNumeros.size() < 128);

        System.out.println(listaNumeros);

        

    }


}