
package pl.example.restfootball.model.v1model;

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
    private int position;
    @JsonProperty("teamName")
    private String teamName;
    @JsonProperty("crestURI")
    private Object crestURI;
    @JsonProperty("playedGames")
    private int playedGames;
    @JsonProperty("points")
    private int points;
    @JsonProperty("goals")
    private int goals;
    @JsonProperty("goalsAgainst")
    private int goalsAgainst;
    @JsonProperty("goalDifference")
    private int goalDifference;
    @JsonProperty("wins")
    private int wins;
    @JsonProperty("draws")
    private int draws;
    @JsonProperty("losses")
    private int losses;
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
    public int getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(int position) {
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
    public int getPlayedGames() {
        return playedGames;
    }

    @JsonProperty("playedGames")
    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }

    @JsonProperty("points")
    public int getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(int points) {
        this.points = points;
    }

    @JsonProperty("goals")
    public int getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(int goals) {
        this.goals = goals;
    }

    @JsonProperty("goalsAgainst")
    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    @JsonProperty("goalsAgainst")
    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    @JsonProperty("goalDifference")
    public int getGoalDifference() {
        return goalDifference;
    }

    @JsonProperty("goalDifference")
    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    @JsonProperty("wins")
    public int getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(int wins) {
        this.wins = wins;
    }

    @JsonProperty("draws")
    public int getDraws() {
        return draws;
    }

    @JsonProperty("draws")
    public void setDraws(int draws) {
        this.draws = draws;
    }

    @JsonProperty("losses")
    public int getLosses() {
        return losses;
    }

    @JsonProperty("losses")
    public void setLosses(int losses) {
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
