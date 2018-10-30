
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
    "goals",
    "goalsAgainst",
    "wins",
    "draws",
    "losses"
})
public class Home {

    @JsonProperty("goals")
    private int goals;
    @JsonProperty("goalsAgainst")
    private int goalsAgainst;
    @JsonProperty("wins")
    private int wins;
    @JsonProperty("draws")
    private int draws;
    @JsonProperty("losses")
    private int losses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
