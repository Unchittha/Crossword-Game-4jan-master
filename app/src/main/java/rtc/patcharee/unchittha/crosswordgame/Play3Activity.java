package rtc.patcharee.unchittha.crosswordgame;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//ประกาศตัวแปรเก็บคำตอบ


public class Play3Activity extends AppCompatActivity {

    private Button btn2;
    EditText[] editV2 = new EditText[41];
    // สร้าง คำตอบของแต่ละช่อง
    String answer2[]={"s","u","g","a","r","t","b","l","e","w","h","a","l","b"
    ,"k","e","r","y","t","l","e","p","h","o","n","e","i","n","k","e","c","k"
    ,"c","a","r","h","i","r","u","l","r"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3);


        btn2=(Button)findViewById(R.id.button5);
        editV2[0]=(EditText)findViewById(R.id.bt51);
        editV2[1]=(EditText)findViewById(R.id.bt52);
        editV2[2]=(EditText)findViewById(R.id.bt53);
        editV2[3]=(EditText)findViewById(R.id.bt54);
        editV2[4]=(EditText)findViewById(R.id.bt55);
        editV2[5]=(EditText)findViewById(R.id.bt56);
        editV2[6]=(EditText)findViewById(R.id.bt57);
        editV2[7]=(EditText)findViewById(R.id.bt58);
        editV2[8]=(EditText)findViewById(R.id.bt59);
        editV2[9]=(EditText)findViewById(R.id.bt60);
        editV2[10]=(EditText)findViewById(R.id.bt61);
        editV2[11]=(EditText)findViewById(R.id.bt62);
        editV2[12]=(EditText)findViewById(R.id.bt63);
        editV2[13]=(EditText)findViewById(R.id.bt64);
        editV2[14]=(EditText)findViewById(R.id.bt65);
        editV2[15]=(EditText)findViewById(R.id.bt66);
        editV2[16]=(EditText)findViewById(R.id.bt67);
        editV2[17]=(EditText)findViewById(R.id.bt68);
        editV2[18]=(EditText)findViewById(R.id.bt69);
        editV2[19]=(EditText)findViewById(R.id.bt70);
        editV2[20]=(EditText)findViewById(R.id.bt71);
        editV2[21]=(EditText)findViewById(R.id.bt72);
        editV2[22]=(EditText)findViewById(R.id.bt73);
        editV2[23]=(EditText)findViewById(R.id.bt74);
        editV2[24]=(EditText)findViewById(R.id.bt75);
        editV2[25]=(EditText)findViewById(R.id.bt76);
        editV2[26]=(EditText)findViewById(R.id.bt77);
        editV2[27]=(EditText)findViewById(R.id.bt78);
        editV2[28]=(EditText)findViewById(R.id.bt79);
        editV2[29]=(EditText)findViewById(R.id.bt80);
        editV2[30]=(EditText)findViewById(R.id.bt81);
        editV2[31]=(EditText)findViewById(R.id.bt82);
        editV2[32]=(EditText)findViewById(R.id.bt83);
        editV2[33]=(EditText)findViewById(R.id.bt84);
        editV2[34]=(EditText)findViewById(R.id.bt85);
        editV2[35]=(EditText)findViewById(R.id.bt86);
        editV2[36]=(EditText)findViewById(R.id.bt87);
        editV2[37]=(EditText)findViewById(R.id.bt88);
        editV2[38]=(EditText)findViewById(R.id.bt89);
        editV2[39]=(EditText)findViewById(R.id.bt90);
        editV2[40]=(EditText)findViewById(R.id.bt91);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Symbol,ans;
                int trueAns=0;
                for(int i=0;i<answer2.length;i++) {
                    Symbol = editV2[i].getText().toString();
                    ans = answer2[i];
                    if (Symbol.equals(ans)) {   // ถ้าคำตอบตรง
                        editV2[i].setTextColor(Color.parseColor("#696969"));
                        editV2[i].setEnabled(false);
                        trueAns++;  // ถ้าถูกเก็บคะแนนไว้ตรวจสอบ
                        if(trueAns==41){ // ถ้าทำครบจะไปหน้าถัดไป
                            startActivity(new Intent(Play3Activity.this, Play4Activity.class));
                        }
                    }else{  // ถ้าคำตอบผิด
                        editV2[i].setText("");
                        editV2[i].setTextColor(Color.BLACK);
                    }
                }

            }
        });

    }



}






