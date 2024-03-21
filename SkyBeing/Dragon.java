package SkyBeing;

public class Dragon extends SkyBeings {
    public String Dracaris() {
        String fire = "Dracaris,(the dragon " + getNombre() + " epically spits fire)";
        return fire;
    }

    @Override
    public void showSkyBeingsMethods() {
        super.showSkyBeingsMethods();
        System.out.println(
                "12.Dracaris");
    }

}
