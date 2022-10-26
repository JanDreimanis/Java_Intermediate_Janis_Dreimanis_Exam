package helpers;

import activity.GroupActivity;
import activity.RegularActivity;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

import static common.GatherInformation.choosePrerequisites;

public class FileHelper {

    public static void saveGroupActivitiesRouteToFile(ArrayList<GroupActivity> groupActivities) {
        PrintStream stdout = System.out;
        try {
            PrintStream printStream = new PrintStream("Group_activities.ftext");
            System.setOut(printStream);
            for(GroupActivity groupActivity : groupActivities){
                groupActivity.printInfo();
                choosePrerequisites(groupActivity.getType());
            }
            System.setOut(stdout);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void saveRegularActivitiesRouteToFile(ArrayList<RegularActivity> regularActivities) {
        PrintStream stdout = System.out;
        try {
            PrintStream printStream = new PrintStream("Regular_activities.ftext");
            System.setOut(printStream);
            for(RegularActivity regularActivity : regularActivities){
                regularActivity.printInfo();
                choosePrerequisites(regularActivity.getType());
            }
            System.setOut(stdout);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
