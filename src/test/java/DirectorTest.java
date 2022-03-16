import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Ryan", 12345, 420.0, "Dank Memes", 69.0);
    }

    @Test
    public void hasIncreasedBonus(){
        assertEquals(8.4, director.payBonus(), 0);
    }
}
