
public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.nombre = "Bobby";
        miPerro.comer();
        miPerro.ladrar();

        Animal1 miMascota = new Perro1();
        miMascota.hacerSonido(); // "El perro ladra."

        miMascota = new Gato();
        miMascota.hacerSonido();

        Vehiculo miAuto = new Auto("Sedán", 2020);
        Vehiculo miMoto = new Motocicleta("Enduro", 2022);

        miAuto.conducir();     // Imprime: El auto Sedán está recorriendo la ciudad.
        miMoto.conducir();

    }

}
class Animal {
    String nombre;

    public void comer() {
        System.out.println("El animal está comiendo.");
    }
}

// el extends indica que la clase perro hereda los metodos de la clase animal
class Perro extends Animal {
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}


// Interfaz o clase base
interface Animal1 {
    void hacerSonido();
}

// Clases derivadas
class Perro1 implements Animal1 {
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato implements Animal1 {
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}


// Clase abstracta que describe la idea general de un vehículo
abstract class Vehiculo {
    private String modelo;
    private int año;

    public Vehiculo(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    // Método abstracto: cada tipo de vehículo debe implementar cómo conduce
    public abstract void conducir();
}

// Implementaciones concretas de la abstracción

class Auto extends Vehiculo {
    public Auto(String modelo, int año) {
        super(modelo, año);
    }

    @Override
    public void conducir() {
        System.out.println("El auto " + getModelo() + " está recorriendo la ciudad.");
    }
}

class Motocicleta extends Vehiculo {
    public Motocicleta(String modelo, int año) {
        super(modelo, año);
    }

    @Override
    public void conducir() {
        System.out.println("La motocicleta " + getModelo() + " está acelerando por la carretera.");
    }
}

