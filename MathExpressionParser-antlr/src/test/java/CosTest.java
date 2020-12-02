import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CosTest {

    @Test
    void dump() {
        Cos cos = new Cos(new Value(90f));
        cos.dump();
    }
}