package softwareTest.exam3.test;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;
import softwareTest.exam3.hotel.IData;
import softwareTest.exam3.hotel.InHotel;

import static org.junit.Assert.assertEquals;

public class InHotelTest {
    private Mockery context = new Mockery();
    private IData iData = null;
    private InHotel ih = null;

    @Before
    public void setUp()throws Exception{
        iData = context.mock(IData.class);
        ih = new InHotel(iData);
        context.checking(new Expectations(){{
            //入住成功
            oneOf(iData).in_Out_Room(701,"Jack");
            will(returnValue("Jack成功入住701房间"));
            //入住失败
            oneOf(iData).in_Out_Room(701,"Bob");
            will(returnValue("该房间已经有客人入住"));
            //退房成功
            oneOf(iData).in_Out_Room(701,"EMPTY");
            will(returnValue("退房成功"));
            //退房失败
            oneOf(iData).in_Out_Room(701,"EMPTY");
            will(returnValue("该房间没有客人入住，退房失败"));
        }});
    }

    @Test
    public void testOut(){
        assertEquals("Jack成功入住701房间",ih.in(701,"Jack"));
        assertEquals("该房间已经有客人入住",ih.in(701,"Bob"));
        assertEquals("退房成功",ih.in(701,"EMPTY"));
        assertEquals("该房间没有客人入住，退房失败",ih.in(701,"EMPTY"));
    }
}
