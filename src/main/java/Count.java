import java.util.Objects;

public class Count {

    private int instanceCount;
    private static int totalCount = 0;

    public Count() {
        this.instanceCount = 0;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Count.totalCount = totalCount;
    }

    public void incrementTotalCount() {
        totalCount += 1;
    }

    public void incrementInstanceCount() {
        this.instanceCount += 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return instanceCount == count.instanceCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(instanceCount);
    }

    @Override
    public String toString() {
        return "Count{" +
                "instanceCount=" + instanceCount +
                "totalCount=" + totalCount +
                '}';
    }
}
