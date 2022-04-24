package creation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.coderslab.tdd.creation.tdd.creation.StringUtil;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    private StringUtil stringUtil;

    @BeforeEach
    void setUp() {
        stringUtil = new StringUtil();
    }

    @Test
    void reverse() {
        String result = stringUtil.reverse("Niedziela");
        assertEquals("aleizdeiN", result);
    }
}