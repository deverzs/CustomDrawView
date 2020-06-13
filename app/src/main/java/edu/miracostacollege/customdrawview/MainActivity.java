package edu.miracostacollege.customdrawview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button swapButton;
    private CustomBoxView customBoxView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swapButton = findViewById(R.id.swap_button);
        customBoxView = findViewById(R.id.custom_box);

        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customBoxView.swapColor();
            }
        });

    }
}
