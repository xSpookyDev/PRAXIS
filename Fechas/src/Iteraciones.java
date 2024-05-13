import java.util.Scanner;

public class Iteraciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros deseas generar en tu resultado?");
        int iteraciones = sc.nextInt();
        int f = 1;
        int t1 = 1;
        int t2;

        for (int i=1; i<=iteraciones; i++){
            t2 = f;
            f =  t1 + f;
            t1 = t2;
            System.out.println(t1);
        }
    }
}
