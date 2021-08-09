package mixed;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {
    private List<Weather> weatherToday;

    public WeatherService(List<Weather> weatherToday) {
        this.weatherToday = weatherToday;
    }

    public int getWetToday(){
        int sum = 0;
        for (Weather w : weatherToday){
            sum += w.getWetInMm();
        }
        return sum;
    }

    public List<Weather> getWeatherToday() {
        return new ArrayList<>(weatherToday);
    }

    public void setWeatherToday(List<Weather> weatherToday) {
        this.weatherToday = weatherToday;
    }

}
