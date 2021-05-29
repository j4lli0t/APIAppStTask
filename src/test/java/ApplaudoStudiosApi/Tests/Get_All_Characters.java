package ApplaudoStudiosApi.Tests;
import ApplaudoStudiosApi.BaseTest.BaseTest;
import ApplaudoStudiosApi.Models.Character;
import org.testng.annotations.Test;

import java.util.List;

public class Get_All_Characters extends BaseTest
{
    @Test(description = "Get all characters from the service")
    public void getAllCharacters()
    {
        List<Character> characterList = characterServiceHelper.getAllCharacter();
        softAssert.assertNotNull(characterList,"CharacterList is not empty");
        for (int i = 0; i < characterList.size(); i++)
        {
            System.out.println("Character name: \"" + characterList.get(i).getName() + "\"");
            System.out.println("Portrayed: \"" + characterList.get(i).getPortrayed() + "\"");
            System.out.println("___________________________________________________________");
        }
        softAssert.assertAll();
    }
}
