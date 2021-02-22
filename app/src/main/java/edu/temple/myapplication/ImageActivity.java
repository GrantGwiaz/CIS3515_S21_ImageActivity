package edu.temple.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;

public class ImageActivity extends AppCompatActivity {

    ImageView imageView;
    Spinner spinner;


    int[] soupImagesArray;
    String[] soupArray;
    String[] descriptionArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);

        soupArray = new String[]{"","Gazpacho", "French Onion Soup", "Chowder", "Tomato Soup"};
        descriptionArray = new String[]{"","a cold soup of raw blended vegetables", "a rich soup typically containing fish",
                                    "beef stock and onion base, covered with cheese and bread", "pretty much just tomatoes"};
        soupImagesArray = new int[]{R.drawable.gazpacho , R.drawable.frenchOnion , R.drawable.chowder , R.drawable.tomato};

        //spinner.setAdapter();
    }

    private void showPicture (int position) {
        imageView.setImageResource(soupImagesArray[position]);
    }
}