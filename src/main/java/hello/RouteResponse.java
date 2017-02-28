package hello;

public class RouteResponse {

    private final long id;
    private final String content;

    public RouteResponse(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
