package enumeration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("lyh",22);
        student.setStatus(Status.Sleep);
        System.out.println(student.getStatus().getName());
        System.out.println(Status.valueOf("Sleep"));
        // System.out.println(Status.values());
        for (Status value:
             Status.values()) {
            System.out.println(value);
        }
        Student student1 = new Student("ngg",18);
    }
}
