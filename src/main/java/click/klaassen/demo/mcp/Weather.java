package click.klaassen.demo.mcp;

import java.util.List;

public class Weather {

    public record CurrentWeatherReport(
      String pressure_msl,
      String relative_humidity,      
      String temperature,
      String visibility,
      String condition,
      String icon) {}

    public record Source(
        String station_name
    ) {}

    public record Forecast(
            CurrentWeatherReport weather,
            List<Source> sources) {}
    
}