package notepad.app.persistence.fakeDB;

import java.util.ArrayList;
import java.util.List;

import notepad.app.objects.Note;
import notepad.app.persistence.INotes;

public class NotesData implements INotes {
    private List<Note> notes;
    public NotesData()
    {
        notes = new ArrayList<>();
    }

    @Override
    public List<Note> getAllNotes() {
        return null;
    }
}
