package rocks.zipcodewilmington;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import java.sql.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
@Test
public void testCreateDog() {
    String expectedName = "Lily";
    Date expectedDate = Date.valueOf("2001-02-03");
    Dog actualDog = AnimalFactory.createDog(expectedName,expectedDate);

    Assert.assertEquals(actualDog.getName(),expectedName);
    Assert.assertEquals(actualDog.getBirthDate(),expectedDate);
        }
@Test
public void testCreateCat() {
    String expectedName = "Chelsie";
    Date expectedDate = Date.valueOf("2021-02-03");
    Cat actualCat = AnimalFactory.createCat(expectedName, expectedDate);

    Assert.assertEquals(actualCat.getName(), expectedName);
    Assert.assertEquals(actualCat.getBirthDate(), expectedDate);
}
    }

