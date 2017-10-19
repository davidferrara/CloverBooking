package seniorproject.cloverbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.viewEntriesButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.createEntryButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.editEntriesButton).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.viewEntriesButton:
                    startActivity(new Intent(getApplicationContext(), ViewActivity.class));
                    break;
                case R.id.createEntryButton:
                    startActivity(new Intent(getApplicationContext(), CreateActivity.class));
                    break;
                case R.id.editEntriesButton:
                    startActivity(new Intent(getApplicationContext(), EditActivity.class));
                    break;
            }
        }
    };
}
