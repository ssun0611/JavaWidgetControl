package rlathfdl463.kr.hs.emirim.javawidgetcontrol;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1=(TextView) findViewById (R.id.text1);
        TextView text2=(TextView) findViewById (R.id.text2);
        TextView text3=(TextView) findViewById (R.id.text3);
        TextView text4=(TextView) findViewById (R.id.text4);

        text1.setText("김서연 턱드름.");
        text1.setTextSize(30);
        text1.setBackgroundColor(Color.rgb(255,0,255));
        text1.setTextColor(Color.WHITE);

        text2.setText(R.string.text2_str);
        text2.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);

        text3.setTextSize(40);
        text3.setText("김성철 미스터마우스 대박나라");
        text3.setTypeface(Typeface.DEFAULT_BOLD);

        text3.setText("응 성철이 해던이랑 결혼~");
        text4.setTextColor(Color.argb(200,0,0,255));
        text4.setTextSize(20);

    }
}
