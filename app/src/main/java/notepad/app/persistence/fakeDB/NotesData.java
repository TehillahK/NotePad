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
        for (int i = 0; i < 7; i++) {
            notes.add(i,new Note());
        }
    }

    @Override
    public List<Note> getAllNotes() {
        return notes;
    }
}
