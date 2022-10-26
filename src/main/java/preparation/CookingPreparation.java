package preparation;

public class CookingPreparation implements Preparation{
    @Override
    public void listPrerequisites() {
        System.out.println("Make sure you're ready:\n" +
                "1. Buy necessary groceries\n" +
                "2. Make sure all the necessary tools will be available" +
                "3. Wash your hands!\n" +
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
