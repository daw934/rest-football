package pl.example.restfootball.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Standing {
    private Links2 _links;
    private int position;
    private String teamName;
    private String crestURI;
    private int playedGames;
    private int points;
    private int goals;
    private int goalsAgainst;
    private int goalDifference;
    private int wins;
    private int draws;
    private int losses;
    private Home home;
    private Away away;
}
