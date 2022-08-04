package new_innerclass;

//public class outer{
//    //静态内部类
//    public class static inner{
//
//    }
//}
class computer {
    public static String name = "石原里美";
    public static class mouse{
        private String name ;
        private int price;

        public mouse() {
        }

        public mouse(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void buy(){
            System.out.println(computer.name+"购买了"+this.name);
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

public class jing {
    public static void main(String[] args) {
        //外部类名.内部类名 对象名 = new 外部类名.内部类名();
        //outer.inner in = new outer.inner;
        computer.mouse m = new computer.mouse("雷蛇",300);
        m.buy();
    }
}
