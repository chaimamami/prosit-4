
package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR = 25;
    private int i;

    public Zoo(String name, String city) {
        animals = new Animal[NBR];
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNBR() {
        return NBR;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + NBR;
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            System.out.println("Animal cannot be null.");
            return;
        }

        if (isZooFull(this)) {
            System.out.println("The zoo is full.");
            return;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println(animal + " has been added to the zoo.");
                return;
            }
        }

        System.out.println("Something went wrong while adding the animal.");
    }

    public int searchAnimal(Animal animalToFind) {
        int i = 0;
        while (i < NBR) {
            if (animals[i] != null && animals[i].equals(animalToFind)) {
                return i; // L'animal a été trouvé à l'indice i
            }
            i++;
        }

        return -1; // L'animal n'a pas été trouvé dans the zoo
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNBR() > z2.getNBR()) {
            return z1;
        } else if (z1.getNBR() < z2.getNBR()) {
            return z2;
        } else {
            return null;
        }
    }

    public static boolean isZooFull(Zoo zoo) {
        return (zoo.getNBR() >= zoo.getAnimals().length);
    }
}
