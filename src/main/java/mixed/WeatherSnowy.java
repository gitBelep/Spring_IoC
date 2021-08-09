package mixed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Profile({"wet", "cold"})
public class WeatherSnowy implements Weather{
    private int wetInMm;

    public WeatherSnowy(Environment environment) {
        this.wetInMm = Integer.parseInt( environment.getProperty("wetMmSnow") );
    }

    public int getWetInMm() {
        return wetInMm;
    }

    @Override
    public String toString() {
        return "WeatherSnowy " + wetInMm;
    }

}
