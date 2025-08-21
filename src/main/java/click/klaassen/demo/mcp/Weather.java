package click.klaassen.demo.mcp;

import java.util.List;

public class Weather {

  public record Forecast(
      CurrentWeatherReport weather,
      List<Source> sources) {
  }

  public record CurrentWeatherReport(
      String timestamp,
      String source_id,
      String cloud_cover,
      String condition,
      String dew_point,
      String icon,
      String pressure_msl,
      String relative_humidity,
      String temperature,
      String visibility,
      String precipitation_10,
      String precipitation_30,
      String precipitation_60,
      String solar_10,
      String solar_30,
      String solar_60,
      String sunshine_30,
      String sunshine_60,
      String wind_direction_10,
      String wind_direction_30,
      String wind_direction_60,
      String wind_gust_direction_10,
      String wind_gust_direction_30,
      String wind_gust_direction_60,
      String wind_gust_speed_10,
      String wind_gust_speed_30,
      String wind_gust_speed_60) {
  }

  public record Source(
      String id,
      String dwd_station_id,
      String wmo_station_id,
      String station_name,
      String observation_type,
      String first_record,
      String last_record,
      String lat,
      String lon,
      String height,
      String distance) {
  }
}