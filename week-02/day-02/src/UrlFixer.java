public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        url = url.substring(0, 5) + ":" + url.substring(5, url.length() - 1);

        System.out.println(url);
    }
}
