package mixed;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
@ActiveProfiles("wet")
public class ProfilesTest {

    @Autowired
    WeatherService ws;

    @Test
    void testWet(){
        //profile wet -> Rain + Snow = 20 + 10
        assertEquals(30, ws.getWetToday());
    }

}


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
@ActiveProfiles("warm")
class ProfilTestWarm {

    @Autowired
    WeatherService ws;

    @Test
    void testWarm(){
        //profile warm -> Rain + Sunny = 1 + 20
        assertEquals(21, ws.getWetToday());
    }

}


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
@ActiveProfiles("cold")
class ProfilTestCold {

    @Autowired
    WeatherService ws;

    @Test
    void testCold(){
        //profile warm -> Snow = 10
        assertEquals(10, ws.getWetToday());
    }

}

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
@ActiveProfiles({"cold", "warm"})
class ProfilTestAll {

    @Autowired
    WeatherService ws;

    @Test
    void testAll(){
        assertEquals(31, ws.getWetToday());
    }

}
