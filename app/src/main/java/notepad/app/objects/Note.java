package notepad.app.objects;

import java.util.Date;

public class Note{
    private String title;
    private String userNote;
    private Date createdDate;
    private Date modifiedDate;

    public Note()
    {
       // createdDate.setTime();
        title="some title";
    }

    public String getTitle() {
        return title;
    }

    public String getCreatedDate()
    {
        return "";
    }
}
