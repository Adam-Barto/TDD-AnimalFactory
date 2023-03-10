package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void setDateTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        Date givenDate = new Date(2001,12,1);

        // When (a dog's name is set to the given name)
        dog.setBirthDate(givenDate);

        // Then (we expect to get the given name from the dog)
        Date dogDate = dog.getBirthDate();
        System.out.println(dogDate);
        Assert.assertEquals(dogDate, givenDate);
    }
    @Test
    public void setIdTest() {
        // Given (a name exists and a dog exists)
        int givenId = 420;
        Dog dog = new Dog(null, null, givenId);
        int dogId = dog.getId();
        Assert.assertEquals(dogId, givenId);
    }
    @Test
    public void speakTest() {
        // Given (a name exists and a dog exists)
        String actual = "bark!";
        Dog dog = new Dog(null, null, null);
        String expected = dog.speak();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void setBirthDateTest() {
        // Given (a name exists and a dog exists)
        Date expected = new Date(2001,12,1);
        Dog dog = new Dog(null, null, null);
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testEat(){
        int expected = 1;
        Dog dog = new Dog("", new Date(),0);
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetId(){
        int expected = 4;
        Dog dog = new Dog("", new Date(),4);

        int actual = dog.getId();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testIsInstanceOfAnimal(){
        boolean expected = true;
        Dog dog = new Dog("", new Date(),4);

        boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testIsInstanceOfMammal() {
        boolean expected = true;
        Dog dog = new Dog("", new Date(), 4);

        boolean actual = dog instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }
}
