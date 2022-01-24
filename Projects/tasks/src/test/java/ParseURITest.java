import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URIParseTest {
    @Test
    void testURI() {
        URIParse expected = new URIParse("http", "www.ietf.org", "80", "/rfc/rfc2396.txt", "q=1&s1");
        URIParse actual = URIParse.parse("http://www.ietf.org:80/rfc/rfc2396.txt?q=1&s1");
        assertEquals(expected, actual);
    }
}