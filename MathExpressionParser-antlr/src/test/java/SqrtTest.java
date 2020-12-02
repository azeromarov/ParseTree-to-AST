import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void dump() {
        Sqrt sqrt = new Sqrt(new Sum(new Power(new Value(4),new Value(5)),new Value(78)));
        sqrt.dump();
    }
}