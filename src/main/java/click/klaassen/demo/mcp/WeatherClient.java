package click.klaassen.demo.mcp;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import click.klaassen.demo.mcp.Weather.Forecast;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

/*
 * Bright Sky is a free and open-source weather API. 
 * It aims to provide an easy-to-use gateway to weather 
 * data that the DWD – Germany's meteorological service – 
 * publishes on their open data server.
 */
@RegisterRestClient(baseUri = "https://api.brightsky.dev")
public interface WeatherClient {

    @GET
    @Path("/current_weather")
    Forecast getForecast(@QueryParam("lat") double latitude, @QueryParam("lon") double longitude);

}