package God;

import java.util.ArrayList;
import java.util.List;

import EarthBeing.EarthBeings;
import EarthBeing.Elephant;
import EarthBeing.Human;
import EarthBeing.Spider;
import SkyBeing.Angel;
import SkyBeing.Dragon;
import SkyBeing.SkyBeings;

public class LivingBeingCreator implements Creator {
    private static List<Object> createdBeings = new ArrayList<>();

    // en pro del orden utilizaremos switch para los diferentes tipos de seres a
    // partir de los parametros (Tipo de ser, nombre, especie)
    public void CreateLivingBeings() {
        createBeing("sky", "Angel", "Angel");
        createBeing("sky", "Archangel", "Archangel");
        createBeing("sky", "Dragon", "Dragon");
        createBeing("earth", "Elephant", "Elephant");
        createBeing("earth", "Human", "Human");
        createBeing("earth", "Spider", "Spider");
    }

    public static Object createBeing(String type, String nombre, String especie) {
        Object being = null;
        switch (type) {
            case "sky":
                switch (especie) {
                    case "Dragon":
                        SkyBeings dragon = new Dragon();
                        dragon.setNombre(nombre);
                        dragon.setEspecie(especie);
                        createdBeings.add(dragon);
                        being = dragon;
                        break;
                    case "Angel":
                        SkyBeings angel = new Angel();
                        angel.setNombre(nombre);
                        angel.setEspecie(especie);
                        createdBeings.add(angel);
                        being = angel;
                        break;
                    case "Archangel":
                        SkyBeings archangel = new Angel();
                        archangel.setNombre(nombre);
                        archangel.setEspecie(especie);
                        createdBeings.add(archangel);
                        being = archangel;
                        break;
                    default:
                        System.out.println("Invalid type of being");
                        break;
                }
                return being;
            case "earth":
                switch (especie) {
                    case "Elephant":
                        EarthBeings elephant = new Elephant();
                        elephant.setNombre(nombre);
                        elephant.setEspecie(especie);
                        createdBeings.add(elephant);
                        being = elephant;
                        break;
                    case "Spider":
                        EarthBeings spider = new Spider();
                        spider.setNombre(nombre);
                        spider.setEspecie(especie);
                        createdBeings.add(spider);
                        being = spider;
                        break;
                    case "Human":
                        SkyBeings human = new Human();
                        human.setNombre(nombre);
                        human.setEspecie(especie);
                        createdBeings.add(human);
                        being = human;
                        break;
                    default:
                        System.out.println("Invalid type of being");
                        break;
                }
                return being;
            default:
                System.out.println("Invalid type of being");
                break;
        }
        return being;
    }

    // funcion para hacer que se muetsren los seres creados
    public static void showCreatedBeings() {
        for (Object being : createdBeings) {
            System.out.println(being);
        }
    }

    // funcion para mostrar los metodos de cada objeto creado
    public static void showCreatedBeingsMethods(Object being) {
        if (being instanceof SkyBeings) {
            ((SkyBeings) being).showSkyBeingsMethods();
        } else if (being instanceof EarthBeings) {
            ((EarthBeings) being).showEarthBeingsMethods();
        }
    }
}
