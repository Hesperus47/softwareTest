package softwareTest.exam3.test;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;
import softwareTest.exam3.hotel.IData;
import softwareTest.exam3.hotel.MainRun;

import static org.junit.Assert.assertEquals;

public class MainRunTest {
    private Mockery context = new Mockery();
    private IData iData = null;
    private MainRun mr = null;
    @Before
    public void setUp()throws Exception{
        iData = context.mock(IData.class);
        mr = new MainRun(iData);
        context.checking(new Expectations(){{
            oneOf(iData).iniRooms();
            //入住成功
            oneOf(iData).command("in", 701, "Jack");
            will(returnValue("Jack成功入住701房间"));
            //入住失败
            oneOf(iData).command("in",701,"Bob");
            will(returnValue("该房间已经有客人入住"));
            //in-房间号出错
            oneOf(iData).command("in", 99, "Jack");
            will(returnValue("房间号错误"));

            //退房成功
            oneOf(iData).command("out", 701,"EMPTY");
            will(returnValue("退房成功"));
            //退房失败
            oneOf(iData).command("out", 701,"EMPTY");
            will(returnValue("该房间没有客人入住，退房失败"));
            //out-房间号出错
            oneOf(iData).command("out", 99, "EMPTY");
            will(returnValue("房间号错误"));

            //命令错误
            oneOf(iData).command("abcd", 99, "EMPTY");
            will(returnValue("命令输入错误！"));
        }});
    }

    @Test
    public void testOut(){
        assertEquals("Jack成功入住701房间",mr.command("in", 701, "Jack"));
        assertEquals("该房间已经有客人入住",mr.command("in",701,"Bob"));
        assertEquals("房间号错误",mr.command("in", 99, "Jack"));
        assertEquals("退房成功",mr.command("out", 701, "EMPTY"));
        assertEquals("该房间没有客人入住，退房失败",mr.command("out", 701, "EMPTY"));
        assertEquals("房间号错误",mr.command("out", 99, "EMPTY"));
        assertEquals("命令输入错误！",mr.command("abcd", 701, "EMPTY"));
    }
}
