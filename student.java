public class Student {
    private String name;
    private int prn;
    private String batch;

    public Student(String name, int prn, String batch) {
        this.name = name;
        this.prn = prn;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public int getPrn() {
        return prn;
    }

    public String getBatch() {
        return batch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", PRN: " + prn + ", Batch: " + batch;
    }
}
