/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_ejemplo_herencia;

/**
 *
 * @author bisonte
 */
public class Empleado extends Persona{
    private String numeroEmpleado;
    private String puesto;
    private double salario;
    
    public Empleado(){
        super();
        this.numeroEmpleado = "";
        this.puesto = "";
        this.salario = 0;
    }

    public Empleado(String numeroEmpleado, String puesto, double salario, String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero) {
        super(nombre, ap_paterno, ap_materno, rfc, edad, genero);
        this.numeroEmpleado = numeroEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }
    public void getNumeroEmp(String numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }
    public String getNumeroEmp(){
        return numeroEmpleado;
    }
    public void getPuesto(String puesto){
        this.puesto = puesto;
    }
    public String getPuesto(){
        return puesto;
    }
    public void getSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();//LLAMO A IMPRIMIR DATOS DE PERSONA
        System.out.println("Numero de empleado:" + numeroEmpleado);
        System.out.println("Puesto:" + puesto);
        System.out.println("Salario:" + salario);
    }
    
    @Override
    public String toString(){
        String resu = "";
        resu = "----DATOS DEL EMPLEADO----" + "\n" + 
                "Nombre: " + super.generarNombreCom() + "\n" +
                "RFC: " + getRfc() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Numero de empleado: " + numeroEmpleado + "\n" +
                "Puesto: " + puesto + "\n" +
                "Salario: " + salario + "\n";
        return resu;
    }
}
