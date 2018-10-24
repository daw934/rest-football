package pl.example.restfootball.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Setter
@Getter
@ToString
public class RootObject {
    private Links _links;
    private String leagueCaption;
    private int matchday;
    private List<Standing> standing;
}
