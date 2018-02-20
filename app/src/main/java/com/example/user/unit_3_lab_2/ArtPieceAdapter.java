package com.example.user.unit_3_lab_2;




import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class ArtPieceAdapter extends RecyclerView.Adapter<ArtPieceAdapter.ViewHolder> {
    private List<ArtPiece> artPieces;

    public ArtPieceAdapter(List<ArtPiece> artPieces) {
        this.artPieces = artPieces;
    }

    // Inflates the row layout and returns a holder
    @Override
    public ArtPieceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View artPieceView = inflater.inflate(R.layout.row_layout, parent, false);

        return new ViewHolder(artPieceView);
    }

    // Populates data into the item through holder
    @Override
    public void onBindViewHolder(ArtPieceAdapter.ViewHolder holder, int position) {
        ArtPiece artPiece = artPieces.get(position);
        holder.nameTextView.setText(artPiece.getName());
        holder.artistTextView.setText(artPiece.getArtist());
        holder.yearTextView.setText(Integer.toString(artPiece.getYear()));
    }

    @Override
    public int getItemCount() {
        return artPieces.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Fields corresponding to the row layout elements
        public TextView nameTextView;
        public TextView artistTextView;
        public TextView yearTextView;
        public Button checkItOutButton;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            artistTextView = (TextView) itemView.findViewById(R.id.artistTextView);
            yearTextView = (TextView) itemView.findViewById(R.id.yearTextView);
           // checkItOutButton = (Button) itemView.findViewById(R.id.checkItOutButton);

        }
    }
}
