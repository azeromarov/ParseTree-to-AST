import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TanTest {

    @Test
    void dump() {
        Tan tan = new Tan(new Value(45));
        tan.dump();
    }
}