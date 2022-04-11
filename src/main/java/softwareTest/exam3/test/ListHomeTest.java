package softwareTest.exam3.test;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;
import softwareTest.exam3.hotel.IData;
import softwareTest.exam3.hotel.ListHome;

public class ListHomeTest {
    private Mockery context = new Mockery();
    private IData iData = null;
    private ListHome lh = null;

    @Before
    public void setUp(){
        iData = context.mock(IData.class);
        lh = new ListHome(iData);
        context.checking(new Expectations(){{
            oneOf(iData).search();
        }});
    }

    @Test
    public void testSearch(){
        lh.search();
    }
}
