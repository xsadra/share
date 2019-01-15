package exercises.week09.ex05;

public class Film {
    private String title;
    private Integer score;
    private Long voteCount;
    private Integer runtime;
    private Long budget;
    private Long revenue;

    public Film(String title, Integer score, Long voteCount, Integer runtime, Long budget, Long revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Integer getScore() {
        return score;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }
}

