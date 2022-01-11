package training.weather;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import org.apache.commons.lang.StringUtils;

public class WeatherForecast {

    private Date datetime, currentDate;
    private static final String CITY_URL = "https://www.metaweather.com/api/location/search/?query=";
    private final String LOCATION_URL = "https://www.metaweather.com/api/location/";
    private final String applicableDate = "applicable_date";
    private final String weatherState = "weather_state_name";
    private String requestString, formattedDate, cityID, city;
    private final int millisecondsDay = 1000 * 60 * 60 * 24 * 6;
    private JSONArray jsonArray, results;
    private Httprequest ObjectRequest;

    /**
     *
     * @param city city name
     * @param datetime date
     */
    public WeatherForecast(City city, Date datetime) {

        this.city = city.getName();
        this.datetime = datetime;

    }

    public String getCityWeather() throws IOException {

        currentDate = new Date(new Date().getTime() + (millisecondsDay));
        formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(datetime);

        //Checks wether there are any forecasts
        if (datetime.before(currentDate)) {

            ObjectRequest = new Httprequest();
            //Get the city ID
            requestString = ObjectRequest.requestToString(CITY_URL + city);
            jsonArray = new JSONArray(requestString);
            cityID = jsonArray.getJSONObject(0).get("woeid").toString();

            //Get the predictions for such city
            requestString = ObjectRequest.requestToString(LOCATION_URL + cityID);
            results = new JSONObject(requestString).getJSONArray("consolidated_weather");

            //Iterate over the array looking for the datetime forecast
            for (int i = 0; i < results.length(); i++) {
                if (formattedDate.equals(jsonString(results, i, applicableDate))) {
                    return jsonString(results, i, weatherState);
                }
            }
        }
        return StringUtils.EMPTY;
    }

    /**
     * Returns a json object as string
     *
     * @param array the json jsonArray
     * @param idx the index in the jsonArray
     * @param name
     */
    private String jsonString(JSONArray array, int idx, String name) {
        return array.getJSONObject(idx).get(name).toString();
    }

}
