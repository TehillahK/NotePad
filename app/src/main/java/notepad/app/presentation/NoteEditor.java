package notepad.app.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import java.util.List;

import notepad.app.R;
import notepad.app.business.AccessNotes;
import notepad.app.objects.Note;

public class NoteEditor extends AppCompatActivity {
    private AccessNotes accessNotes;
    private EditText notepadTxt;
    private Note note;
    private List<Note> notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);
        accessNotes= new AccessNotes();
      //  notes = accessNotes.getAllNotes();
        String noteID;
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            noteID=extras.getString("noteID");
            note = accessNotes.getNote(noteID);
            setNote();
        }


    }
    private void setNote()
    {
        notepadTxt=findViewById(R.id.notepad);
        String note1= note.getUserNote();
        notepadTxt.setText(note1);

    }
}