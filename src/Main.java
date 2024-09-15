import AnimalFactoryPackage.Interface.AnimalFactory.AnimalFactory;
import AnimalFactoryPackage.Interface.Animal;
import CocacolaFactory.CocaCola;
import CocacolaFactory.CocaCola500ml;
import CocacolaFactory.CocaColaFactory;

public class Main {
    public static void main(String[] args) {


         //Animal
        //         AnimalFactory animalAgent = new AnimalFactory();
        //         Animal dogAgent = animalAgent.couldYouPleaseCreateAnAnimal("dog");
        //         dogAgent.makeSound();

        // Animal catAgent = animalAgent.couldYouPleaseCreateAnAnimal("cat");
        // catAgent.makeSound();

        // CocaCola

        // Agent
        CocaColaFactory cocaColaFactoryAgent = new CocaColaFactory();

        CocaCola cocaCola250ml = cocaColaFactoryAgent.createFactoryAgent("250ml");
        cocaCola250ml.serveCocaCola();

        CocaCola cocaCola500ml = cocaColaFactoryAgent.createFactoryAgent("500ml");
        cocaCola500ml.serveCocaCola();

        CocaCola cocaCola1000ml =  cocaColaFactoryAgent.createFactoryAgent("1000ml");
        cocaCola1000ml.serveCocaCola();

        CocaCola cocaCola2000ml = cocaColaFactoryAgent.createFactoryAgent("2000ml");
        cocaCola2000ml.serveCocaCola();

    }
}