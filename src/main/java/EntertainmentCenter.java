import activity.GroupActivity;
import activity.RegularActivity;
import preparation.CookingPreparation;
import preparation.DIYPreparation;
import preparation.EducationPreparation;
import preparation.RegularPreparation;

import java.util.HashMap;
import java.util.Scanner;

import static helpers.RestApiHelper.*;

public class EntertainmentCenter {

    private static final String RED = "\u001B[31m";
    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    private static final String PURPLE = "\u001B[35m";

    private final Scanner input = new Scanner(System.in);

    public static HashMap<Integer, String> mapOfTypes = new HashMap<>();
    CookingPreparation cookingPreparation = new CookingPreparation();
    DIYPreparation diyPreparation = new DIYPreparation();
    RegularPreparation regularPreparation = new RegularPreparation();
    EducationPreparation educationPreparation = new EducationPreparation();

    {
        mapOfTypes.put(1, "recreational");
        mapOfTypes.put(2, "social");
        mapOfTypes.put(3, "diy");
        mapOfTypes.put(4, "charity");
        mapOfTypes.put(5, "cooking");
        mapOfTypes.put(6, "relaxation");
        mapOfTypes.put(7, "music");
        mapOfTypes.put(8, "busywork");
        mapOfTypes.put(9, "education");
    }


    void start() {
        welcome();
        int userChoice = 0;

        try {
            userChoice = input.nextInt();
            if (userChoice > 4 || userChoice < 1) {
                System.out.println(RED + " Numbers are 1, 2, 3 or 4!!!! ");
                input.reset();
            }
        } catch (Exception e) {
            System.out.println(RED + "Only numbers" + RESET);
            input.next();
        }

        switch (userChoice) {
            case 1:
                RegularActivity activity1 = createRegularActivityFromResponse(
                        BORED_API_CALL_PREFIX + "activity/");
                activity1.printInfo();
                choosePrerequisites(activity1.getType());
                break;
            case 2:
                int counter = 1;
                System.out.println("Choose one of these type of activities: ");
                for (String type : mapOfTypes.values()) {
                    System.out.println(counter + ": " + type);
                    counter++;
                }
                userChoice = input.nextInt();
                RegularActivity activity2 = createRegularActivityFromResponse(
                        BORED_API_CALL_PREFIX + "activity?type=" + mapOfTypes.get(userChoice));
                activity2.printInfo();
                choosePrerequisites(activity2.getType());
                break;
            case 3:
                System.out.print("Enter amount of participants: ");
                GroupActivity activity3 = null;
                try {
                    userChoice = input.nextInt();
                    activity3 = createGroupActivityFromResponse(
                            BORED_API_CALL_PREFIX + "activity?participants=" + userChoice);
                } catch (NullPointerException e) {
                    System.out.println("\n\nLooks like this amount is not supported\n\n\n");
                    start();
                }

                assert activity3 != null;
                System.out.println("-----------------------");
                activity3.printInfo();
                choosePrerequisites(activity3.getType());
                break;
        }
    }

    public void choosePrerequisites(String type) {
        switch (type) {
            case "cooking":
                cookingPreparation.listPrerequisites();
                break;
            case "diy":
            case "busywork":
                diyPreparation.listPrerequisites();
                break;
            case "education":
                educationPreparation.listPrerequisites();
                break;
            case "recreational":
            case "social":
            case "charity":
            case "music":
            case "relaxation":
                regularPreparation.listPrerequisites();

        }

    }


    private void welcome() {
        System.out.println(PURPLE + "Welcome to Entertainment management system!\n\n" + RESET);
        System.out.println(GREEN + "Enter 1 to view the random activity.\n" +
                "Enter 2 to search activity by type.\n" +
                "Enter 3 to search activity suitable for group.\n" +
                "Enter 4 for Plan activities.\n" + RESET);

        System.out.print("Choose an option from the list above: ");
    }
}
