package EarthBeing;

import God.Creator;
import God.LivingBeings;

public abstract class EarthBeings extends LivingBeings implements EarthBeing, Creator {
    public String especie;
    public String Nombre;

    // creamos el constructor
    public EarthBeings(String especie, String Nombre) {
        this.especie = especie;
        this.Nombre = Nombre;
    }

    public EarthBeings() {
        super();
    }

    // implementamos los metodos de la interfaz
    public String walk() {
        String walk = Nombre + " the " + especie + " is walking";
        return walk;
    }

    public String eat() {
        String eat = Nombre + " the " + especie + " is eating";
        return eat;
    }

    public String sleep() {
        String sleep = Nombre + " the " + especie + " is sleeping";
        return sleep;
    }

    public String born() {
        String born = Nombre + " the " + especie + " was born on earth";
        return born;
    }

    public String grow() {
        String grow = Nombre + " the " + especie + " grows on earth";
        return grow;
    }

    public String reproduce() {
        String reproduce = Nombre + " the " + especie + " now have a baby on earth";
        return reproduce;
    }

    public String die() {
        String die = Nombre + " the " + especie + " tragically died on earth";
        return die;
    }

    public String toString() {
        String toString = Nombre + " the " + especie + " is an earth being";
        return toString;
    }

    public void showEarthBeingsMethods() {
        System.out.println(
                "1.walk \n2.eat \n3.sleep \n4.born \n5.grow \n6.reproduce \n7.die \n8.toString ");
    }

    // implementamos el metodo de la interfaz Creator
    public void CreateLivingBeings() {
        System.out.println("Creating living beings...");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
