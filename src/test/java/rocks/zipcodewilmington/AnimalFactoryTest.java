package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testDog_name_rocky_id_0() {

        String dogName = "rocky";
        Dog rocky = AnimalFactory.createDog(dogName, new Date());
        DogHouse.add(rocky);
        Assert.assertEquals(rocky.getName(), dogName);
        Assert.assertEquals(rocky.getId(), Integer.valueOf(0));
    }

    @Test
    public void testDog_name_april_id_1() {

        String dogName = "april";
        Dog april = AnimalFactory.createDog(dogName, new Date());
        DogHouse.add(april);
        Assert.assertEquals(april.getName(), dogName);
        Assert.assertEquals(april.getId(), Integer.valueOf(1));
    }

    @Test
    public void testCat_name_brewer_id_0() {

        String catName = "brewer";
        Cat brewer = AnimalFactory.createCat(catName, new Date());
        CatHouse.add(brewer);
        Assert.assertEquals(brewer.getName(), catName);
        Assert.assertEquals(brewer.getId(), Integer.valueOf(0));
    }

    @Test
    public void testCat_name_kitty_id_1() {

        String catName = "kitty";
        Cat kitty = AnimalFactory.createCat(catName, new Date());
        CatHouse.add(kitty);
        Assert.assertEquals(kitty.getName(), catName);
        Assert.assertEquals(kitty.getId(), Integer.valueOf(0));
    }
}


