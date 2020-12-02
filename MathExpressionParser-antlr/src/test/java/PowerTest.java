import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void dump() {
        Power power = new Power(new Value(2f), new Value(3f));
        power.dump();
    }
}