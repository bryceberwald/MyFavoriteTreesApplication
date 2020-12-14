package edu.bberwald0.myfavoritetreesapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.List;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";
    private List<NamedLocation> locations = DataInitializer.getData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout =
                findViewById(R.id.collapsing_toolbar);

        int position = getIntent().getIntExtra(EXTRA_POSITION, 0);
        NamedLocation namedLocation = locations.get(position);

        ImageView imageView = findViewById(R.id.details_image);
        imageView.setImageResource(namedLocation.getImageID());

        collapsingToolbarLayout.setTitle(namedLocation.getName());

        TextView description = findViewById(R.id.detail_description);
        description.setText(namedLocation.getDescription());

        TextView location = findViewById(R.id.detail_location);
        location.setText(namedLocation.getLocation());

        TextView inside = findViewById(R.id.detail_inside);
        inside.setText(namedLocation.getInside());

        TextView outside = findViewById(R.id.detail_outside);
        outside.setText(namedLocation.getOutside());

        TextView tallest = findViewById(R.id.detail_tallest);
        tallest.setText(namedLocation.getTallest());
    }
}
