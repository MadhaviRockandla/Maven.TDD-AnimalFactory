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

    public void addDogTest(){
        //Given
        String name = "milo";
        Date date = new Date();
        DogHouse.clear();

        //When
        Dog dog = AnimalFactory.createDog(name,date);
        DogHouse.add(dog);
        Dog dog1 = AnimalFactory.createDog(name,date);
        DogHouse.add(dog1);
        Dog actual = DogHouse.getDogById(1);

        //Then

        Assert.assertEquals(actual,dog1);
    }
    @Test
    public void removeDog(){
        String name = "milo";
        Date date = new Date();
        DogHouse.clear();

        //When
        Dog dog = AnimalFactory.createDog(name,date);
        DogHouse.add(dog);
        Dog dog1 = AnimalFactory.createDog(name,date);
        DogHouse.add(dog1);
        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(0);

        Assert.assertTrue(actual == null);

    }
    @Test
    public void removeIntDog(){
        String name = "milo";
        Date date = new Date();
        DogHouse.clear();

        //When
        Dog dog = AnimalFactory.createDog(name,date);
        DogHouse.add(dog);
        Dog dog1 = AnimalFactory.createDog(name,date);
        DogHouse.add(dog1);
        DogHouse.remove(0);
        Dog actual = DogHouse.getDogById(0);

        Assert.assertTrue(actual == null);

    }
    @Test
    public void getDogByIdTest(){

        String name = "milo";
        Date date = new Date();
        DogHouse.clear();

        //When
        Dog dog = AnimalFactory.createDog(name,date);
        DogHouse.add(dog);
        Dog dog1 = AnimalFactory.createDog(name,date);
        DogHouse.add(dog1);
        Dog actual = DogHouse.getDogById(0);

        Assert.assertTrue(actual == dog);

    }
    @Test
    public void getNumberOfDogTest(){

        String name = "milo";
        Date date = new Date();
        DogHouse.clear();

        //When
        Dog dog = AnimalFactory.createDog(name,date);
        DogHouse.add(dog);
        Dog dog1 = AnimalFactory.createDog(name,date);
        DogHouse.add(dog1);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertTrue(actual == 2);

    }
}