package AnimalFactoryPackage.Interface.AnimalClass;

import AnimalFactoryPackage.Interface.Animal;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Gheow Gheow");
    }
}
