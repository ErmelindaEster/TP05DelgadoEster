package ejercicio05.main;
import ejercicio05.model.Persona;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        System.out.println("Construcción con constructor por defecto:");
        
        Persona p1 = new Persona();
        p1.setDni("11111111");
        p1.setNombre("Ana Torres");
        p1.setFechaNacimiento(LocalDate.of(2004, 3, 10));
        p1.setProvincia("Salta");
        p1.mostrarDatos();
        System.out.println();


        System.out.println("Construcción con constructror parametizado:");
         Persona p2 = new Persona("22222222", "Carlos Ruiz", LocalDate.of(2010, 5, 25), "Tucumán");
        p2.mostrarDatos();
        System.out.println();


        System.out.println("Construcción con constructor parcial:");
        Persona p3 = new Persona("33.333.333", "Laura Méndez", LocalDate.of(1990, 12, 1));
        p3.mostrarDatos();
        System.out.println();

        
    }
    
}
