package no.unit.marc;

import com.google.gson.annotations.SerializedName;

class AuthorReference {

    @SerializedName("name")
    private final String name;
    @SerializedName("date")
    private final String date;
    @SerializedName("id")
    private final String id;

    public AuthorReference(String name, String date, String id) {
        this.name = name;
        this.date = date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return id;
    }
}
