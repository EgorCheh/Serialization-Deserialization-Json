public class Job {
    private String jobName;

    public Job(String name) {
        this.jobName = name;
    }

    @Override
    public String toString() {
        return ", Job='" + jobName+"'" ;
    }
}
