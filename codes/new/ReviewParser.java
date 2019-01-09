package oop.stream.review.parser;

import oop.stream.review.model.Review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReviewParser {


    public List<Review> getReviews() {
        String filePath = "src/oop/stream/review/data/reviews.csv";
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines.skip(1)
                    .map(line -> line.split(";"))
                    .map(toReview())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private Function<String[], Review> toReview() {
        return columns -> {
            Review review = new Review();
            review.setRecipe(columns[1]);
            review.setRating(Double.parseDouble(columns[2]));
            review.setFeedback(toFeedback(columns[3]));
            return review;
        };
    }

    private List<String> toFeedback(String column) {
        String objects = column.replaceAll("\\[", "").replaceAll("]", "");
        objects = objects.replaceAll("\\{", "").replaceAll("}", "");
        objects = objects.replaceAll("'", "");

        String[] words = objects.split(", ");
        return Stream.of(words)
                .map(word -> word.split(": "))
                .map(word -> word[1])
                .collect(Collectors.toList());
    }
}
