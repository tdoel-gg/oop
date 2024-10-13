package L1;

public class Group {
    private final int group;
    private final int subgroup;

    public Group(int number, int subgroup) {
        this.group = number;
        this.subgroup = subgroup;
    }

    public int getGroup() {
        return group;
    }

    public int getSubgroup() {
        return subgroup;
    }
}
