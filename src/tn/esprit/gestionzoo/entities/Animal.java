package tn.esprit.gestionzoo.entities;
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // Utilisation d'une méthode pour définir l'âge.
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public String toString() {
        return "Animal Family: " + family + "\nAnimal Name: " + name + "\nAnimal Age: " + age + "\nIs Mammal: " + isMammal;
    }
}
