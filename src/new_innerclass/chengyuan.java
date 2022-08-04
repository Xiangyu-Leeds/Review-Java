package new_innerclass;


////格式
//public class outer{
//    public class inner{
//    }
//}

//相较于静态内部类，成员内部类，不仅可以访问外部类的静态成员变量，同时也可以访问外部类的实例成员，
// 原因在于内部类的实例对象是在外部类创建之后而创建的，其可以直接调用之前所创建对象的实例成员。
public class chengyuan {
    //外部类名.内部类名 对象名 = new 外部构造器.new内部构造器();
    //outer.inner in = new outer().new inner();
    public static void main(String[] args) {
        //main方法
        computer1.mouse m = new computer1().new mouse();
        m.setName("雷蛇");
        m.buy();
        //输出结果：
        //石原里美购买了雷蛇
    }
}
class computer1 {
    public static String name1 = "石原里美";
    private String name2 ;
    public  class mouse{
        private String name ;
        private int price;
        public void buy(){
            System.out.println(computer1.name1+"购买了"+this.name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}


