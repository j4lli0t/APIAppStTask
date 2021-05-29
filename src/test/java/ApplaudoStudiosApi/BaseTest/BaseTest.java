package ApplaudoStudiosApi.BaseTest;

import ApplaudoStudiosApi.Helpers.CharacterServiceHelper;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class BaseTest
{
    protected CharacterServiceHelper characterServiceHelper;
    protected SoftAssert softAssert = new SoftAssert();
    @BeforeClass
    public void setUp()
    {
        characterServiceHelper = new CharacterServiceHelper();
    }
}
