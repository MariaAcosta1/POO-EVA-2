
package eva2_2_herencia;

public class EVA2_2_HERENCIA {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre();
        Clientes clientes = new Clientes();
        clientes.setNombre();
        Proveedor proveedor = new Proveedor();
        proveedor.setNombre();
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public void getNombre(String nombre){
        this.nombre = nombre;
    }
    public String setNombre(){
        return nombre;
    }
    public void getApellido(String apellido){
        this.apellido = apellido;
    }
    public String setApellido(){
        return apellido;
    }
    public void getEdad(int edad){
        this.edad = edad;
    }
    public int setEdad(){
        return edad;
    }

}
class Empleado extends Persona{
    
}
class Clientes extends Persona{
    
}
class Proveedor extends Persona{
    
}