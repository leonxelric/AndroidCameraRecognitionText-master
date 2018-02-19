package dev.edmt.androidcamerarecognitiontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.location.places.*;
import android.view.View;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        DisplayActivity runner = new DisplayActivity();
        runner.setVals();
    }

    MainActivity ma = new MainActivity();
    String name = ma.getName();

    public void setVals() {
        TextView t1 = (TextView)findViewById(R.id.textView5);
        TextView t2 = (TextView)findViewById(R.id.textView6);
        TextView t3 = (TextView)findViewById(R.id.textView7);
        TextView t4 = (TextView)findViewById(R.id.textView8);
        TextView t5 = (TextView)findViewById(R.id.textView9);

        FakePlace place = new FakePlace(name);

        t1.setText("Name: " + place.getName());
        t2.setText("Phone number:" + place.getNum());
        t3.setText("Price: " + place.getPrice());
        t4.setText("Rating: " + place.getRate());
        t5.setText("Address: " + place.getAddress());
    }
}
