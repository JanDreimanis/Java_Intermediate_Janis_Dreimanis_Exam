package preparation;

public class DIYPreparation implements Preparation {
    @Override
    public void listPrerequisites() {
        System.out.println("Make sure you're ready:\n" +
                "1. Buy necessary groceries\n" +
                "2. Make sure all the necessary tools will be available\n" +
                "3. Safety on the first place\n" +
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
