package model.persistence;

import org.json.JSONObject;

// https://github.students.cs.ubc.ca/CPSC210/JsonSerializationDemo
// Represents a class that is writable into JSON
public interface Writable {
    // EFFECTS: returns this as JSON object
    JSONObject toJson();
}