package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test

    public void createDog(){
        Date date = new Date();

        Dog dog = AnimalFactory.createDog("milo",date);

        Assert.assertTrue(dog instanceof Animal);

    }
    @Test
    public void createCat(){
        Date date = new Date();

        Cat cat = AnimalFactory.createCat("milo",date);

        Assert.assertTrue(cat instanceof Animal);

    }



}

