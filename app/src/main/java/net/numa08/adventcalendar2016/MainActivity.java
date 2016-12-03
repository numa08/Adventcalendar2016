package net.numa08.adventcalendar2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String message;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = "not clicked";
        textView = (TextView) findViewById(R.id.text);
        updateMessage();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = "clicked";
                updateMessage();
            }
        });
    }

    void updateMessage() {
        textView.setText(message);
    }
}
