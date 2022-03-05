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
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    //Create tests for `void add(Dog)`
    @Test
    public void add() {
        // Given
        Dog dog1 = new Dog("Rocky", new Date(), 1);
        DogHouse.add(dog1);

        // When
        Dog expected = dog1;

        // Then
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(expected, actual);

    }

    // Create tests for `void remove(Integer id)`
    @Test
    public void remove() {
        // Given
        String expectedName = "";
        Date expectedBirthDate = new Date();
        Integer expectedId = 3;


        // When
        Dog actualDog = new Dog(expectedName, expectedBirthDate, expectedId);
        DogHouse.add(actualDog);
        Dog expectedDog = DogHouse.getDogById(3);
        DogHouse.remove(3);

        // Then

        Assert.assertEquals(expectedDog, actualDog);
    }

    //Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getDogIdTest() {

        // Given
        String expectedName = " Pepper";
        Date expectedBirthDate = new Date();
        Integer expectedId = 4;


        // When
        Dog actualDog = new Dog(expectedName, expectedBirthDate, expectedId);
        DogHouse.add(actualDog);
        Dog expectedDog = DogHouse.getDogById(4);


        // Then
        Assert.assertEquals(expectedDog, actualDog);

    }


    // Create tests for Integer getNumberOfDogs

    @Test
    public void getNumberofDogsTest() {
        String expectedName = "";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;


        // When
        Dog actualDog = new Dog(expectedName, expectedBirthDate, expectedId);
        Integer actualDogs = 2;
        DogHouse.add(actualDog);
        Integer expectedDogs = DogHouse.getNumberOfDogs();


        // Then
        Assert.assertEquals(expectedDogs, actualDogs);

    }
}