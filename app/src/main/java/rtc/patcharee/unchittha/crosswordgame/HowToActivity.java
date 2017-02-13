package rtc.patcharee.unchittha.crosswordgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HowToActivity extends AppCompatActivity {

    //Explicit
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);

        //Bind Widget
        imageView = (ImageView) findViewById(R.id.imageView2);

        //Image Controller
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.effect_btn_shut);

                mediaPlayer.start();

                startActivity(new Intent(HowToActivity.this, Play2Activity.class));

                finish();
            }
        });


    }   // Main Method

}   // Main Class
