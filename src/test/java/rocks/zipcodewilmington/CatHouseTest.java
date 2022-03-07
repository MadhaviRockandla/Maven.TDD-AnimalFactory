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
    public void addCatTest(){
        //Given
        String name = "milo";
        Date date = new Date();
        CatHouse.clear();

        //When
        Cat cat = AnimalFactory.createCat(name,date);
        CatHouse.add(cat);
        Cat catm = AnimalFactory.createCat(name,date);
        CatHouse.add(catm);
        Cat actual = CatHouse.getCatById(1);

        //Then

        Assert.assertEquals(actual,catm);
    }
    @Test
    public void removeCat(){
        String name = "milo";
        Date date = new Date();
        CatHouse.clear();

        //When
        Cat cat = AnimalFactory.createCat(name,date);
        CatHouse.add(cat);
        Cat catm = AnimalFactory.createCat(name,date);
        CatHouse.add(catm);
        CatHouse.remove(cat);
        Cat actual = CatHouse.getCatById(0);

        Assert.assertTrue(actual == null);

    }
    @Test
    public void removeIntCat(){
        String name = "milo";
        Date date = new Date();
        CatHouse.clear();

        //When
        Cat cat = AnimalFactory.createCat(name,date);
        CatHouse.add(cat);
        Cat catm = AnimalFactory.createCat(name,date);
        CatHouse.add(catm);
        CatHouse.remove(0);
        Cat actual = CatHouse.getCatById(0);

        Assert.assertTrue(actual == null);

    }
    @Test
    public void getCatByIdTest(){

        String name = "milo";
        Date date = new Date();
        CatHouse.clear();

        //When
        Cat cat = AnimalFactory.createCat(name,date);
        CatHouse.add(cat);
        Cat catm = AnimalFactory.createCat(name,date);
        CatHouse.add(catm);
        Cat actual = CatHouse.getCatById(0);

        Assert.assertTrue(actual == cat);

    }
    @Test
    public void getNumberOfCatTest(){

        String name = "milo";
        Date date = new Date();
        CatHouse.clear();

        //When
        Cat cat = AnimalFactory.createCat(name,date);
        CatHouse.add(cat);
        Cat catm = AnimalFactory.createCat(name,date);
        CatHouse.add(catm);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertTrue(actual == 2);

    }
}

