package generic;

public class Score<T>{  //将这个类转化为泛型类
    String name;
    String id;
    T score;
    public Score(String name,String id, T score){
        this.name=name;
        this.id=id;
        this.score=score;
    }
    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }
    public static <E> void test(E e){
        System.out.println(e);
    }
    public <E> void test2(E e){
        System.out.println(e);
    }
}
