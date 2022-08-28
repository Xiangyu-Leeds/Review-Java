package generic;


public class Score2<T extends Number>{  //包括Number类及其子类
    String name;
    String id;
    T score;
    public Score2(String name,String id, T score){
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
