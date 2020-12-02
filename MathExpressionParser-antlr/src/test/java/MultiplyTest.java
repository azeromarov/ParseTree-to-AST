import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    void dump() {
        Multiply multiply = new Multiply(new Value(2f), new Value(3f));
        multiply.dump();
    }
}