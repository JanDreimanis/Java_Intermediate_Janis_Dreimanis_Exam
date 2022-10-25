package preparation;

public class EducationPreparation implements Preparation{
    @Override
    public void listPrerequisites() {
        System.out.println("Make sure you're ready:\n" +
                "1. check if there is no mandatory knowledge before joining this activity\n" +
                "2. Enjoy.");
    }
}
