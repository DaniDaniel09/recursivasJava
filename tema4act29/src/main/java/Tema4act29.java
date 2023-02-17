
public class Tema4act29 {

    public static void main(String[] args) {
        System.out.println(potencia(2, 8));
        System.out.println(fibonacci(8));
        System.out.println(palindromo("anitalavalatina"));
    }

    static int potencia(int num, int pot) {
        if (pot > 0) {
            return num * potencia(num, pot - 1);
        }
        return 1;
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return 1;

    }

    static boolean palindromo(String texto) {
        if (texto.length() <= 1) {
            return true;
        } else {
            if (texto.charAt(0) == texto.charAt(texto.length() - 1)) {
                return palindromo(texto.substring(1, texto.length() - 1));
            } else {
                return false;
            }
        }
    }
}
