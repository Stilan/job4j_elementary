package ru.job4j.collection;

import org.junit.Test;
import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.util.Comparator;

public class ComparatorTest {
    @Test
    public void  JobAscendingByNameTest(){
        Comparator<Job> cmpAscendingByName = new JobAscendingByName();
        int rsl = cmpAscendingByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void  JobAscendingByPriority(){
        Comparator<Job> cmpAscending = new JobAscendingByPriority();
        int rsl = cmpAscending.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void  JobDescByPriorityTest(){
        Comparator<Job> cmpJobDescByPriority = new JobDescByPriority();
        int rsl = cmpJobDescByPriority.compare(
                new Job("Impl task", 4),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void  JobDescByNameTest(){
        Comparator<Job> cmpJobDescByName = new JobDescByName();
        int rsl = cmpJobDescByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
        @Test
        public void whenCompatorByNameAndPrority() {
            Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
            int rsl = cmpNamePriority.compare(
                    new Job("Impl task", 0),
                    new Job("Fix bug", 1)
            );
            assertThat(rsl, lessThan(0));
        }
    @Test
    public void whenCompatorByNameAscendingAndProrityAscending() {
        Comparator<Job> cmpNamePriority = new JobAscendingByName().thenComparing(new JobAscendingByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

}
