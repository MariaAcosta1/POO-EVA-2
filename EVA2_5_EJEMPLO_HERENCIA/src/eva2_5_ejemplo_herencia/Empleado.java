/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

public class Empleado {
    private String numeroEmpleado;
    private String nombre;
    private String apellido;
    private double salario;
    
    public Empleado(){
        this.numeroEmpleado = "";
        this.nombre = "";
        this.apellido = "";
        this.salario = 0.;
    }
    public Empleado(String numeroEmpleado, String nombre, String apellido, Double salario){
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;

    }
    public void setNumeroEmp(String numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }
    public String getnombre(){
        return numeroEmpleado;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    @Override
    public String toString(){
        String resu = "";
        resu = "----DATOS DEL EMPLEADO----" + "\n" + 
                "Numero de Empleado: " + numeroEmpleado + "\n" +
                "Nombre: " + nombre + apellido + "\n" +
                "Salario: " + salario + "\n";
        return resu;
    }
    
    public double calcularSalario(){
        return salario;
    }
}
