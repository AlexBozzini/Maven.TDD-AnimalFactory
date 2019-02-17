package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

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
    public void addDogTest(){
        // given
        Dog expected = new Dog(null, null, 7);
        DogHouse dogHouse = new DogHouse();
        // when
        dogHouse.add(expected);
        // then
        Dog actual = dogHouse.getDogById(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest(){
        // given
        Dog dog = new Dog (null, null, 8);
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(dog);
        // when
        dogHouse.remove(dog);
        // then
        Assert.assertNull(dogHouse.getDogById(8));
    }
    @Test
    public void removeDogByIdTest(){
        // given
        Dog dog = new Dog (null, null, 8);
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(dog);
        // when
        dogHouse.remove(8);
        // then
        Assert.assertNull(dogHouse.getDogById(8));
    }

    @Test
    public void getDogByIdTest(){
        // given
        Dog expected = new Dog (null, null, 9);
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(expected);
        // when
        Dog actual = dogHouse.getDogById(9);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest(){
        // given
        Dog dog = new Dog (null, null, 10);
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(dog);
        Integer expected = 1;
        // when
        Integer actual = dogHouse.getNumberOfDogs();
        // then
        Assert.assertEquals(expected, actual);
    }
}
