
package pl.example.restfootball.model.newnewmodel;

import java.util.HashMap;
import java.util.List;
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
    "leagueCaption",
    "matchday",
    "standing"
})
public class Example {

    @JsonProperty("_links")
    private Links links;
    @JsonProperty("leagueCaption")
    private String leagueCaption;
    @JsonProperty("matchday")
    private Integer matchday;
    @JsonProperty("standing")
    private List<Standing> standing = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("leagueCaption")
    public String getLeagueCaption() {
        return leagueCaption;
    }

    @JsonProperty("leagueCaption")
    public void setLeagueCaption(String leagueCaption) {
        this.leagueCaption = leagueCaption;
    }

    @JsonProperty("matchday")
    public Integer getMatchday() {
        return matchday;
    }

    @JsonProperty("matchday")
    public void setMatchday(Integer matchday) {
        this.matchday = matchday;
    }

    @JsonProperty("standing")
    public List<Standing> getStanding() {
        return standing;
    }

    @JsonProperty("standing")
    public void setStanding(List<Standing> standing) {
        this.standing = standing;
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
