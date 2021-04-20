package notepad.app.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

import notepad.app.R;
import notepad.app.business.AccessNotes;
import notepad.app.objects.Note;
import notepad.app.presentation.adapters.NotesAdapter;
import notepad.app.presentation.interfaces.RecyclerEventListener;

public class NotesMenu extends AppCompatActivity {
    private List<Note> notes;
    private AccessNotes accessNotes;
    private NotesAdapter adapter;
    private RecyclerEventListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_menu);
        accessNotes= new AccessNotes();
        notes=accessNotes.getAllNotes();
        RecyclerView rv = findViewById(R.id.notesRV);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        // A Dev task for the future should be to develop a screen to display if teams is null.
        // Activate Layout manager and RecyclerView

        //I wrote something here
        rv.setLayoutManager(llm);
        setOnClickListener();
        adapter = new NotesAdapter(notes,listener);
        rv.setAdapter(adapter);


    }
    private void setOnClickListener() {
        listener = new RecyclerEventListener() {
            @Override
            public void onClick(int pos) {
                Intent myIntent = new Intent(NotesMenu.this,NoteEditor.class);
                myIntent.putExtra("noteID", notes.get(pos).getPostID());
                //  System.out.println("click");
                NotesMenu.this.startActivity(myIntent);
            }
        };
    }
}