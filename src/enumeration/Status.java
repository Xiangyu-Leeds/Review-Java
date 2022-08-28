package enumeration;

public enum Status {
    Running("睡觉") ,Study("学习"),Sleep("睡觉"); //直接写每个状态的名字即可，分号可以不打，但是推荐打上
    private final String name; //枚举类只能private
    Status(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
