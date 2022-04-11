package softwareTest.exam4;

import org.junit.Test;

public class saleTest {
//    @Test
//    public void test(){
//
//    }
    @Test
    public void test() {
        SaleMachine saleMachine = new SaleMachine();
        System.out.println(saleMachine.sale("Orange",10));
        System.out.println(saleMachine.sale("Orange",10));
        System.out.println(saleMachine.sale("Orange",10));
        System.out.println(saleMachine.sale("Orange",5));
        System.out.println(saleMachine.sale("Orange",5));
        System.out.println(saleMachine.sale("Orange",5));
        System.out.println(saleMachine.sale("Beer",10));
        System.out.println(saleMachine.sale("Beer",10));
        System.out.println(saleMachine.sale("Beer",10));
        System.out.println(saleMachine.sale("Beer",10));
        System.out.println(saleMachine.sale("Beer",10));
        System.out.println(saleMachine.sale("Beer",5));

    }
}
