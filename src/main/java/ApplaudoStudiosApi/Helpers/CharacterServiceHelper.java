package ApplaudoStudiosApi.Helpers;

import ApplaudoStudiosApi.Constants.Endpoints;
import ApplaudoStudiosApi.Models.Character;
import ApplaudoStudiosApi.Utils.ConfigManager;
import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.List;

public class CharacterServiceHelper
{
    private static final String BASE_URL = ConfigManager.getInstance().getString("baseURL");
    public CharacterServiceHelper()
    {
        RestAssured.baseURI = BASE_URL;
        RestAssured.useRelaxedHTTPSValidation();
    }

    /*Method for get all characters an they information*/
    public List<Character> getAllCharacter()
    {
        Response response = RestAssured.given().
                contentType(ContentType.JSON).
                get(Endpoints.GET_ALL_CHARACTERS).
                andReturn();
        Type type = new TypeReference<List<Character>>(){}.getType();
        List<Character> characterList = response.as(type);
        return characterList;
    }

    /*Get only once character*/
    public Character getOnceCharacter(Integer id)
    {
        Response response = RestAssured.given().
                contentType(ContentType.JSON).pathParam("id",id).
                get(Endpoints.GET_ONCE_CHARACTER).
                andReturn();
        Type type = new TypeReference<List<Character>>(){}.getType();
        List<Character> character = response.as(type);
        return character.get(0);
    }
}
