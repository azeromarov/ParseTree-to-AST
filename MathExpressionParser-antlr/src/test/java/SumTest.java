import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void dump() {
        Sum sum = new Sum(new Value(5f),new Value(9f));
        sum.dump();
    }
}