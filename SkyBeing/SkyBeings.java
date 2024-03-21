package SkyBeing;

import EarthBeing.EarthBeing;
import God.LivingBeings;

public abstract class SkyBeings extends LivingBeings implements SkyBeing, EarthBeing {
    public String especie;
    public String nombre;

    // creamos el constructor
    public SkyBeings(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    }

    public SkyBeings() {
        super();
    }

    // implementamos los metodos de la interfaz
    public String fly() {
        String fly = nombre + " the " + especie + " is flying";
        return fly;
    }

    public String planear() {
        String planear = nombre + " the " + especie + " is planing";
        return planear;
    }

    public String changeDimension() {
        String changeDimension = nombre + " the " + especie + " is changing dimension";
        return changeDimension;
    }

    @Override
    public String walk() {
        String walk = nombre + " the " + especie + " is walking";
        return walk;
    }

    @Override
    public String eat() {
        String eat = nombre + " the " + especie + " is eating";
        return eat;
    }

    @Override
    public String sleep() {
        String sleep = nombre + " the " + especie + " is sleeping";
        return sleep;
    }

    @Override
    public String born() {
        String born = nombre + " the " + especie + " was born in the sky surrounded by stars";
        return born;
    }

    @Override
    public String grow() {
        String grow = nombre + " the " + especie + " grows in the sky playing with the asteroids";
        return grow;
    }

    @Override
    public String reproduce() {
        String reproduce = nombre + " the " + especie + " now have a baby in the sky";
        return reproduce;
    }

    @Override
    public String die() {
        String die = nombre + " the " + especie + " tragically died in the sky and the stars are crying";
        return die;
    }

    @Override
    public String toString() {
        String toString = nombre + " the " + especie + " is a sky being";
        return toString;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // metodo para mostrar los metodos de los seres del cielo
    public void showSkyBeingsMethods() {
        System.out.println(
                "1.fly \n2.planear \n3.changeDimension \n4.walk \n5.eat \n6.sleep \n7.born \n8.grow \n9.reproduce \n10.die \n11.toString");
    }

}
