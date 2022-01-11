package training.weather;

import java.io.IOException;
import java.util.Date;
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
    public void forecastTest() throws IOException {

        forecast = weatherForecast.getCityWeather();
        assertEquals(forecast,weatherForecast.getCityWeather());
    }
    

}
