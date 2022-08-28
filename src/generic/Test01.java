package generic;

public class Test01 {
    public static void main(String[] args) {
        Score<String> score1= new Score<String>("数据结构","w2134","优秀");
        Score score2= new Score("数据结构","w2135",100);

       String i =score1.getScore();
       Score.test("lyh is sb");
       Score.test(123);
       score1.test2(1234);
       score1.test2("nuo gg jb da");
    }
}
