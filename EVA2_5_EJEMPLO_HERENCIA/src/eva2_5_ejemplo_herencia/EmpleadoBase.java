/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

public class EmpleadoBase extends Empleado{
    private int yearIng;
    
    public EmpleadoBase(){
        super();
        this.yearIng = 0;
    }
    public EmpleadoBase(int yearIng, String numeroEmpleado, String nombre, String apellido, Double salario){
        super(numeroEmpleado, nombre, apellido, salario);
        this.yearIng = yearIng;
    }
    public void setYearIng(int yearIng){
        this.yearIng = yearIng;
    }
    public int getYearIng(){
        return yearIng;
    }
    
    public int antiguedad(){
        int anti = 2026 - yearIng;
        int cinco = anti / 5; //numero de periodos de 5 años
        return cinco;
    }
    @Override
    public double calcularSalario(){
        return getSalario() * (1 + (antiguedad()* 0.1));
    }
    
    @Override
    public String toString(){
        String resu = super.toString() + "\n" + 
                "Antiguedad: " + antiguedad() + "\n" +
                "Salario total: " + calcularSalario() + "\n";
            return resu;
    }
}
