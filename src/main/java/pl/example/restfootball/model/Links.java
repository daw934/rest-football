package pl.example.restfootball.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Links {
    private Self self;
    private Team team;
}
