package model;

import model.listofsongs.Playlist;
import model.persistence.Writable;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

// Represents a list of playlists that the user may have, this user could have 0 playlist of 100.
public class ListOfPlaylists implements Writable {

    private static ListOfPlaylists lop;

    ArrayList<Playlist> allPlaylists;       // all the playlists of the user

    public static ListOfPlaylists getInstance() {
        if (lop == null) {
            lop = new ListOfPlaylists();
        }

        return lop;
    }

    // EFFECTS: creates a new ListOfPlaylists with an initially 0 playlists for the user.
    private ListOfPlaylists() {
        allPlaylists = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: adds new Playlist to the allPlaylists
    public void addNewPlaylist(Playlist playlist) {
        allPlaylists.add(playlist);
        EventLog.getInstance().logEvent(new Event("Created new playlist named: "
                + playlist.getPlaylistTitle()));
    }

    // MODIFIES: this
    // EFFECTS: check if there is a duplication of playlist titles in allPlaylists
    //              - if there is NO duplication then return  true, otherwise false
    //          else return false
    public boolean inAllPlaylist(String titleInput) {
        for (Playlist singlePlaylist:allPlaylists) {
            if (singlePlaylist.getPlaylistTitle().equals(titleInput)) {
                return true;
            }
        }
        return false;
    }

    // REQUIRES: 0 <= i < allPlaylist.size()
    // MODIFIES: this
    // EFFECTS: removes given index from currentPlaylists
    public void deletePlaylist(int i) {
        allPlaylists.remove(i);
    }

    public int getLength() {
        return allPlaylists.size();
    }

    // EFFECTS: returns a playlist by the index of a given integer
    public Playlist getPlaylistByIndex(int i) {
        return allPlaylists.get(i);
    }

    public ArrayList<Playlist> getAllPlaylists() {
        return allPlaylists;
    }

    //https://github.students.cs.ubc.ca/CPSC210/JsonSerializationDemo
    // EFFECTS: creates a JSON representation of a ListOfPlaylists
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("previousPlaylists", playlistToJson());
        return json;
    }

    //https://github.students.cs.ubc.ca/CPSC210/JsonSerializationDemo
    // EFFECTS: returns a JSONArray of the playlists of all elements in allPlaylists
    private JSONArray playlistToJson() {
        JSONArray jsonArray = new JSONArray();
        for (Playlist p:allPlaylists) {
            jsonArray.put(p.toJson());
        }
        return jsonArray;
    }
}