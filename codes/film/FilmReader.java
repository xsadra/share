package exercises.week09.ex05;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilmReader {
    public List<Film> getFilms() {
          return new FileReader().asStream("exercises/week09/ex05/films.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(convertToFilm())
                .collect(Collectors.toList());
    }

    private Function<String[], Film> convertToFilm() {
        return e -> new Film(e[7], Integer.valueOf(e[9]), Long.valueOf(e[10]),
                Integer.valueOf(e[6]), Long.valueOf(e[0]), Long.valueOf(e[5]));
    }
}