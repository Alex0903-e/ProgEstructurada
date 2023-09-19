import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        // Declaramos las variables
        double base;
        double altura;
        double areaTotal;
        double areaLateral;
        double volumen;

        // Declaramos un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese la base y la altura de la pirámide
        System.out.print("Ingrese la base de la pirámide: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        altura = scanner.nextDouble();

        // Calculamos el área total de la pirámide
        areaTotal = base * Math.sqrt(3) / 4;

        // Calculamos el área lateral de la pirámide
        areaLateral = base * altura / 2;

        // Calculamos el volumen de la pirámide
        volumen = base * altura * altura / 3;

        // Imprimimos los resultados
        System.out.println("El área total de la pirámide es: " + areaTotal);
        System.out.println("El área lateral de la pirámide es: " + areaLateral);
        System.out.println("El volumen de la pirámide es: " + volumen);
    }
}
