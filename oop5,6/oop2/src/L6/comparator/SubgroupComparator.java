package L6.comparator;

import L6.model.Group;

import java.util.Comparator;

public class SubgroupComparator implements Comparator<Group> {
    @Override
    public int compare(Group o1, Group o2) {
        return o1.getSubgroup() - o2.getSubgroup();
    }
}
