package rtc.patcharee.unchittha.crosswordgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HowToActivity extends AppCompatActivity {

    //Explicit
    private TextView textView;
    private ImageView imageView;
    private static final String howtoSTRING = "เมื่อเข้าสู่หน้าเกมส์ จะปรากฎตารางมา 2 แถว ทั้งแนวตั้งและแนวนอน " +
            "เมื่อต้องการดูความหมายของแนวตั้งให้คลิกที่ปุ่ม word1 ความหมายของแนวนอนให้คลิกที่ปุ่ม word2 " +
            "เมื่อเข้าใจความหมายแล้วให้คลิกที่ช่องสี่เหลี่ยมที่กำหนดให้เพื่อคีย์ตัวอักษรภาษาอังกฤษที่แป้นพิมพ์ในโทรศัพท์ของเราลงไปในช่องว่าง " +
            "เมื่อกรอกครบทุกช่องแล้ว ให้คลิกที่ปุ่ม answer เพื่อทำการตรวจคำตอบ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);

        //Bind Widget
        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView2);

        //Show View
        textView.setText(howtoSTRING);

        //Image Controller
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.effect_btn_shut);

                mediaPlayer.start();

                startActivity(new Intent(HowToActivity.this, PlayActivity.class));

                finish();
            }
        });


    }   // Main Method

}   // Main Class
