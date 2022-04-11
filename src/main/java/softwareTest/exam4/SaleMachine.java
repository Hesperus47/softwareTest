package softwareTest.exam4;

public class SaleMachine {
    public int fiveNum, OrangeNum, BeerNum;
    public String[] type = {"Beer", "Orange"};
    private final String[] answer = {"很抱歉，没有", "请取走", "拿好5元，请取走", "没有零钱找，退你10元", "错误指令！"};
    public SaleMachine(){
        OrangeNum = 5;
        BeerNum = 5;
        fiveNum = 5;
    }
    public String sale(String drink, int money){
        String result = null;
        if (BeerNum < 1 && drink.equals(type[0]) || OrangeNum < 1 && drink.equals(type[1])){
            result = answer[0] + drink;
        }else if (money==5){
            fiveNum++;
            result = answer[1] + drink;
            if (drink.equals(type[0])){
                BeerNum--;
            }else if (drink.equals(type[1])){
                OrangeNum--;
            }else {
                result = answer[4];
            }
        }else if (money == 10){
            if (fiveNum < 1){
                result = answer[3];
            }else {
                fiveNum--;
                result = answer[1] + drink;
                if (drink.equals(type[0])){
                    BeerNum--;
                }else if (drink.equals(type[1])){
                    OrangeNum--;
                }else {
                    result = answer[4];
                }
            }
        }else {
            result = answer[4];
        }
        return result;
    }
}
