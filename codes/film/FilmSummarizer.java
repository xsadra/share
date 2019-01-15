package exercises.week09.ex05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {

    List<Film> films= new FilmReader().getFilms();

    public void analyseData() {
//        Which are the three films with the highest rating, sorted by rating?
        films.stream()
                .sorted(Comparator.comparing(Film::getScore))
                .limit(3)
                .forEach(e-> System.out.println(e.toString()));
//        Top 3 with highest rating, sorted by rating:
//[“Stiff Upper Lips”, “Dancer, Texas Pop. 81”, “Me You and Five Bucks”]


//        Which are the three films with the highest rating that are longer than three hours, sorted by rating?

//        Which are the four most expensive films, sorted by budget?

//        Which are the four most expensive films that are shorter than one hour and a half, sorted by budget?

//        Which are the four most rated films with a rating higher
//        than 7 and a budget between 50.000 and 500.000 dollars, sorted by budget?

//        Ask two additional questions that you might find interesting.

    }
}
