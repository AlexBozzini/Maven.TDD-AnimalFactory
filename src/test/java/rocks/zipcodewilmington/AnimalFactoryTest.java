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
    public void createDogTest(){
        // given
        String expectedName = "Milo";
        Date expectedBirthDate = new Date();
        // when
        String actualName = "Milo";
        Date actualBirthDate = new Date();
        Dog actual = AnimalFactory.createDog(actualName, actualBirthDate );
        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void createCatTest(){
        // given
        String expectedName = "Zula";
        Date expectedBirthDate = new Date();
        // when
        String actualName = "Zula";
        Date actualBirthDate = new Date();
        Cat actual = AnimalFactory.createCat(actualName, actualBirthDate);
        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
}
