package mixed;

import javax.annotation.PostConstruct;

public interface Weather {

    //just because I want to call this method on a Waether-list
    int getWetInMm();

    @PostConstruct
    default void initWeather(){
        System.out.println("The weather is: "
                + this.getClass().getCanonicalName().substring(13)
                +"     (powered by the interface)");
    }

}
