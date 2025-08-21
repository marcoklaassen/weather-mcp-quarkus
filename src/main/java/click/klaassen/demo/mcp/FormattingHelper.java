package click.klaassen.demo.mcp;

import click.klaassen.demo.mcp.Weather.Forecast;
import io.quarkus.qute.Qute;

public class FormattingHelper {

    static String formatForecast(Forecast forecast) {
        return Qute.fmt(
                """
                        Station: {}
                        Temperature: {}°{}
                        Condition: {}                                
                        Pressure MSL: {}
                        Relative Humidity: {}
                        Icon: {}
                        """,
                forecast.sources().getFirst().station_name(),
                forecast.weather().temperature(), 
                "Celsius", 
                forecast.weather().condition(),
                forecast.weather().pressure_msl(),
                forecast.weather().relative_humidity(),
                forecast.weather().icon()
                );
    }
    
}
