import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CotTest {

    @Test
    void dump() {
        Cot cot = new Cot(new Value(45));
        cot.dump();
    }
}