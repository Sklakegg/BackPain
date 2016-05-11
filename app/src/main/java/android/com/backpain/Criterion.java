package android.com.backpain;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;

public class Criterion extends AppCompatActivity {

    TextView criterionHeader;
    TextView criterionSubHeader;
    TextView information;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criterion);

        criterionHeader = (TextView)findViewById(R.id.criterionHeader);
        criterionSubHeader = (TextView)findViewById(R.id.criterionSubHeader);
        information = (TextView)findViewById(R.id.informationTextView);

        criterionHeader.setText("Selaa hoitokeinoja!");
        criterionSubHeader.setText("Määrittele mieleisin hoitokeinoja eri kriteerien perusteella");
        information.setText("Logos / contact details / link to online interface (kipuriihi.org)");
    }

    public void onSurveyClick(View V) {
        Intent i = new Intent(getApplicationContext(), Survey.class);
        startActivity(i);
    }
}
