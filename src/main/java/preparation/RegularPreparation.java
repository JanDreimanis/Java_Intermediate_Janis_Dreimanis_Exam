package preparation;

public class RegularPreparation implements Preparation {
    @Override
    public void listPrerequisites() {
        System.out.println("Make sure you're ready:\n" +
                "Respect the organization rules and enjoy your activity\n" +
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
