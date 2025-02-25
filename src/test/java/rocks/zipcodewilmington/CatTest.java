package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date(2001,12,11);
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void testSetName(){
        String givenName = "Jelly";
        Date birthDay = new Date(2021,10,03);
        Cat cat = new Cat("", birthDay,0);

        cat.setName(givenName);
        String expected = givenName;

        Assert.assertEquals(expected,givenName);
    }

    @Test
    public void testspeak(){
        String actual = "meow!";
        Date birthDay = new Date(2021,10,03);
        Cat cat = new Cat("", birthDay,0);

        String expected = cat.speak();;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSetBirthDate(){
        Date expected = new Date(2021,10,03);
        Date birthDay = new Date();
        Cat cat = new Cat("", birthDay,0);

        cat.setBirthDate(expected);

        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testEat(){
        int expected = 1;
        Cat cat = new Cat("", new Date(),0);
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetId(){
        int expected = 4;
        Cat cat = new Cat("", new Date(),4);

        int actual = cat.getId();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testIsInstanceOfAnimal(){
        boolean expected = true;
        Cat cat = new Cat("", new Date(),4);

        boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testIsInstanceOfMammal(){
        boolean expected = true;
        Cat cat = new Cat("", new Date(),4);

        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected,actual);
    }

}
