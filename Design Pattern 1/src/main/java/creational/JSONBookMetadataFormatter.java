package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray bookslist;
    private JSONObject master;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        bookslist = new JSONArray();
        master = new JSONObject();
        master.put("Books", bookslist);
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject details = new JSONObject();
        JSONArray authors = new JSONArray();
        for (String author : b.getAuthors()) {
            authors.add(author);
        }
        details.put("ISBN", b.getISBN());
        details.put("Authors", authors);
        details.put("Title", b.getTitle());
        details.put("Publisher", b.getPublisher());
        bookslist.add(details);
        return this;
    }

    @Override
    public String getMetadataString() {
        return master.toJSONString();
    }
}
