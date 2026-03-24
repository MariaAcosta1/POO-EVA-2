/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_abstract;

public class Triangulo extends Figuras{
    private double lado;
    private double altura;
    private double base;
    
    public Triangulo(double lado, double altura, double base){
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }
    public double getLado() {
        return lado;
    }
    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
    @Override
    public double calcularPerimetro(){
        return lado + lado + base;
    }
    @Override
    public String toString(){
        String resu = "";
        resu = "----Triangulo----" + "\n" + 
                "Area de un triangulo: " + calcularArea() + "\n" +
                "Perimetro de un triangulo: " + calcularPerimetro() + "\n";
        return resu;
    }
}
