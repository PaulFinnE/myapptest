package local.example.myappy.myappspringboot;

public class Entity {
    private final long myId;
	private final String content;

    public Entity(long myId, String content) {
        this.myId = myId;
        this.content = content;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Entity: ");
        sb.append("myId=")			.append(myId)			.append(";");
        sb.append("content=")		.append(content)		.append(";");

        return sb.toString();
    }

    public long getMyId() {
        return myId;
    }

    public String getContent() {
        return content;
    }
}