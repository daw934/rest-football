package pl.example.restfootball.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player {
    private String name;
    private String position;
    private Integer jerseyNumber;
}
