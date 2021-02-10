import java.util.Scanner;

public class Exercise {
    /**
     * Determina si un número positivo es primo
     * @param n: número del que se quiere saber si es primo
     * @return true si n es primo y false si no
     */
    public static boolean prime(int n) {
        boolean result = true;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                result = false; //si n es divisible por i, entonces n no es primo
                break;
            } else {
                result = true;
            }
        }

        return result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dame un número entero mayor que cero: ");
        int num = input.nextInt();

        if (num > 0) {
            if (prime(num)) {
                System.out.println(num + " es primo");
            } else {
                System.out.println(num + " no es primo");
            }
        }
    }

}
