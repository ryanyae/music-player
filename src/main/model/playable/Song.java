package model.playable;

import model.Artist;
import model.listofsongs.Album;

import java.util.ArrayList;

// Represents a song made by an artist
public class Song extends Playable {
    private Album album;

    //EFFECTS: constructs a new song object with given title, maker, filePath and which album the song belongs to.
    public Song(Artist maker, String title, String filePath, Album album) {
        this.artist = maker;
        this.title = title;
        this.filePath = filePath;
        this.album = album;
        featuredArtists = new ArrayList<>();
    }

    // EFFECTS: returns album that this song belongs to
    public Album getAlbum() {
        return album;
    }
}
