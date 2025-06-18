package display;

public class Display {
    private int value = 0;
    private int limit = 0;
    private static int step = 1;  /*类变量*/

    /** 构造函数*/
    public Display(int limit){
        this.limit = limit;
    }

    public void increase(){
        value++;
        if(value == limit)
            value = 0;
    }

    public int getValue(){
        return value;
    }

    /** 类函数*/
    public static void f(){

    }
    public static void main(String[] args){
//        Display d = new Display(24);
//        for(;;){
//            d.increase();
//            System.out.println(d.getValue());
//        }
        Display d1 = new Display(10);
        Display d2 = new Display(20);
        d1.increase();
        System.out.println(d1.getValue());
        System.out.println(d2.getValue());
        System.out.println(d1.step);
        System.out.println(d2.step);
        d1.step = 2;
        System.out.println(d1.step);
        System.out.println(d2.step);
        f();
    }

}
