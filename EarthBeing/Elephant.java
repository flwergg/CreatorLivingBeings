package EarthBeing;

public class Elephant extends EarthBeings {
    public String balancear() {
        return "One elephant was hammocking back\n" + //
                "And forth on the web of a big spider";
    }

    @Override
    public void showEarthBeingsMethods() {
        super.showEarthBeingsMethods();
        System.out.println(
                "9.Swing on a spider's web ");
    }

}
