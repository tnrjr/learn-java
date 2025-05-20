package Fundicao_de_Tipos;

class Animal {}
class Cachorro extends Animal {}

public class ExemploCasting {
    public static void main(String[] args) {
        Animal animal = new Cachorro();  // upcasting (implícito)
        Cachorro dog = (Cachorro) animal;  // downcasting (explícito)

        System.out.println("Casting realizado com sucesso.");
    }
}
