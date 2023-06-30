import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        Defina una clase de prueba con un método main() donde usted:
        crea un HashSet con todos los días de la semana e imprime el contenido del HashSet.
         */
        Set<String> semana = new HashSet<>();
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sabado");
        semana.add("Domingo");
        System.out.println(semana);

        //cree otra implementación de Set que conserve el orden de inserción
        //de los días de la semana e imprímalo
        Set<String> semana2 = new LinkedHashSet<>();
        semana2.add("Lunes");
        semana2.add("Martes");
        semana2.add("Miercoles");
        semana2.add("Jueves");
        semana2.add("Viernes");
        semana2.add("Sabado");
        semana2.add("Domingo");
        System.out.println(semana2);
        //imprime la respuesta a la pregunta ¿Es el primer Conjunto igual al segundo?.
        System.out.println("Il primo set è uguale al secondo set?");
        System.out.println("Risposta: no, la differenza più notevole è che HashSet è una raccolta che restituisce elementi\nin modo non ordinato, mentre LinkedHashSet restituisce gli elementi ordinati nel modo in cui li abbiamo inseriti.");
    }
}