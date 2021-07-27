package model;

class Animal {
    public int animalAge;
    public int animalWeight;

    public Animal(int animalAge, int animalWeight) {
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }
    public int getAge() {
        return animalAge;
    }
    public void setAge(int animalAge) {
        this.animalAge = animalAge;
    }
    public int getWeight() {
        return animalWeight;
    }
    public void setWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    public void doRunning(){
    };

    public void doEating(){
    };

}

class Felidae extends Animal {

    public Felidae(int animalAge, int animalWeight) {
        super(animalAge, animalWeight);
    }

    public void uniqueBehavior()
    {
        System.out.println("meowing meowing");
    }

}

class Tiger extends Felidae{

    public Tiger(int animalAge, int animalWeight) {
        super(animalAge, animalWeight);
    }

}

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(7, 50);
        tiger.uniqueBehavior();
    }
}