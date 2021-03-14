package oop2.module03.cage;

import oop2.module03.cage.animal.Animal;
import oop2.module03.cage.animal.Bird;

import java.util.ArrayList;
import java.util.*;


public class Cage<T extends Animal> {

    private Set<T> animal;

    public Cage() {
        this.animal = new HashSet<>();
    }

    public Set<T> getAnimal() {
        return animal;
    }

    public void setAnimal(Set<T> animal) {
        this.animal = animal;
    }

    public int numberOfAnimals() {
        return animal.size();
    }

    public boolean shelters(T animal) {
        if ( this.animal.contains(animal) ) {
            return true;
        }
        return false;
    }

    public void jail(T a) {
        animal.add(a);
    }

    public void setFree(T a) {
        animal.remove(a);
    }

    public static void jailAll(Cage<Bird> c, Bird[] birds) {
        for ( Bird bird : birds) {
            c.jail(bird);
        }
    }
}
