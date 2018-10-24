package pl.example.restfootball.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Away {
    private int goals;
    private int goalsAgainst;
    private int wins;
    private int draws;
    private int losses;
}
