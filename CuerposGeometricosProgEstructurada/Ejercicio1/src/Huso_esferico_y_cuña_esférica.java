import java.util.Scanner;

public class Huso_esferico_y_cuña_esférica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radio = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double angulo = scanner.nextDouble();

        double areaLateral = 2 * Math.PI * radio * altura * (angulo / 360);
        double areaTotal = areaLateral + Math.PI * radio * (2 * radio);
        double volumen = (2 * Math.PI * radio * radio * altura * (angulo / 360)) / 3;
        double apotema = (3 * Math.sqrt(3) * radio) / 2;

        System.out.println("El area lateral es:" + areaLateral);
        System.out.println("El area total es:" + areaTotal);
        System.out.println("El volumen total es:" + volumen);
        System.out.println("El apotema es:" + apotema);
    }
}