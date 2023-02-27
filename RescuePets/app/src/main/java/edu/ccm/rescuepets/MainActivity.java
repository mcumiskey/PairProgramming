package edu.ccm.rescuepets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout petList;

    Pet [] currentPets = {
            new Pet("Wallace", true, true, 2, 0.3f),
            new Pet("Henry", false, false, 6, 0.9f)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        petList = findViewById(R.id.Pets_LinearLayout);

//        for (Pet p: currentPets) {
//            View petview = getLayoutInflater().inflate(R.layout.pet_card, null, false);
//
//            petList.addView(petview);
//        }

    }
}