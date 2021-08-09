package mixed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Profile({"wet", "warm"})
public class WeatherRainy implements Weather{
    private int wetInMm;

    @Autowired              //@Autowired not needed
    public WeatherRainy(Environment environment) {
        this.wetInMm = Integer.parseInt( environment.getProperty("wetMmRain") );
    }

    public int getWetInMm() {
        return wetInMm;
    }

    @Override
    public String toString() {
        return "WeatherRainy " + wetInMm;
    }

}
