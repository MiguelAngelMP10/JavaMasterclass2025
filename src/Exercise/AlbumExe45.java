package Exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlbumExe45 {
    private String name;
    private String artist;
    private ArrayList<SongExe45> songs;

    public AlbumExe45(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new SongExe45(title, duration));
            return true;
        }
        return false;
    }

    private SongExe45 findSong(String title) {
        for (SongExe45 song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<SongExe45> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index < songs.size()) {
            playList.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<SongExe45> playList) {
        SongExe45 song = findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }
}
