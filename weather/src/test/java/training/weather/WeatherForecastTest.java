package training.weather;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class WeatherForecastTest {

    private Date date;
    private City Madrid;
    private String forecast;
    private WeatherForecast weatherForecast;

    
    @Before
    public void init() {
        
        date = new Date();
        Madrid = new City("Madrid");
        weatherForecast = new WeatherForecast(Madrid, date);

    }
    
    @Test
    public void forecastTest() {

        try {
            forecast = weatherForecast.getCityWeather();
            assertEquals(forecast,weatherForecast.getCityWeather());
        } catch (Exception ex) {
            Logger.getLogger(WeatherForecastTest.class.getName()).log(Level.SEVERE,"Got an exception.", ex);
        }
    }
    

}
