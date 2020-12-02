import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractTest {

    @Test
    void dump() {
        Subtract subtract = new Subtract(new Value(7f), new Value(5f));
        subtract.dump();
    }
}