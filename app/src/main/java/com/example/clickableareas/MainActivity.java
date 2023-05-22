package com.example.clickableareas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView clickableImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectComponents();


    }

    private void connectComponents() {

        ImageView imageView = findViewById(R.id.ivClickableImage);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                int x = (int) event.getX();
                int y = (int) event.getY();

                if (action == MotionEvent.ACTION_UP) {
                    // Handle click event for specific areas
                    if (isInClickableArea(x, y)) {
                        // Do something when the area is clicked
                        // Example: launch an activity or show a dialog
                    }
                }
                return true;
            }
        });



    }
    private boolean isInClickableArea(int x, int y) {
        // Define the coordinates of your clickable areas
        Rect clickableArea = new Rect(left, top, right, bottom);
        return clickableArea.contains(x, y);
    }

}
