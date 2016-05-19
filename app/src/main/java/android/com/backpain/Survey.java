package android.com.backpain;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class Survey extends AppCompatActivity {

    TextView surveyHeader;
    TextView surveySubHeader;
    SeekBar lol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        surveyHeader = (TextView)findViewById(R.id.surveyHeader);
        surveySubHeader = (TextView)findViewById(R.id.surveySubHeader);
        lol = (SeekBar)findViewById(R.id.seekBar5);

        surveyHeader.setText("Vastaa kyselyyn!");
        surveySubHeader.setText("Vastaamalla voit voittaa, ja lisäksi autat sovelluksen kehittämistä.");
        lol.setScaleY(3f);
        //lol.setScaleX(1f);
    }
}
