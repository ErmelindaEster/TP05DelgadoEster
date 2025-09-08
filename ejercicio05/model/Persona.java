package ejercicio05.model;
import java.time.LocalDate;
import java.time.Period; 

public class Persona {
private  String  dni;
private String nombre;
private LocalDate fechaNacimiento;
private String provincia;

   // constructor por defento
   public Persona(){
}
// Constructor parametrizado
public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
    this.dni = dni;
    this.nombre = nombre; 
    this.fechaNacimiento = fechaNacimiento;
    this.provincia = provincia; 
}

 // Constructor parcial 
 public Persona(String dni, String nombre, LocalDate fechaNacimiento){
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.provincia = "Jujuy";
 }
 // Getters y Setters
 public String getDni(){
    return dni;

 }

 public void setDni(String dni){
    this.dni = dni;
 }
 
 public String getNombre(){
    return nombre;
 }
 public void setNombre(String nombre){
    this.nombre = nombre;

 }

 public LocalDate getFechaNacimiento(){
    return fechaNacimiento;
 }

 public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
 }

 public String getProvincia(){
    return provincia;

 }

 public void setProvincia(String provincia){
 this.provincia = provincia;  

}

// Método de lógica
public int calcularEdad(){
    return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();

}

public boolean esMayorDeEdad() {
  return calcularEdad() > 18;   
}

    
public void mostrarDatos(){
    System.out.println("---Datos de la Persona---");
    System.out.println("DNI: " + dni);
    System.out.println("Nombre: " + nombre);
    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    System.out.println("Provincia: " + provincia);
    System.out.println("Edad: " + calcularEdad() + " años");

    if (esMayorDeEdad()) {
        System.out.println("La persona es mayor de edad.");
    } else{
        System.out.println("La persona no es mayor de edad. "); 
    }
}

}




 

