import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int base, altura, profundidad;

        System.out.println("Introduce la base del prisma:");
        base = sc.nextInt();
        System.out.println("Introduce la altura del prisma:");
        altura = sc.nextInt();
        System.out.println("Introduce la profundidad del prisma:");
        profundidad = sc.nextInt();

        int areaLateral = base * altura;

        int areaTotal = 2 * areaLateral + base * profundidad;

        int volumen = base * altura * profundidad;

        System.out.println("El área lateral es: " + areaLateral);
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);
    }
}