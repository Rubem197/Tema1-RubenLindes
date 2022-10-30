import java.io.IOException;

public class Ejercicio3_2 {
    public static void main(String[] args) {


        String[] comando1 = {"java", "CuentaCaracteres", "a"};
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        String[] comando2 = {"java", "CuentaCaracteres", "e"};
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        String[] comando3 = {"java", "CuentaCaracteres", "i"};
        ProcessBuilder pb3 = new ProcessBuilder(comando3);
        String[] comando4 = {"java", "CuentaCaracteres", "o"};
        ProcessBuilder pb4 = new ProcessBuilder(comando4);
        String[] comando5 = {"java", "CuentaCaracteres", "u"};
        ProcessBuilder pb5 = new ProcessBuilder(comando5);

        pb1.inheritIO();
        pb2.inheritIO();
        pb3.inheritIO();
        pb4.inheritIO();
        pb5.inheritIO();
        int contador = 0;
        try {
            long inicio = System.currentTimeMillis();
            pb1.start();

            pb2.start();

            pb3.start();

            pb4.start();

            pb5.start();

            long fin = System.currentTimeMillis();

            int tiempo = (int) (fin - inicio);

            System.out.println(tiempo);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
