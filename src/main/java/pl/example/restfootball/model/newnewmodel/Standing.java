
package pl.example.restfootball.model.newnewmodel;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_links",
    "position",
    "teamName",
    "crestURI",
    "playedGames",
    "points",
    "goals",
    "goalsAgainst",
    "goalDifference",
    "wins",
    "draws",
    "losses",
    "home",
    "away"
})
public class Standing {

    @JsonProperty("_links")
    private Links_ links;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("teamName")
    private String teamName;
    @JsonProperty("crestURI")
    private Object crestURI;
    @JsonProperty("playedGames")
    private Integer playedGames;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("goals")
    private Integer goals;
    @JsonProperty("goalsAgainst")
    private Integer goalsAgainst;
    @JsonProperty("goalDifference")
    private Integer goalDifference;
    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("draws")
    private Integer draws;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("home")
    private Home home;
    @JsonProperty("away")
    private Away away;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_links")
    public Links_ getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links_ links) {
        this.links = links;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("teamName")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("teamName")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("crestURI")
    public Object getCrestURI() {
        return crestURI;
    }

    @JsonProperty("crestURI")
    public void setCrestURI(Object crestURI) {
        this.crestURI = crestURI;
    }

    @JsonProperty("playedGames")
    public Integer getPlayedGames() {
        return playedGames;
    }

    @JsonProperty("playedGames")
    public void setPlayedGames(Integer playedGames) {
        this.playedGames = playedGames;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("goals")
    public Integer getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    @JsonProperty("goalsAgainst")
    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    @JsonProperty("goalsAgainst")
    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    @JsonProperty("goalDifference")
    public Integer getGoalDifference() {
        return goalDifference;
    }

    @JsonProperty("goalDifference")
    public void setGoalDifference(Integer goalDifference) {
        this.goalDifference = goalDifference;
    }

    @JsonProperty("wins")
    public Integer getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @JsonProperty("draws")
    public Integer getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    @JsonProperty("losses")
    public Integer getLosses() {
        return losses;
    }

    @JsonProperty("losses")
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @JsonProperty("home")
    public Home getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(Home home) {
        this.home = home;
    }

    @JsonProperty("away")
    public Away getAway() {
        return away;
    }

    @JsonProperty("away")
    public void setAway(Away away) {
        this.away = away;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
