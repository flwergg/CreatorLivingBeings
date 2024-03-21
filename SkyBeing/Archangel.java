package SkyBeing;

public class Archangel extends SkyBeings {
    public String sing() {
        String sing = "The archangel" + getNombre() + "\\r\\n" + //
                "\"Yo le pregunté a un pastor\r\n" + //
                "Del amor y él me dijo\r\n" + //
                "\"Que se lo entregara a Dios\r\n" + //
                "Que no me sintiera solo\"\r\n" + //
                "Que estar solo era mejor\r\n" + //
                "Que vivir de una ilusión";
        return sing;
    }

    @Override
    public void showSkyBeingsMethods() {
        super.showSkyBeingsMethods();
        System.out.println(
                "12.sing");
    }

}
