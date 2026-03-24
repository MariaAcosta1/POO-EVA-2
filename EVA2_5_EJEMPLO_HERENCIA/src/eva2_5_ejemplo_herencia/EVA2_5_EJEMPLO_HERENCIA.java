
package eva2_5_ejemplo_herencia;

public class EVA2_5_EJEMPLO_HERENCIA {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("3444", "Marin", "Torin", 222.0);   
        System.out.println(empleado);
        EmpleadoBase empleadobase = new EmpleadoBase(2000, "34", "Marten", "memo", 500.0);
        System.out.println(empleadobase);
        EmpleadoHonorarios empleadohonorarios = new EmpleadoHonorarios(300, "466", "MIMO", "Pancho", 470.0);
        System.out.println(empleadohonorarios);
    }
    
}
