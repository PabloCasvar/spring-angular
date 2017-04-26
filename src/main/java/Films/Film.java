package Films;

/**
 * Created by Pablo on 25/4/2017.
 */

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

public class Film {
    @NotEmpty
    private String title;

    @NotNull
    private Integer year;

    @NotEmpty
    private String director;

    public Film(){
    }

    public Film(String title, Integer year, String director){
        this.title = title;
        this.year = year;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }
}
