package mixed;

import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Profile("warm")
public class WeatherSunny implements Weather{
    private int wetInMm;

    public WeatherSunny(Environment environment) {
        this.wetInMm =  Integer.parseInt( environment.getProperty("wetMmSun") );
    }

    public int getWetInMm() {
        return wetInMm;
    }

    public void setWetInMm(int wetInMm) {
        this.wetInMm = wetInMm;
    }

    @Override
    public String toString() {
        return "WeatherSunny " + wetInMm;
    }

}
