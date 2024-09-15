package AnimalFactoryPackage.Interface.AnimalFactory;

import AnimalFactoryPackage.Interface.AnimalClass.Cat;
import AnimalFactoryPackage.Interface.AnimalClass.Dog;
import AnimalFactoryPackage.Interface.Animal;

public class AnimalFactory {

    public Animal couldYouPleaseCreateAnAnimal(String animalType){
        if(animalType==null){
            return null;
        }
        if(animalType.equalsIgnoreCase("Dog")){
            return new Dog();
        } else if(animalType.equalsIgnoreCase("Cat")){
            return new Cat();
        } else{
            return null;
        }
    }

}
