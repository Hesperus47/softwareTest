package softwareTest.work5;

public class Ball {
    private static int x[] = new int[10];
    public Ball(){}
    public void set(int a[]){
        for (int i = 0;i<a.length;i++){
            x[i] = a[i];
        }
    }

    public String Search(){
        if(x[0]+x[1]+x[2]+x[3]+x[4] < x[5]+x[6]+x[7]+x[8]+x[9]){
            if(x[1]+x[2]==x[3]+x[4]){
                return "1号是假球";
            }
            if(x[1]+x[2]<x[3]+x[4]){
                if(x[1]<x[2]){
                    return "2号是假球";
                }else {
                    return "3号是假球";
                }
            }else{
                if (x[3]<x[4]){
                    return "4号是假球";
                }else {
                    return "5号是假球";
                }
            }
        }else {
            if(x[6]+x[7]==x[8]+x[9]){
                return "6号是假球";
            }
            if(x[6]+x[7]<x[8]+x[9]){
                if(x[6]<x[7]){
                    return "7号是假球";
                }else {
                    return "8号是假球";
                }
            }else {
                if(x[8]<x[9]){
                    return "9号是假球";
                }else {
                    return "10号是假球";
                }
            }
        }
    }

    public static void main(String[] args) {
        Ball b = new Ball();
        int[] a0 ={5,10,10,10,10,10,10,10,10,10};
        int[] a1 ={10,5,10,10,10,10,10,10,10,10};
        int[] a2 ={10,10,5,10,10,10,10,10,10,10};
        int[] a3 ={10,10,10,5,10,10,10,10,10,10};
        int[] a4 ={10,10,10,10,5,10,10,10,10,10};
        int[] a5 ={10,10,10,10,10,5,10,10,10,10};
        int[] a6 ={10,10,10,10,10,10,5,10,10,10};
        int[] a7 ={10,10,10,10,10,10,10,5,10,10};
        int[] a8 ={10,10,10,10,10,10,10,10,5,10};
        int[] a9 ={10,10,10,10,10,10,10,10,10,5};
        b.set(a0);
        System.out.println(b.Search());
        b.set(a1);
        System.out.println(b.Search());
        b.set(a2);
        System.out.println(b.Search());
        b.set(a3);
        System.out.println(b.Search());
        b.set(a4);
        System.out.println(b.Search());
        b.set(a5);
        System.out.println(b.Search());
        b.set(a6);
        System.out.println(b.Search());
        b.set(a7);
        System.out.println(b.Search());
        b.set(a8);
        System.out.println(b.Search());
        b.set(a9);
        System.out.println(b.Search());

    }
}
