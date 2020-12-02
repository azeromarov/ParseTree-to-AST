import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParanthesisTest {

    @Test
    void dump() {
        Paranthesis paranthesis = new Paranthesis(new Sum(new Value(4f), new Value(5f)));
        paranthesis.dump();
    }
}