package generic;


    public class Score3<T>implements ScoreInterface<String>{  //包括Number类及其子类
        String name;
        String id;

        public Score3(String name,String id){
            this.name=name;
            this.id=id;


        }

        public static <E> void test(E e){
            System.out.println(e);
        }
        public <E> void test2(E e){
            System.out.println(e);
        }

        @Override
        public String getScore() {
            return null;
        }

        @Override
        public void setScore(String s) {

        }
    }
