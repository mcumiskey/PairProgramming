package edu.ccm.rescuepets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
    }
    public void GoToWebpage(View view){
        Uri webpage = Uri.parse("https://www.aspca.org/pet-care");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void ReturnToMain(View view){
        Intent intent = new Intent(CatActivity.this, MainActivity.class);
        startActivity(intent);
    }
}