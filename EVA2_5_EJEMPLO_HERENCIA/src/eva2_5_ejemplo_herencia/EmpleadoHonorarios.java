/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

public class EmpleadoHonorarios extends Empleado{
    private int horas;    
    
    
    public EmpleadoHonorarios(){
        super();
        this.horas = 0;
    }
    public EmpleadoHonorarios(int horas, String numeroEmpleado, String nombre, String apellido, Double salario){
        super(numeroEmpleado, nombre, apellido, salario);
        this.horas = horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public int getHoras(){
        return horas;
    }
    @Override
    public double calcularSalario(){
        return getSalario()* horas;
    }
    
    @Override
    public String toString(){
        String resu = super.toString() + "\n" + 
                "Antiguedad: " + horas + "\n" +
                "Salario total: " + calcularSalario() + "\n";
            return resu;
    }

}
