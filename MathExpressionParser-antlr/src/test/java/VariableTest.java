import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableTest {

    @Test
    void dump() {
        Variable variable = new Variable("x1");
        variable.dump();
    }
}