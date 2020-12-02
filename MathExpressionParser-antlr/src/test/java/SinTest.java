import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinTest {

    @Test
    void dump() {
        Sin sin = new Sin(new Value(30));
        sin.dump();
    }
}