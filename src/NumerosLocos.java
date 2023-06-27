import java.util.Scanner;
import java.util.Arrays;

public class NumerosLocos
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];


        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < numeros.length; i++)
        {

            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números ingresados: " + Arrays.toString(numeros));

        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length / 2; i++)
        {
            int num = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = num;
        }

        System.out.println("Los Números al Reves son: " + Arrays.toString(numeros));
    }
}


//System.out.print("Número " + (i + 1) + ": ");
//System.out.print(i + 1);