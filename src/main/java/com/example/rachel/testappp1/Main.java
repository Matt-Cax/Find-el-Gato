package com.example.rachel.testappp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Main extends AppCompatActivity {
  @Override
        protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

      Button button = (Button) findViewById(R.id.button2);
      button.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
              startActivity(new Intent (Main.this, Game.class));

          }
      });

      button = (Button) findViewById(R.id.button);
      button.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
              startActivity(new Intent(Main.this, Main2.class));

          }
      });

  }

}

