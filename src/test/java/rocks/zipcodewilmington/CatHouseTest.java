package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    //Create tests for `void add(Cat)`
    @Test
    public void add () {
        // Given
        Cat cat1= new Cat ( "brewer",new Date(), 1);
        CatHouse.add(cat1);

        // When
        Cat expected = cat1;

        // Then
        Cat actual= CatHouse.getCatById(1);
        Assert.assertEquals(expected, actual);

    }

    // Create tests for `void remove(Integer id)`
    @Test
    public void remove () {
        // Given
        String expectedName = "";
        Date expectedBirthDate = new Date();
        Integer expectedId = 3;


        // When
        Cat actualCat = new Cat(expectedName, expectedBirthDate, expectedId);
        CatHouse.add(actualCat);
        Cat expectedCat = CatHouse.getCatById(3);
        CatHouse.remove(3);

        // Then

        Assert.assertEquals(expectedCat, actualCat);

    }

    //Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatIdTest() {

        // Given
        String expectedName = "kitty";
        Date expectedBirthDate = new Date();
        Integer expectedId = 4;


        // When
        Cat actualCat = new Cat(expectedName, expectedBirthDate, expectedId);
        CatHouse.add(actualCat);
        Cat expectedCat = CatHouse.getCatById(4);


        // Then
        Assert.assertEquals(expectedCat , actualCat);

    }

    // Create tests for Integer getNumberOfCats

    @Test
    public void getNumberofCatsTest () {

        // Given
        String expectedName ="";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;


        // When
        Cat actualCat = new Cat(expectedName, expectedBirthDate, expectedId);
        Integer actualCats =3;
        CatHouse.add(actualCat);
        Integer expectedCats = CatHouse.getNumberOfCats();


        // Then
        Assert.assertEquals(expectedCats,actualCats);
    }
}

