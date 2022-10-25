package helpers;

import activity.GroupActivity;
import activity.RegularActivity;
import common.ConfigReader;
import io.restassured.response.ResponseBody;
import static io.restassured.RestAssured.get;

public class RestApiHelper {
    public static ConfigReader configReader = new ConfigReader();
    public static final String BORED_API_CALL_PREFIX = configReader.getBoredApiUrl();

    public static ResponseBody getResponseBody(String apiCall) {
        return get(apiCall).getBody();
    }

    public static RegularActivity createRegularActivityFromResponse(String apiCall) {
        ResponseBody responseBody = getResponseBody(apiCall);
        String activityName = responseBody.jsonPath().getString("activity");
        String activityType = responseBody.jsonPath().getString("type");
        double activityPrice = responseBody.jsonPath().getDouble("price");
        String activityLink = responseBody.jsonPath().getString("link");
        String activityKey = responseBody.jsonPath().getString("key");
        double activityAccessibility = responseBody.jsonPath().getDouble("accessibility");

        return new RegularActivity(activityName, activityType, activityPrice,
                activityLink, activityKey,activityAccessibility);
    }
    public static GroupActivity createGroupActivityFromResponse(String apiCall) {
        ResponseBody responseBody = getResponseBody(apiCall);
        String activityName = responseBody.jsonPath().getString("activity");
        String activityType = responseBody.jsonPath().getString("type");
        double activityPrice = responseBody.jsonPath().getDouble("price");
        int activityParticipants = responseBody.jsonPath().getInt("participants");
        String activityLink = responseBody.jsonPath().getString("link");
        String activityKey = responseBody.jsonPath().getString("key");
        double activityAccessibility = responseBody.jsonPath().getDouble("accessibility");

        return new GroupActivity(activityName, activityType, activityPrice,
                activityLink, activityKey,activityAccessibility,activityParticipants);
    }
}
