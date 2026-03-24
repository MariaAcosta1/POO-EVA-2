/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_ejemplo_herencia;


public class Persona {
    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private String rfc;
    private int edad;
    private char genero;
    
    public Persona(){
        this.nombre = "";
        this.ap_paterno = "";
        this.ap_materno = "";
        this.rfc = "";
        this.genero = 0;
        this.genero = ' ';
    }
    public Persona(String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero){
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.rfc = rfc;
        this.edad = edad;
        this.genero = genero;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setAp_Paterno(String ap_paterno){
        this.ap_paterno = ap_paterno;
    }
    public String getAp_Paterno(){
        return ap_paterno;
    }
    public void setAp_Materno(String ap_materno){
        this.ap_materno = ap_materno;
    }
    public String getAp_Materno(){
        return ap_materno;
    }
    public void setRfc(String rfc){
        this.rfc = rfc;
    }
    public String getRfc(){
        return rfc;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public char getGenero(){
        return genero;
    }
    public String generarNombreCom(){
        return nombre + " " + ap_paterno + " " + ap_materno;
    }
    public String regresarGenero(){
        return switch (genero) {
            case 'H' -> "Hombre";
            case 'M' -> "Mujer";
            default -> "No definido";
        };    
    }
    public void imprimirDatos(){
        System.out.println("-----Datos:-----");
        System.out.println("Nombre: " + generarNombreCom());
        System.out.println("RFC: " + rfc);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + regresarGenero());
    }
}
