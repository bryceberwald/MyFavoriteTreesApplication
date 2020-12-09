package edu.bberwald0.myfavoritetreesapplication;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListFragment extends Fragment {
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
            image = itemView.findViewById(R.id.list_image);
            name = itemView.findViewById(R.id.list_name);
            description = itemView.findViewById(R.id.list_desc);
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
                    R.layout.list_item, parent, false);
            return new ContentViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {
            NamedLocation namedLocation = namedLocations.get(position);
            holder.name.setText(namedLocation.getName());
            holder.description.setText(namedLocation.getDescription());
            // holder.image.setImageResource(namedLocation.getImageID());
            holder.image.setImageBitmap(BitmapUtil.createCircleBitmap(
                    context, namedLocation.getImageID()));
        }

        @Override
        public int getItemCount() {
            return namedLocations.size();
        }

    }


}
