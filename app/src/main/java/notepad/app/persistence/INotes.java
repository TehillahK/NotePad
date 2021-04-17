package notepad.app.persistence;

import java.util.List;

import notepad.app.objects.Note;

public interface INotes {
    public List<Note> getAllNotes();
}
