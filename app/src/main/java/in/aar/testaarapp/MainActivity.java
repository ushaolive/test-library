package in.aar.testaarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import in.oliveboard.sdk.ui.ShowOliveBoard;
import in.oliveboard.sdk.ui.StartOliveBoard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView click = findViewById(R.id.click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartOliveBoard.init(MainActivity.this);
            }
        });
    }
}
