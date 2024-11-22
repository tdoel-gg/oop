package L6.model;

import java.util.Objects;

public class Group implements Comparable<Group> {
    private int group;
    private int subgroup;
    private String starosta;

    public Group(int group, int subgroup, String starosta) {
        this.group = group;
        this.subgroup = subgroup;
        this.starosta = starosta;
    }

    public int getGroup() {
        return group;
    }

    public int getSubgroup() {
        return subgroup;
    }

    public String getStarosta() {
        return starosta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group1 = (Group) o;
        return group == group1.group && subgroup == group1.subgroup && Objects.equals(starosta, group1.starosta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, subgroup, starosta);
    }

    @Override
    public int compareTo(Group o) {
        return this.group - o.group;
    }
}
