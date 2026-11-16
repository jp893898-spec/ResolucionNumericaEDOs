public class MetodoEuler {

    public static double evaluarFuncion(double x, double y) {
        // Funcion f(x, y) = x - y
        return x - y;
    }

    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1; // Variar este valor en el reporte (ej. 0.1, 0.05, 0.01)
        double xFinal = 0.3;

        // Criterio de paro (numero total de pasos N)
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("n\t x_n\t y_n (Euler)");
        System.out.println("-------------------------------");
        System.out.printf("%d\t %.4f\t %.4f\n", 0, x, y);

        for (int i = 0; i < nPasos; i++) {
            // Calculo de la pendiente y actualizacion de y y x
            double pendiente = evaluarFuncion(x, y);
            y = y + h * pendiente;
            x = x + h;

            System.out.printf("%d\t %.4f\t %.4f\n", (i + 1), x, y);
        }
    }
}