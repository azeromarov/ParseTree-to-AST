import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueTest {

    @Test
    void dump() {
        Value value = new Value(45);
        value.dump();
    }
}