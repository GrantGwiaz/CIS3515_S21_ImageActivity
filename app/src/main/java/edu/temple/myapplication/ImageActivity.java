package edu.temple.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

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

        soupArray = new String[]{"Pleas select a Soup","Gazpacho", "French Onion Soup", "Chowder", "Tomato Soup"};
        descriptionArray = new String[]{"","a cold soup of raw blended vegetables", "a rich soup typically containing fish",
                                    "beef stock and onion base, covered with cheese and bread", "pretty much just tomatoes"};
        soupImagesArray = new int[]{R.drawable.gazpacho , R.drawable.frenchOnion , R.drawable.chowder , R.drawable.tomato};

        ImageAdapter adapter = new ImageAdapter(this, soupArray, descriptionArray, soupImagesArray);
        spinner.setAdapter(adapter);


        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(ImageActivity.this, "Soup Selected", Toast.LENGTH_SHORT).show();
                    showPicture(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    Toast.makeText(ImageActivity.this, "Item Unselected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void showPicture (int position) {
        if(position > 0) {
            imageView.setImageResource(soupImagesArray[position]);
        } else {
            imageView.setImageResource(android.R.color.transparent);
        }
    }
}