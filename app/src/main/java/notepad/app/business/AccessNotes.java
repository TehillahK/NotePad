package notepad.app.business;

import java.util.List;

import notepad.app.application.Services;
import notepad.app.objects.Note;
import notepad.app.persistence.INotes;

public class AccessNotes {
    private INotes iNotes;
    private List<Note> notes;
    public AccessNotes()
    {
        iNotes= Services.getNotesPersistance();
    }
    public List<Note> getAllNotes()
    {
        notes=iNotes.getAllNotes();
        return notes;
    }
}
