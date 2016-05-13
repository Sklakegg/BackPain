package android.com.backpain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    TextView motivational;
    TextView information;
    ImageView akatemia;
    ImageView ubicomp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_start);

        motivational = (TextView)findViewById(R.id.motivation);
        information = (TextView)findViewById(R.id.informationTextView);
        akatemia = (ImageView)findViewById(R.id.imageView);
        ubicomp = (ImageView)findViewById(R.id.imageView2);

        motivational.setText(
                  "•    This is a motivational text box \n"
                + "•    It also explains why this app exists \n"
                + "•    ..and where the data originates from \n"
                + "•    ..and how the user can help herself \n"
                + "•    ..and science! (redirect to web interface, at least initially)");

        information.setText("Logos / contact details / link to online interface (kipuriihi.org)");
        akatemia.setImageResource(R.mipmap.ic_akatemia);
        ubicomp.setImageResource(R.drawable.ic_ubicmp);
    }

    public void onStartClick(View V) {
        Intent i = new Intent(getApplicationContext(), Criterion.class);
        startActivity(i);
    }
}
