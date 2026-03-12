
package eva2_3_herencia;

public class EVA2_3_HERENCIA {

    public static void main(String[] args) {
        System.out.println("------Animal------");
        Animal animal = new Animal();
        animal.comer();
        System.out.println("-----Mamifero-----");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.tenerPelo();
        System.out.println("-----Persona-----");
        Persona persona = new Persona("Hola mundo");
        persona.comer();
        persona.pensar();
        persona.tenerPelo();
    }
    
}
class Animal{
    public Animal(){
        System.out.println("Animal!");
    }
    public void comer(){
        System.out.println("Comer!");
    }
}

class Mamifero extends Animal{//Derivada, subclase, hijo
    public Mamifero(){
        super();//constructor default de la superclase (Animal)
        System.out.println("Mamifero!");
    }
    public void tenerPelo(){
        System.out.println("Peludo!");
    }
}

class Persona extends Mamifero{
    public Persona(String mensaje){
        super();//constructor default de la superclase (Mamifero)
        System.out.println(mensaje);
    }
    public void pensar(){
        System.out.println("Pensar!");
    }
}