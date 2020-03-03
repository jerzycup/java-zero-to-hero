package ee.itcollage.level3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsoluteNumberTest {
    @Test
    public void positive_is_positive(){
        assertEquals(1, AbsoluteNumber.makeAbsolute(1));
    }
    @Test
    public void negative_is_positive(){
        assertEquals(1, AbsoluteNumber.makeAbsolute(-1));
    }

}
