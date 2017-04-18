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


public class Play4Activity extends AppCompatActivity {

    private Button btn3;
    EditText[] editV3 = new EditText[41];
    // สร้าง คำตอบของแต่ละช่อง
    String answer3[]={"r","i","n","g","c","n","e","m","a","w","t","e","r","m",
    "e","l","o","n","u","c","l","e","f","e","e","a","r","b","e","l","b","e","e",
    "a","r","i","n","g","c","o","r"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play4);


        btn3=(Button)findViewById(R.id.button6);
        editV3[0]=(EditText)findViewById(R.id.bt1);
        editV3[1]=(EditText)findViewById(R.id.bt2);
        editV3[2]=(EditText)findViewById(R.id.bt3);
        editV3[3]=(EditText)findViewById(R.id.bt4);
        editV3[4]=(EditText)findViewById(R.id.bt5);
        editV3[5]=(EditText)findViewById(R.id.bt6);
        editV3[6]=(EditText)findViewById(R.id.bt7);
        editV3[7]=(EditText)findViewById(R.id.bt8);
        editV3[8]=(EditText)findViewById(R.id.bt9);
        editV3[9]=(EditText)findViewById(R.id.bt10);
        editV3[10]=(EditText)findViewById(R.id.bt11);
        editV3[11]=(EditText)findViewById(R.id.bt12);
        editV3[12]=(EditText)findViewById(R.id.bt13);
        editV3[13]=(EditText)findViewById(R.id.bt14);
        editV3[14]=(EditText)findViewById(R.id.bt15);
        editV3[15]=(EditText)findViewById(R.id.bt16);
        editV3[16]=(EditText)findViewById(R.id.bt17);
        editV3[17]=(EditText)findViewById(R.id.bt18);
        editV3[18]=(EditText)findViewById(R.id.bt19);
        editV3[19]=(EditText)findViewById(R.id.bt20);
        editV3[20]=(EditText)findViewById(R.id.bt21);
        editV3[21]=(EditText)findViewById(R.id.bt22);
        editV3[22]=(EditText)findViewById(R.id.bt23);
        editV3[23]=(EditText)findViewById(R.id.bt24);
        editV3[24]=(EditText)findViewById(R.id.bt25);
        editV3[25]=(EditText)findViewById(R.id.bt26);
        editV3[26]=(EditText)findViewById(R.id.bt27);
        editV3[27]=(EditText)findViewById(R.id.bt28);
        editV3[28]=(EditText)findViewById(R.id.bt29);
        editV3[29]=(EditText)findViewById(R.id.bt30);
        editV3[30]=(EditText)findViewById(R.id.bt31);
        editV3[31]=(EditText)findViewById(R.id.bt32);
        editV3[32]=(EditText)findViewById(R.id.bt33);
        editV3[33]=(EditText)findViewById(R.id.bt34);
        editV3[34]=(EditText)findViewById(R.id.bt35);
        editV3[35]=(EditText)findViewById(R.id.bt36);
        editV3[36]=(EditText)findViewById(R.id.bt37);
        editV3[37]=(EditText)findViewById(R.id.bt38);
        editV3[38]=(EditText)findViewById(R.id.bt39);
        editV3[39]=(EditText)findViewById(R.id.bt40);
        editV3[40]=(EditText)findViewById(R.id.bt41);



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Symbol,ans;
                int trueAns=0;
                for(int i=0;i<answer3.length;i++) {
                    Symbol = editV3[i].getText().toString();
                    ans = answer3[i];
                    if (Symbol.equals(ans)) {   // ถ้าคำตอบตรง
                        editV3[i].setTextColor(Color.parseColor("#696969"));
                        editV3[i].setEnabled(false);
                        trueAns++;  // ถ้าถูกเก็บคะแนนไว้ตรวจสอบ
                        if(trueAns==41){ // ถ้าทำครบจะไปหน้าถัดไป
                            startActivity(new Intent(Play4Activity.this, Play5Activity.class));
                        }
                    }else{  // ถ้าคำตอบผิด
                        editV3[i].setText("");
                        editV3[i].setTextColor(Color.BLACK);
                    }
                }

            }
        });

    }



}






