package vikas.com.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnfirst;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            btnfirst = findViewById(R.id.btnone);

            btnfirst.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i1 = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i1);
                }
            });
    }
}
