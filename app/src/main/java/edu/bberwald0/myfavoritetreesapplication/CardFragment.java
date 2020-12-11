package edu.bberwald0.myfavoritetreesapplication;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class CardFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.recycler_view,
                container, false);
        ContentAdapter adapter =
                new ContentAdapter(recyclerView.getContext(), DataInitializer.getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return recyclerView;

    }


    public static class ContentViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView name, description;

        public ContentViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.card_image);
            name = itemView.findViewById(R.id.card_name);
            description = itemView.findViewById(R.id.card_desc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });

            Button mapButton = itemView.findViewById(R.id.card_map_button);
            ImageButton likeButton = itemView.findViewById(R.id.card_like_button);
            ImageButton shareButton = itemView.findViewById(R.id.card_share_button);
            mapButton.setOnClickListener(new CardOnClickListener());
            likeButton.setOnClickListener(new CardOnClickListener());
            shareButton.setOnClickListener(new CardOnClickListener());
        }
    }

    private static class CardOnClickListener implements View.OnClickListener {
        String msg = "";

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.card_map_button)
                msg = "You selected the map button.";
            else if (view.getId() == R.id.card_like_button)
                msg = "You selected the like button.";
            else if (view.getId() == R.id.card_share_button)
                msg = "You selected the share button.";

            Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
        }
    }

    public static class ContentAdapter extends  RecyclerView.Adapter<ContentViewHolder> {
        List<NamedLocation> namedLocations;
        Context context;

        public ContentAdapter(Context context, List<NamedLocation> namedLocations) {
            this.context = context;
            this.namedLocations = namedLocations;
        }


        @NonNull
        @Override
        public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.item_card, parent, false);
            return new ContentViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {
            NamedLocation namedLocation = namedLocations.get(position);
            holder.name.setText(namedLocation.getName());
            holder.description.setText(namedLocation.getDescription());
            holder.image.setImageResource(namedLocation.getImageID());
        }

        @Override
        public int getItemCount() {
            return namedLocations.size();
        }

    }


}
