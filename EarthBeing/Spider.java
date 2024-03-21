package EarthBeing;

public class Spider extends EarthBeings {
    public String sting() {
        String sting = "the spider" + getNombre() + "stings an elephant";
        return sting;

    }

    @Override
    public void showEarthBeingsMethods() {
        super.showEarthBeingsMethods();
        System.out.println(
                "9.stings an elephant ");
    }

}
