package ramizbek.aliyev.noteapp;

import androidx.cardview.widget.CardView;

import ramizbek.aliyev.noteapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);

    void onLongClick(Notes notes, CardView cardView);

}
