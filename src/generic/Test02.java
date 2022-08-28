package generic;

public class Test02 {
    public static void main(String[] args) {
        Score<?> score1= new Score<String>("数据结构","w2134","优秀"); //使用通配符,用的比较少
        String o = (String) score1.score;

        Score2<? super Number> score2 = new Score2<>("数据结构","w2134",100); //Number及其子类
        Object number = score2.getScore();
        System.out.println(score2.getScore());

        Score2<? super Number> score3= new Score2<>("数据结构","w2134",98);//Integer及其父类

    }
}
