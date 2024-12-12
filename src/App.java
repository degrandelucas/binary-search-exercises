import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.random.RandomGenerator;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Set<Integer> listaNumeros = new TreeSet<>();
        Random generator = new Random();
        int iterations = 0;
        int size = 128;
        int less = 0;
        int major = size;
        int middle = 0;

        do {
            listaNumeros.add(generator.nextInt(129)); // sorteia um numero que sera compartivel na lista
        } while (listaNumeros.size() < size);

        System.out.println(listaNumeros);

        int shot = generator.nextInt(129);
        do {
            middle = less + (major - less) / 2;
            if (middle == shot) {
                break;
            } else if (middle < shot) {
                less = middle + 1;
            } else { // middle > shot
                major = middle - 1;
            }
            iterations++;
        } while (less < major); //caso a lista nao for sequencial

        System.out.println("Foram realizadas " + iterations + " iteracoes para encontrar o numero sorteador " + shot);

    }
}
