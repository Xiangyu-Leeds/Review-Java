package binary;

public class one {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println("4:" + Integer.toBinaryString(4)); //前面的0 都被省略，32位
        System.out.println("6:" + Integer.toBinaryString(6));
        System.out.println("4&6:" + Integer.toBinaryString(4&6));
        System.out.println("4|6:"+Integer.toBinaryString(4|6));
        System.out.println("~4:"+Integer.toBinaryString(~4));
        System.out.println("4^6:"+Integer.toBinaryString(4^6));
        System.out.println("4^4:"+Integer.toBinaryString(4^4));
        String s = "sss";
        s=s+"w";
        System.out.println(s.length());
//        p.charAt()
        StringBuilder e =new StringBuilder("swe");
        System.out.println("5:" + Integer.toBinaryString(5));

        System.out.println(5&1);

        System.out.println("-234567:"+Integer.toBinaryString(-234567));
        System.out.println("4>>1:"+Integer.toBinaryString(4>>1));
        System.out.println("-234567>>1:"+Integer.toBinaryString(-234567>>1));
        System.out.println(Integer.toBinaryString(-4));
        System.out.println("-4>>>4:"+Integer.toBinaryString(-4>>>4));
        System.out.println("-4>>4:"+Integer.toBinaryString(-4>>4));

        System.out.println("1:"+Integer.toBinaryString(1));
        System.out.println("1<<2:"+Integer.toBinaryString(1<<2));
        System.out.println("1>>2:"+Integer.toBinaryString(1>>2));

        System.out.println(4^6);
        System.out.println(2>>2);

        int a =10;
        int b =20;
        a=a^b;
        b=a^b; //b =(a^b)^b = a^(b^b) = a;
        a=a^b;
        System.out.println("a="+a+ " b="+b);



    }
}
