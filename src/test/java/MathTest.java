import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * test_system
 * Created on 05.07.17.
 */
public class MathTest {
    @Test
    public void fib() throws Exception {
        assertThat(Math.fib(0)).isEqualTo(0);
        assertThat(Math.fib(1)).isEqualTo(1);
        assertThat(Math.fib(2)).isEqualTo(1);
        assertThat(Math.fib(3)).isEqualTo(2);
        assertThat(Math.fib(4)).isEqualTo(3);
    }

    @Test
    public void fact() throws Exception {
        assertThat(Math.fact(0)).isEqualTo(1);
        assertThat(Math.fact(1)).isEqualTo(1);
        assertThat(Math.fact(2)).isEqualTo(2);
        assertThat(Math.fact(3)).isEqualTo(6);
    }

}