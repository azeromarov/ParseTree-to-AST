import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void dump() {
        Divide divide = new Divide(new Value(4f), new Value(5f));
        divide.dump();
    }
}