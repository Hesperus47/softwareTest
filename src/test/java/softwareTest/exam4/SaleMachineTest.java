package softwareTest.exam4;

import junit.framework.TestCase;

public class SaleMachineTest extends TestCase {

    public void testSale() {
        SaleMachine saleMachine = new SaleMachine();
        //零钱输入错误
        assertEquals("错误指令！",saleMachine.sale("Beer",3));
        assertEquals("错误指令！",saleMachine.sale("Orange",2));
        //零钱为 5 元
        assertEquals("错误指令！",saleMachine.sale("apple",5));
        assertEquals("请取走Orange",saleMachine.sale("Orange",5));
        assertEquals("请取走Beer",saleMachine.sale("Beer",5));
        //零钱为 10 元
        assertEquals("错误指令！",saleMachine.sale("apple",10));
        assertEquals("请取走Orange",saleMachine.sale("Orange",10));
        assertEquals("请取走Beer",saleMachine.sale("Beer",10));
        //消耗剩余的 饮料 和 零钱
        saleMachine.sale("Orange",10);
        saleMachine.sale("Beer",10);
        saleMachine.sale("Orange",10);
        saleMachine.sale("Beer",10);
        saleMachine.sale("Orange",10);
        saleMachine.sale("Beer",10);
        saleMachine.sale("Beer",5);
        //没有饮料的情况
        assertEquals("很抱歉，没有Orange",saleMachine.sale("Orange",5));
        assertEquals("很抱歉，没有Beer",saleMachine.sale("Beer",10));
    }
}