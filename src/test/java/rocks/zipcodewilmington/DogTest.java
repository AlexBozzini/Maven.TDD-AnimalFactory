package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest(){
        // given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // when
        Dog dog = new Dog (givenName, givenBirthDate, givenId);
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();
        // then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        // given
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        // when
        String actual = dog.speak();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        // given
        Dog dog = new Dog(null, null, null);
        Date expected = new Date();
        // when
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest(){
        // given
        Dog dog = new Dog(null, null, null);
        int preMealCount = dog.getNumberOfMealsEaten();
        int expected = preMealCount + 1;
        // when
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        // given
        Dog dog = new Dog(null, null, 4);
        Integer expected = 4;
        // when
        Integer actual = dog.getId();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest(){
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
