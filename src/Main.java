import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, i;
        System.out.println("Ingrese un numero inicial: ");
        n = sc.nextInt();
        System.out.println("Ingrese un numero Final: ");
        m = sc.nextInt();
        System.out.println("Ingrese un numero de incremento: ");
        i = sc.nextInt();
        for (int x = n; x <= m; x += i) {
            System.out.println(x);
        }
        System.out.println("/////////////////////////////");
        System.out.println("Ingrese el numero de veces que desea que se repita el nombre: ");
        n = sc.nextInt();
        for ( i = 1; i <= n; i++) {
            System.out.println("Lenin " + i);
        }
        System.out.println("/////////////////////////////");
        System.out.println("Ingrese hasta que numero desea los numeros primos: ");
        n = sc.nextInt();
        for ( i = 2; i <= n; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(i);
            }
//Cambio de mejoras en el codigo
        }
        System.out.println("Hola Mundo");
    }
}