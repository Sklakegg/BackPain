package android.com.backpain;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;

public class Criterion extends AppCompatActivity {

    TextView criterionHeader;
    TextView criterionSubHeader;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criterion);

        criterionHeader = (TextView)findViewById(R.id.criterionHeader);
        criterionSubHeader = (TextView)findViewById(R.id.criterionSubHeader);

        criterionHeader.setText("Selaa hoitokeinoja!");
        criterionSubHeader.setText("Määrittele mieleisin hoitokeinoja eri kriteerien perusteella");
    }
}
