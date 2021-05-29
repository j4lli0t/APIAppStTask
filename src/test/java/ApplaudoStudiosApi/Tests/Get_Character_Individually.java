package ApplaudoStudiosApi.Tests;

import ApplaudoStudiosApi.BaseTest.BaseTest;
import ApplaudoStudiosApi.Models.Character;
import org.testng.annotations.Test;

public class Get_Character_Individually extends BaseTest
{
    @Test(description = "Get Walter White information, id : 1")
    public void getOneCharacter()
    {
        Character character = characterServiceHelper.getOnceCharacter(1);
        softAssert.assertNotNull(character,"Character not empty");
        System.out.println(character.getName() + "---> Birthday ---> " + character.getBirthday());
    }
}
