import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GitTest {

    @Test
    void gitCommit() {
        System.out.println("git commit one");
    }
    @Test
    void gitCommitTwo() {
        System.out.println("git commit two");
    }
    @Test
    void gitCommitTree() {
        System.out.println("git commit tree");
    }

    @Test
    void assertTrueTest(){
        assertTrue(3>2);
    }


}
