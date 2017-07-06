import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * test_system
 * Created on 06.07.17.
 */
public class MathTestImprove {
    @Test
    public void fib() throws Exception {
        assertThat(Math.fib(5)).isEqualTo(5);
        assertThat(Math.fib(6)).isEqualTo(8);
        assertThat(Math.fib(7)).isEqualTo(13);
        assertThat(Math.fib(8)).isEqualTo(21);
        assertThat(Math.fib(9)).isEqualTo(34);
    }

    @Test
    public void fact() throws Exception {
        assertThat(Math.fact(4)).isEqualTo(24);
        assertThat(Math.fact(5)).isEqualTo(120);
        assertThat(Math.fact(6)).isEqualTo(720);
        assertThat(Math.fact(7)).isEqualTo(5040);
    }

}
