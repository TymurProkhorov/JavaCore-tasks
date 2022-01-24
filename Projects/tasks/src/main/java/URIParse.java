

//public class ParseURI7 {
//    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
//
//        URI exampleURI = new URI("https://www.google.com/search?q=java+%D0%BC%D0%B5%D1%82%D0%BE%D0%B4+%D0%BF%D0%B0%D1%80%D1%81%D0%B8%D1%82%D1%8C+URI&sxsrf=AOaemvLChp3UxJ-PPoUEA7ooazv6eLfYHg%3A1642431709098&ei=3YTlYaq1Bce0kwXUh5TwDw&ved=0ahUKEwjql9r0hrn1AhVH2qQKHdQDBf4Q4dUDCA4&uact=5&oq=java+%D0%BC%D0%B5%D1%82%D0%BE%D0%B4+%D0%BF%D0%B0%D1%80%D1%81%D0%B8%D1%82%D1%8C+URI&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeMggIIRAWEB0QHjIICCEQFhAdEB4yCAghEBYQHRAeMggIIRAWEB0QHjIICCEQFhAdEB46BwgAEEcQsAM6BQgAEIAEOgUILhCABDoKCAAQgAQQhwIQFDoGCAAQFhAeOgUIIRCgAUoECEEYAEoECEYYAFDBKFjkYmCEggFoBHACeACAAa4BiAGiEJIBBDAuMTeYAQCgAQHIAQjAAQE&sclient=gws-wiz");
//        System.out.println("Host is: " + exampleURI.getHost());
//        System.out.println("Authority is: " + exampleURI.getAuthority());
//        System.out.println("Port is: " + exampleURI.getPort());
//        System.out.println("Path is: " + exampleURI.getPath());
//        System.out.println("Query is: " + exampleURI.getQuery());
//    }
//}

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URIParse {

    private final String protocol;
    private final String host;
    private final String port;
    private final String path;
    private final String query;

    public URIParse(String protocol, String host, String port, String path, String query) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.query = query;
    }

    public static void main(String[] args) {
        String text = "http://www.ietf.org:80/rfc/rfc2396.txt?q=1&s1";
        URIParse result = parse(text);
        System.out.println(result);
    }

    static URIParse parse(String uri) {
        String protocol;
        String host;
        String port;
        String path;
        String query;

        String regexp = "^([^:/?#]+):";
        protocol = getMatcher(uri, regexp);

        regexp = "//([^/?#]*):";
        host = getMatcher(uri, regexp);

        regexp = ":(\\d+)";
        port = getMatcher(uri, regexp);

        regexp = ":.*:([^?#]*)";
        path = getMatcher(uri, regexp);
        if (port != null)
            path = path.substring(2);

        regexp = "\\?(.*)";
        query = getMatcher(uri, regexp);

        return new URIParse(protocol, host, port, path, query);
    }

    private static String getMatcher(String uri, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(uri);
        String match = null;
        if (matcher.find())
            match = matcher.group(1);
        return match;
    }

    @Override
    public String toString() {
        return "protocol -> " + protocol + System.lineSeparator() +
                "host -> " + host + System.lineSeparator() +
                "port -> " + port + System.lineSeparator() +
                "path -> " + path + System.lineSeparator() +
                "query -> " + query + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        URIParse uriParse = (URIParse) o;
        return Objects.equals(protocol, uriParse.protocol) && Objects.equals(host, uriParse.host) && Objects.equals(port, uriParse.port) && Objects.equals(path, uriParse.path) && Objects.equals(query, uriParse.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, host, port, path, query);
    }
}