package click.klaassen.demo.mcp;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;
import io.quarkus.logging.Log;

public class Server {

    @RestClient
    WeatherClient weatherClient;
    
    @Tool(description = "Get weather forecast for a location for the current day.")
    String getForecast(@ToolArg(description = "Latitude of the location") double latitude,
            @ToolArg(description = "Longitude of the location") double longitude) {
        Log.infof("Latitude: %s / Longitude: %s", latitude, longitude);
        return FormattingHelper.formatForecast(weatherClient.getForecast(latitude, longitude));
    }

}
