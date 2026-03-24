
package eva2_4_ejemplo_herencia;

public class EVA2_4_EJEMPLO_HERENCIA {
 
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez", "Handez", "ADASCE33", 34, 'H');
        persona.imprimirDatos();
        Empleado empleado = new Empleado("Mimi", "Mayor", 540, "J", "O", "L", "KE2", 4, 'M');
        empleado.imprimirDatos();
        System.out.println(empleado);
    }
    
}
