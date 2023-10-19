import com.algorithms.Algo;
import org.junit.Assert;
import org.junit.Test;

public class AlgoTest {
    private final Algo algo = new Algo();
    @Test
    public void numJewelsInStonesSolutionOne() {
        Assert.assertEquals(3, algo.numJewelsInStones("aA", "aAAbbbb"));
    }
    @Test
    public void numJewelsInStonesSolutionTwo() {
        Assert.assertEquals(0, algo.numJewelsInStones("z", "ZZ"));
    }
    @Test
    public void numIdenticalPairsSolutionOne() {
        int[] numbers = new int[]{1,2,3,1,1,3};
        Assert.assertEquals(4, algo.numIdenticalPairs(numbers));
    }
    @Test
    public void numIdenticalPairsSolutionTwo() {
        int[] numbers = new int[]{1,1,1,1};
        Assert.assertEquals(6, algo.numIdenticalPairs(numbers));
    }
    @Test
    public void numIdenticalPairsSolutionThree() {
        int[] numbers = new int[]{1,2,3};
        Assert.assertEquals(0, algo.numIdenticalPairs(numbers));
    }
    @Test
    public void maxNumberOfBalloonsSolutionOne() {
        Assert.assertEquals(1, algo.maxNumberOfBalloons("nlaebolko"));
    }
    @Test
    public void maxNumberOfBalloonsSolutionTwo() {
        Assert.assertEquals(2, algo.maxNumberOfBalloons("loonbalxballpoon"));
    }
    @Test
    public void maxNumberOfBalloonsSolutionThree() {
        Assert.assertEquals(0, algo.maxNumberOfBalloons("leetcode"));
    }
}
