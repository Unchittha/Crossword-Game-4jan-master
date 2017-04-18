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


public class Play2Activity extends AppCompatActivity {

    private Button btn1;
    EditText[] editV1 = new EditText[43];
    // สร้าง คำตอบของแต่ละช่อง
    String answer1[]={"a","r","m","o","u","t","h","f","a","h","e","r","b","d","r","o",
    "o","m","p","i","d","a","r","b","b","y","i","n","t","e","r","s","a","i","l","b","a","r"
    ,"b","e","d","e","e"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2);


        btn1=(Button)findViewById(R.id.button4);
        editV1[0]=(EditText)findViewById(R.id.v1edit1);
        editV1[1]=(EditText)findViewById(R.id.v1edit2);
        editV1[2]=(EditText)findViewById(R.id.v1edit3);
        editV1[3]=(EditText)findViewById(R.id.editText11);
        editV1[4]=(EditText)findViewById(R.id.editText12);
        editV1[5]=(EditText)findViewById(R.id.editText13);
        editV1[6]=(EditText)findViewById(R.id.editText14);
        editV1[7]=(EditText)findViewById(R.id.editText16);
        editV1[8]=(EditText)findViewById(R.id.editText15);
        editV1[9]=(EditText)findViewById(R.id.editText17);
        editV1[10]=(EditText)findViewById(R.id.editText18);
        editV1[11]=(EditText)findViewById(R.id.editText19);
        editV1[12]=(EditText)findViewById(R.id.editText20);
        editV1[13]=(EditText)findViewById(R.id.editText21);
        editV1[14]=(EditText)findViewById(R.id.editText22);
        editV1[15]=(EditText)findViewById(R.id.editText24);
        editV1[16]=(EditText)findViewById(R.id.editText25);
        editV1[17]=(EditText)findViewById(R.id.editText26);
        editV1[18]=(EditText)findViewById(R.id.editText23);
        editV1[19]=(EditText)findViewById(R.id.editText27);
        editV1[20]=(EditText)findViewById(R.id.editText28);
        editV1[21]=(EditText)findViewById(R.id.editText29);
        editV1[22]=(EditText)findViewById(R.id.editText30);
        editV1[23]=(EditText)findViewById(R.id.editText31);
        editV1[24]=(EditText)findViewById(R.id.editText32);
        editV1[25]=(EditText)findViewById(R.id.editText33);
        editV1[26]=(EditText)findViewById(R.id.editText34);
        editV1[27]=(EditText)findViewById(R.id.editText35);
        editV1[28]=(EditText)findViewById(R.id.editText36);
        editV1[29]=(EditText)findViewById(R.id.editText37);
        editV1[30]=(EditText)findViewById(R.id.editText38);
        editV1[31]=(EditText)findViewById(R.id.editText39);
        editV1[32]=(EditText)findViewById(R.id.editText40);
        editV1[33]=(EditText)findViewById(R.id.editText41);
        editV1[34]=(EditText)findViewById(R.id.editText42);
        editV1[35]=(EditText)findViewById(R.id.editText43);
        editV1[36]=(EditText)findViewById(R.id.editText44);
        editV1[37]=(EditText)findViewById(R.id.editText45);
        editV1[38]=(EditText)findViewById(R.id.editText46);
        editV1[39]=(EditText)findViewById(R.id.editText47);
        editV1[40]=(EditText)findViewById(R.id.editText48);
        editV1[41]=(EditText)findViewById(R.id.editText49);
        editV1[42]=(EditText)findViewById(R.id.editText50);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Symbol,ans;
                int trueAns=0;
                for(int i=0;i<answer1.length;i++) {
                    Symbol = editV1[i].getText().toString();
                    ans = answer1[i];
                    if (Symbol.equals(ans)) {   // ถ้าคำตอบตรง
                       // editV1[i].setText("d");
                        editV1[i].setTextColor(Color.parseColor("#696969"));
                       // editV1[i].setBackgroundColor(Color.GRAY);
                        //editV1[i].setHeight(20);
                        //editV1[i].setWidth(10);
                        editV1[i].setEnabled(false);
                        trueAns++;  // ถ้าถูกเก็บคะแนนไว้ตรวจสอบ
                        if(trueAns==43){ // ถ้าทำครบจะไปหน้าถัดไป
                            startActivity(new Intent(Play2Activity.this, Play3Activity.class));
                        }
                    }else{  // ถ้าคำตอบผิด
                        editV1[i].setText("");
                        editV1[i].setTextColor(Color.BLACK);
                       // editV1[i].setBackgroundColor(Color.parseColor("#FFFFFF"));
                    }
                }

                //editT1.setText("a");
            }
        });

    }



}






