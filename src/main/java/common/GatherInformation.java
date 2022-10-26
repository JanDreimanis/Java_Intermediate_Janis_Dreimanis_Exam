package common;

import preparation.CookingPreparation;
import preparation.DIYPreparation;
import preparation.EducationPreparation;
import preparation.RegularPreparation;

public class GatherInformation {

    static CookingPreparation cookingPreparation = new CookingPreparation();
    static DIYPreparation diyPreparation = new DIYPreparation();
    static RegularPreparation regularPreparation = new RegularPreparation();
    static EducationPreparation educationPreparation = new EducationPreparation();


    public static void choosePrerequisites(String type) {
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
}
