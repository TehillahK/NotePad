package notepad.app.presentation.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import notepad.app.R;
import notepad.app.objects.Note;
import notepad.app.presentation.interfaces.RecyclerEventListener;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {
    private List<Note> notes;
    private RecyclerEventListener listener;
    public NotesAdapter(List<Note> notes,RecyclerEventListener listener)
    {
        this.notes=notes;
        this.listener=listener;

    }
    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_card, parent, false);
        return new NotesAdapter.NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        Note currNote= notes.get(position);
        holder.title.setText(currNote.getTitle());
        holder.dateCreated.setText(currNote.getCreatedDate());

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class NotesViewHolder extends RecyclerView.ViewHolder implements RecyclerEventListener {
        TextView title;
        TextView dateCreated;
        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.notesTitle);
            dateCreated = itemView.findViewById(R.id.dateCreated);
        }

        @Override
        public void onClick(int pos) {
            listener.onClick(getAdapterPosition());
            System.out.println("cick");
        }
    }
}
