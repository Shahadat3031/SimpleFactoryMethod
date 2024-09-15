package AnimalFactoryPackage.Interface.AnimalClass;

import AnimalFactoryPackage.Interface.Animal;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
