package Exercise;

public class SongExe45 {
    private final String title;
    private final double duration;

    public SongExe45(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
