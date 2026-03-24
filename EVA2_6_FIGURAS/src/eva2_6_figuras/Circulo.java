/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_figuras;

public class Circulo extends Figuras{
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularArea(){
        return Math.PI * (radio);
    }
    public double calcularPerimetro(){
        return (2 * radio) * Math.PI;
    }
    @Override
    public String toString(){
        String resu = "";
        resu = "----Circulo----" + "\n" + 
                "Area de un circulo: " + calcularArea() + "\n" +
                "Perimetro de un circulo: " + calcularPerimetro() + "\n";
        return resu;
    }
    
}
