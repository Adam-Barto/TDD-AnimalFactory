package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some)
        int expected = 1;
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        // When
        DogHouse.add(animal);
        int actual = DogHouse.getNumberOfDogs();
        // Then

        Assert.assertEquals(expected,actual);
        DogHouse.clear();
    }

    @Test
    public void testAddDog() {
        String name = "Wren";
        Date birthDate = new Date(2001,1,4);
        Dog expected = AnimalFactory.createDog(name, birthDate);

        DogHouse.add(expected);

        Dog actual = DogHouse.getDogById(0);

        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
    @Test
    public void testRemoveDogId() {
        String name = "Wren";
        Date birthDate = new Date(2001,1,4);
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);
        Dog expected = null;

        DogHouse.remove(0);

        Dog actual = DogHouse.getDogById(0);

        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
    @Test
    public void testRemoveDog() {
        String name = "Wren";
        Date birthDate = new Date(2001,1,4);
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);
        Dog expected = null;

        DogHouse.remove(animal);

        Dog actual = DogHouse.getDogById(0);

        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
    @Test
    public void getDogById() {
        String name = "Wren";
        Date birthDate = new Date(2001,1,4);
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Dog expected = animal;

        DogHouse.add(animal);
        Dog actual = DogHouse.getDogById(0);

        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }

}