public class Person {
    private String name;
    private int age;
    private Job job ;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = new Job(job);
    }

    @Override
    public String toString() {
        return "|toSting|  Person{" +
                "name='" + name + '\'' +
                ", age=" + age + job.toString()+
                '}';
    }
}
