package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

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
        Cat expected = AnimalFactory.createCat("Kirby", new Date(2001,02,03));
        //CatHouse CH = new CatHouse(); //Initilizing a new CatHouse doesn't seem to work
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
        CatHouse.clear(); //So we called Clear
    }
    @Test
    public void testAdd2() {
        Cat cat1 = AnimalFactory.createCat("Kirby", new Date(2021,3,4));
        CatHouse.add(cat1);

        Cat expected = AnimalFactory.createCat("Tubby", new Date(2015,04,04));
        CatHouse.add(expected);

        Cat cat2 = AnimalFactory.createCat("Libby", new Date(2012,12,12));
        CatHouse.add(cat2);

        Cat actual = CatHouse.getCatById(1); //Need to space the things out or it runs too fast to count correctly.
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testRemove() {
        Cat cat1 = AnimalFactory.createCat("Kirby", new Date(2021,3,4));
        CatHouse.add(cat1);
        Cat expected = null;
        CatHouse.remove(0);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testRemove2() {
        Cat cat1 = AnimalFactory.createCat("Kirby", new Date(2021,3,4));
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat("Libby", new Date(2013,12,12));
        CatHouse.add(cat2);
        Cat cat3 = AnimalFactory.createCat("Tubby", new Date(2015,04,04));
        CatHouse.add(cat3);
        Cat expected = null;
        CatHouse.remove(2);
        Cat actual = CatHouse.getCatById(2);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void testRemoveByCat() {
        Cat cat1 = AnimalFactory.createCat("Kirby", new Date(2021,3,4));
        CatHouse.add(cat1);
        Cat expected = null;
        CatHouse.remove(cat1);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testRemoveByCat2() {
        Cat cat1 = AnimalFactory.createCat("Kirby", new Date(2021,3,4));
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat("Libby", new Date(2013,12,12));
        CatHouse.add(cat2);
        Cat cat3 = AnimalFactory.createCat("Tubby", new Date(2015,4,4));
        CatHouse.add(cat3);
        Cat expected = null;
        CatHouse.remove(cat2);
        Cat actual = CatHouse.getCatById(1);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testGetCatByID() {
        Cat expected = AnimalFactory.createCat("Kirby", new Date(2021,3,4));
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testGetCatByID2() {
        Cat cat1 = AnimalFactory.createCat("Kirby", new Date(2021,3,4));
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat("Libby", new Date(2013,12,12));
        CatHouse.add(cat2);
        Cat expected = AnimalFactory.createCat("Tubby", new Date(2015,4,4));
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(2);
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }
    @Test
    public void testGetNumberOfCats(){
        int expected = 1;
        Cat cat = AnimalFactory.createCat("Chelsie", new Date(1995,03,21));
        CatHouse.add(cat);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
        CatHouse.clear();
    }
    @Test
    public void testGetNumberOfCats1(){
        int expected = 3;
        Cat cat = AnimalFactory.createCat("Jack", new Date(1995,03,21));
        CatHouse.add(cat);
        Cat cat1 = AnimalFactory.createCat("Rouwell", new Date(2001,03,21));
        CatHouse.add(cat1);
        Cat cat2 = AnimalFactory.createCat("Chelsie", new Date(2001,03,21));
        CatHouse.add(cat2);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
        CatHouse.clear();
    }

}