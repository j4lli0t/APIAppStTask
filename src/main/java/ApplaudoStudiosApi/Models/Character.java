package ApplaudoStudiosApi.Models;

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
        "char_id",
        "name",
        "birthday",
        "occupation",
        "img",
        "status",
        "nickname",
        "appearance",
        "portrayed",
        "category",
        "better_call_saul_appearance"
})


public class Character {

    @JsonProperty("char_id")
    private Integer charId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("occupation")
    private List<String> occupation = null;
    @JsonProperty("img")
    private String img;
    @JsonProperty("status")
    private String status;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("appearance")
    private List<Integer> appearance = null;
    @JsonProperty("portrayed")
    private String portrayed;
    @JsonProperty("category")
    private String category;
    @JsonProperty("better_call_saul_appearance")
    private List<Object> betterCallSaulAppearance = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("char_id")
    public Integer getCharId() {
        return charId;
    }

    @JsonProperty("char_id")
    public void setCharId(Integer charId) {
        this.charId = charId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("birthday")
    public String getBirthday() {
        return birthday;
    }

    @JsonProperty("birthday")
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @JsonProperty("occupation")
    public List<String> getOccupation() {
        return occupation;
    }

    @JsonProperty("occupation")
    public void setOccupation(List<String> occupation) {
        this.occupation = occupation;
    }

    @JsonProperty("img")
    public String getImg() {
        return img;
    }

    @JsonProperty("img")
    public void setImg(String img) {
        this.img = img;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("appearance")
    public List<Integer> getAppearance() {
        return appearance;
    }

    @JsonProperty("appearance")
    public void setAppearance(List<Integer> appearance) {
        this.appearance = appearance;
    }

    @JsonProperty("portrayed")
    public String getPortrayed() {
        return portrayed;
    }

    @JsonProperty("portrayed")
    public void setPortrayed(String portrayed) {
        this.portrayed = portrayed;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("better_call_saul_appearance")
    public List<Object> getBetterCallSaulAppearance() {
        return betterCallSaulAppearance;
    }

    @JsonProperty("better_call_saul_appearance")
    public void setBetterCallSaulAppearance(List<Object> betterCallSaulAppearance) {
        this.betterCallSaulAppearance = betterCallSaulAppearance;
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
