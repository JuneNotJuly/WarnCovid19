package com.example.test4;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mtextView2;
    private Button mbuttonY;
    private Button mbuttonN;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextView2 = (TextView)findViewById(R.id.textView2);
        mbuttonY = (Button)findViewById(R.id.buttonY);
        mbuttonN = (Button)findViewById(R.id.buttonN);

        updateQuestion();

        mbuttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mbuttonY.getText() == mAnswer) {
                    mScore = mScore + 1;
                    //updateScore(mScore);
                    updateQuestion();
                }
                }
            });

        mbuttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mbuttonN.getText() != mAnswer) {
                    mScore = mScore + 0;
                     //updateScore(mScore);
                     updateQuestion();
                }
            }
        });
    }


private void updateQuestion(){
        mtextView2.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mbuttonY.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mbuttonN.setText(mQuestionLibrary.getChoice2(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
        }

//    private void updateScore(int point){
//        mScoreView
//    }

        }
