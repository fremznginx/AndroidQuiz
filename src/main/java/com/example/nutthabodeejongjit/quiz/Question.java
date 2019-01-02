package com.example.nutthabodeejongjit.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Question extends AppCompatActivity {
    TextView tvQuestion;
    Button button1,button2,button3,button4;
    ImageView btnSpeaker,imgQuestion;
    MediaPlayer mPlayer;
    int questionCont = 10;
    ArrayList<Integer> IDchoice = new ArrayList<>();
    String Answer;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        btnSpeaker = findViewById(R.id.btnSpeaker);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        imgQuestion = findViewById(R.id.imgQuestion);
        tvQuestion = findViewById(R.id.textView2);

        for (int i = 1; i <= questionCont; i++)
            IDchoice.add(i);
        Collections.shuffle(IDchoice);
        setQuestion(IDchoice.remove(0));
    }

    private void setQuestion(int IDchoice) {
        if (IDchoice == 1) {

            tvQuestion.setText("ตัวอะไรกินหญ้า ? ");
            Answer = "วัว";
            imgQuestion.setImageResource(R.drawable.cow);
            mPlayer = MediaPlayer.create(this, R.raw.cow);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("หมี");
            choice.add("วัว");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        } else if (IDchoice == 2) {
            tvQuestion.setText("ตัวอะไรกินน้ำผึ้ง ? ");
            Answer = "หมี";
            imgQuestion.setImageResource(R.drawable.bear);
            mPlayer = MediaPlayer.create(this, R.raw.bear);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("หมี");
            choice.add("วัว");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        } else if (IDchoice == 3) {
            tvQuestion.setText("ตัวอะไรบินได้ ? ");
            Answer = "นก";
            imgQuestion.setImageResource(R.drawable.brid);
            mPlayer = MediaPlayer.create(this, R.raw.birds);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("หมี");
            choice.add("วัว");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        } else if (IDchoice == 4) {
            tvQuestion.setText("สัตว์อะไรเป็นสัญลักษณ์ของไทย ? ");
            Answer = "ช้าง";
            imgQuestion.setImageResource(R.drawable.elephant);
            mPlayer = MediaPlayer.create(this, R.raw.elephant);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("หมี");
            choice.add("วัว");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        } else if (IDchoice == 5) {
            tvQuestion.setText("สัตว์อะไรกินเนื้อ ? ");
            Answer = "เสือ";
            imgQuestion.setImageResource(R.drawable.tiger);
            mPlayer = MediaPlayer.create(this, R.raw.tiger);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("หมี");
            choice.add("เสือ");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        } else if (IDchoice == 6) {
            tvQuestion.setText("สัตว์อะไรชอบเห่า ? ");
            Answer = "หมา";
            imgQuestion.setImageResource(R.drawable.dogg);
            mPlayer = MediaPlayer.create(this, R.raw.dog);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("หมา");
            choice.add("เสือ");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        } else if (IDchoice == 7) {
            tvQuestion.setText("สัตว์อะไรชอบกินปลาทู ? ");
            Answer = "แมว";
            imgQuestion.setImageResource(R.drawable.cat);
            mPlayer = MediaPlayer.create(this, R.raw.cat);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("หมี");
            choice.add("เสือ");
            choice.add("แมว");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        }else if (IDchoice == 8) {
            tvQuestion.setText("สัตว์อะไรอยู่บนต้นไม้ ? ");
            Answer = "ลิง";
            imgQuestion.setImageResource(R.drawable.monkey);
            mPlayer = MediaPlayer.create(this, R.raw.monkey);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("ลิง");
            choice.add("หมี");
            choice.add("เสือ");
            choice.add("แมว");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        }else if (IDchoice == 9) {
            tvQuestion.setText("สัตว์อะไรครึ่งบกครึ่งน้ำ ? ");
            Answer = "จระเข้";
            imgQuestion.setImageResource(R.drawable.crododile);
            mPlayer = MediaPlayer.create(this, R.raw.crocodile);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("หมี");
            choice.add("จระเข้");
            choice.add("แมว");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        }else if (IDchoice == 10) {
            tvQuestion.setText("สัตว์อะไรเป็นเจ้าป่า ? ");
            Answer = "สิงโต";
            imgQuestion.setImageResource(R.drawable.lionnn);
            mPlayer = MediaPlayer.create(this, R.raw.lion);
            ArrayList<String> choice = new ArrayList<>();
            choice.add("นก");
            choice.add("สิงโต");
            choice.add("เสือ");
            choice.add("แมว");
            Collections.shuffle(choice);
            button1.setText(choice.remove(0));
            button2.setText(choice.remove(0));
            button3.setText(choice.remove(0));
            button4.setText(choice.remove(0));
            mPlayer.start();
        }
    }

    public void choiceAns(View v){
        Button b = (Button) v;
        String buttonText = b.getText().toString();
        if (buttonText.equals(Answer)) {
            score++;
        }
        if (IDchoice.isEmpty()) {
            DialogBox();
        }else {
            setQuestion(IDchoice.remove(0));
        }
    }

    private void DialogBox() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("คะแนนสะสม");
        builder.setIcon(R.drawable.icon_win);
        builder.setMessage("คุณได้คะแนน " + score + " คะแนน ")
                .setCancelable(false)
                .setPositiveButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                .setNegativeButton("REPLAY",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = getIntent();
                                finish();
                                startActivity(intent);
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void Playsound(View v){
        mPlayer.start();
    }
}
