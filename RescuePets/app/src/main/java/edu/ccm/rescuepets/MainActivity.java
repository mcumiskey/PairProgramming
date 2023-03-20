package edu.ccm.rescuepets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.List;
import java.util.ArrayList;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {

//    ArrayList<Pet> petList;
//    ListView listView;
//    private  static CustomViewAdapter adapter;
private RadioGroup mPetTypeRadioGroup;
private int mCheckedID;
private ConstraintLayout mDog;
private ConstraintLayout mCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPetTypeRadioGroup = findViewById(R.id.PetType_RadioGroup);
        mDog = findViewById(R.id.PetDogCard_ConstraintView);
        mCat = findViewById(R.id.PetCatCard_ConstraintView);


        int mCheckedID = mPetTypeRadioGroup.getCheckedRadioButtonId();
        if (mCheckedID == R.id.cats_radioButton){
            mDog.setVisibility(GONE);
            mCat.setVisibility(View.VISIBLE);
        }
        if (mCheckedID == R.id.dogs_radioButton){
            mCat.setVisibility(GONE);
            mDog.setVisibility(View.VISIBLE);
        }
        if (mCheckedID == R.id.both_radioButton){
            mCat.setVisibility(View.VISIBLE);
            mDog.setVisibility(View.VISIBLE);
        }
    }

    public void OpenPetDetail(View view){
        Intent intent = new Intent(MainActivity.this, PetDetail.class);
        startActivity(intent);
    }

    public void OpenDogDetail(View view){
        Intent intent = new Intent(MainActivity.this, DogActivity.class);
        startActivity(intent);
    }

    public void OpenCatDetail(View view){
        Intent intent = new Intent(MainActivity.this, CatActivity.class);
        startActivity(intent);
    }



    public void RadioButtonClicked(View view) {
        int mCheckedID = mPetTypeRadioGroup.getCheckedRadioButtonId();
        if (mCheckedID == R.id.cats_radioButton){
            mDog.setVisibility(GONE);
            mCat.setVisibility(View.VISIBLE);
        }
        if (mCheckedID == R.id.dogs_radioButton){
            mCat.setVisibility(GONE);
            mDog.setVisibility(View.VISIBLE);
        }
        if (mCheckedID == R.id.both_radioButton){
            mCat.setVisibility(View.VISIBLE);
            mDog.setVisibility(View.VISIBLE);
        }
    }
}