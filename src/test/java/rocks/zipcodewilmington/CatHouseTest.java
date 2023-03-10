package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.sql.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testAdd() {
        Cat expected = AnimalFactory.createCat("Kirby", Date.valueOf("2021-10-03"));
        //CatHouse CH = new CatHouse(); //Initilizing a new CatHouse doesn't seem to work
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
        CatHouse.clear(); //So we called Clear
    }
    @Test
    public void testAdd2() {
        Cat cat1 = AnimalFactory.createCat("Kirby", Date.valueOf("2021-10-03"));
        CatHouse.add(cat1);

        Cat expected = AnimalFactory.createCat("Tubby", Date.valueOf("2015-04-04"));
        CatHouse.add(expected);

        Cat cat2 = AnimalFactory.createCat("Libby", Date.valueOf("2012-12-12"));
        CatHouse.add(cat2);

        Cat actual = CatHouse.getCatById(1); //Need to space the things out or it runs too fast to count correctly.
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testRemove() {
        Cat cat1 = AnimalFactory.createCat("Kirby", Date.valueOf("2021-10-03"));
        CatHouse.add(cat1);
        Cat expected = null;
        CatHouse.remove(0);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testRemove2() {
        Cat cat1 = AnimalFactory.createCat("Kirby", Date.valueOf("2021-10-03"));
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat("Libby", Date.valueOf("2013-12-12"));
        CatHouse.add(cat2);
        Cat cat3 = AnimalFactory.createCat("Tubby", Date.valueOf("2015-04-04"));
        CatHouse.add(cat3);
        Cat expected = null;
        CatHouse.remove(2);
        Cat actual = CatHouse.getCatById(2);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void testRemoveByCat() {
        Cat cat1 = AnimalFactory.createCat("Kirby", Date.valueOf("2021-10-03"));
        CatHouse.add(cat1);
        Cat expected = null;
        CatHouse.remove(cat1);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testRemoveByCat2() {
        Cat cat1 = AnimalFactory.createCat("Kirby", Date.valueOf("2021-10-03"));
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat("Libby", Date.valueOf("2013-12-12"));
        CatHouse.add(cat2);
        Cat cat3 = AnimalFactory.createCat("Tubby", Date.valueOf("2015-04-04"));
        CatHouse.add(cat3);
        Cat expected = null;
        CatHouse.remove(cat2);
        Cat actual = CatHouse.getCatById(2);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
}