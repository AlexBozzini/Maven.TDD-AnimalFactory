package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
        // given
        Cat expected = new Cat(null, null, 7);
        CatHouse catHouse = new CatHouse();
        // when
        catHouse.add(expected);
        // then
        Cat actual = catHouse.getCatById(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest(){
        // given
        Cat cat = new Cat (null, null, 8);
        CatHouse catHouse = new CatHouse();
        catHouse.add(cat);
        // when
        catHouse.remove(cat);
        // then
        Assert.assertNull(catHouse.getCatById(8));
    }
    @Test
    public void removeCatByIdTest(){
        // given
        Cat cat = new Cat (null, null, 8);
        CatHouse catHouse = new CatHouse();
        catHouse.add(cat);
        // when
        catHouse.remove(8);
        // then
        Assert.assertNull(catHouse.getCatById(8));
    }

    @Test
    public void getCatByIdTest(){
        // given
        Cat expected = new Cat (null, null, 9);
        CatHouse catHouse = new CatHouse();
        catHouse.add(expected);
        // when
        Cat actual = catHouse.getCatById(9);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        // given
        Cat cat = new Cat (null, null, 10);
        CatHouse catHouse = new CatHouse();
        catHouse.add(cat);
        Integer expected = 1;
        // when
        Integer actual = catHouse.getNumberOfCats();
        // then
        Assert.assertEquals(expected, actual);
    }
}
