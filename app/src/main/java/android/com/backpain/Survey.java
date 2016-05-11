package android.com.backpain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Survey extends AppCompatActivity {

    TextView surveyHeader;
    TextView surveySubHeader;
    TextView information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        surveyHeader = (TextView)findViewById(R.id.surveyHeader);
        surveySubHeader = (TextView)findViewById(R.id.surveySubHeader);
        information = (TextView)findViewById(R.id.informationTextView);

        surveyHeader.setText("Vastaa kyselyyn!");
        surveySubHeader.setText("Vastaamalla voit voittaa, ja lisäksi autat sovelluksen kehittämistä.");
        information.setText("Logos / contact details / link to online interface (kipuriihi.org)");
    }
}
