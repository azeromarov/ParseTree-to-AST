import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogTest {

    @Test
    void dump() {
        Log log = new Log(new Sum(new Value(7), new Value(8)));
        log.dump();
    }
}