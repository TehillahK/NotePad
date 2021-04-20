package notepad.app.objects;

import java.util.Date;

public class Note{
    private String postID;
    private String title;
    private String userNote;
    private Date createdDate;
    private Date modifiedDate;

    public Note()
    {
       // createdDate.setTime();
        title="some title";
        postID="nl";
        userNote="lol";
    }

    public String getPostID() {
        return postID;
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedDate()
    {
        return "";
    }

    public String getUserNote() {
        return userNote;
    }
}
