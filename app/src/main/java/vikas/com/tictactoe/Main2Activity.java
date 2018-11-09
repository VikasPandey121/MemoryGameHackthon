package vikas.com.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    int Red1 = 0, Black1 = 0, Green1 = 0, Orange1 = 0;
    int Blue1 = 0, Black2 = 0, Blue2 = 0, Red2 = 0, Orange2 = 0, Yellow1 = 0, Yellow2 = 0, Green2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Button red1, black1, green1, orange1, blue1, black2, blue2, red2, orange2, yellow1, yellow2, green2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        red1 = findViewById(R.id.red1);
        black1 = findViewById(R.id.black1);
        green1 = findViewById(R.id.green1);
        blue1 = findViewById(R.id.blue1);
        black2 = findViewById(R.id.black2);
        blue2 = findViewById(R.id.blue2);
        red2 = findViewById(R.id.red2);
        orange2 = findViewById(R.id.orange2);
        yellow1 = findViewById(R.id.yellow1);
        yellow2 = findViewById(R.id.yellow2);
        green2 = findViewById(R.id.green2);
        orange1 = findViewById(R.id.orange1);

//        red1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//           //     Red1 = Integer.parseInt("1".toString());
//                Red1 = 1;
//                red1.setBackgroundColor(Color.RED);
//                if (Red2 == 1 || Red2 == 1)
//                {
//
//                }
//                else {
//                    red1.setBackgroundColor(Color.WHITE);
//                }
//            }
//        });

        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Red1 = 1;
                red1.setBackgroundColor(Color.RED);
               // if (Red2 ==1 || Black1 ==1 || Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Blue2 == 1 ||Black2 == 1  || Red2 ==1 || Orange2 == 1 || Yellow1 == 1 || Yellow2 == 1)
               if (Red2 == 1){
                   Red1 =0;
                   Red2 =0;
                   red1.setVisibility(View.INVISIBLE);
                   red2.setVisibility(View.INVISIBLE);
               }
               else if ( Black1 ==1 || Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Blue2 == 1 ||Black2 == 1  || Green2 == 1 || Orange2 == 1 || Yellow1 == 1 || Yellow2 == 1  )
               {
                   Red1 =0;
                   Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                   startActivity(i2);
               }
            }
        });

        black1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Black1 = 1;
                black1.setBackgroundColor(Color.BLACK);
                if (Black2 == 1){
                    Black1 =0;
                    Black2 = 0;
                    black2.setVisibility(View.INVISIBLE);
                    black1.setVisibility(View.INVISIBLE);
                }
                else if (  Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Blue2 == 1 ||Black2 == 1  || Green2 == 1 || Orange2 == 1 || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Black1 =0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Green1 = 1;
                green1.setBackgroundColor(Color.GREEN);
                if (Green2 == 1){
                    Green1 =0;
                    Green2 = 0;
                    green1.setVisibility(View.INVISIBLE);
                    green2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 ||  Orange1 ==1 || Blue1 == 1 || Blue2 == 1 ||Black2 == 1  || Orange2 == 1 ||Green2 == 1 || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Green1 = 0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        orange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Orange1 = 1;
               // Orange2 = 0;
                orange1.setBackgroundColor(Color.GRAY);
                if (Orange2 == 1){
                    Orange1 = 0;
                    Orange2 =0;
                    orange1.setVisibility(View.INVISIBLE);
                    orange2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 ||  Blue1 == 1 || Blue2 == 1 ||Black2 == 1  || Orange2 == 1 || Green2 == 1 || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Orange1 =0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Blue1 = 1;
                blue1.setBackgroundColor(Color.BLUE);
                if (Blue2 == 1){
                    Blue1=0;
                    Black2=0;
                    blue1.setVisibility(View.INVISIBLE);
                    blue2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Black2 == 1  || Orange2 == 1 || Green2 == 1 || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Blue1=0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        black2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Black2 = 1;
                black2.setBackgroundColor(Color.BLACK);
                if (Black1 == 1){
                    Black2=0;
                    Black1=0;
                    black1.setVisibility(View.INVISIBLE);
                    black2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Blue2 == 1 || Green2 == 1 || Orange2 == 1 || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Black2=0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Blue2 = 1;
                blue2.setBackgroundColor(Color.BLUE);
                if (Blue1 == 1){
                    Blue1=0;
                    Blue2=0;
                    blue1.setVisibility(View.INVISIBLE);
                    blue2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Black2 == 1  || Orange2 == 1 || Green2 == 1 || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Blue2=0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Red2 = 1;
                red2.setBackgroundColor(Color.RED);
                if (Red1 == 1){
                    Red1=0;
                    Red2=0;
                    red1.setVisibility(View.INVISIBLE);
                    red2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Blue2 == 1 || Green2 == 1 || Black2 == 1  || Orange2 == 1 || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 )
                {
                    Red1=0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        orange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Orange2 = 1;
                orange2.setBackgroundColor(Color.GRAY);
                if (Orange1 == 1){
                    Orange2=0;
                    Orange1=0;
                    orange1.setVisibility(View.INVISIBLE);
                    orange2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Green2 == 1 || Blue2 == 1 ||Black2 == 1  || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Orange2=0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        yellow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Yellow1 = 1;
                yellow1.setBackgroundColor(Color.YELLOW);
                if (Yellow2 == 1){
                    Yellow1=0;
                    Yellow2=0;
                    yellow1.setVisibility(View.INVISIBLE);
                    yellow2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 || Orange1 ==1 || Green2 == 1 || Blue1 == 1 || Blue2 == 1 ||Black2 == 1  || Orange2 == 1 ||  Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Yellow1=0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        yellow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Yellow2 = 1;
                yellow2.setBackgroundColor(Color.YELLOW);
                if (Yellow1 == 1){
                    Yellow2=0;
                    Yellow1=0;
                    yellow1.setVisibility(View.INVISIBLE);
                    yellow2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 || Green2 == 1 || Orange1 ==1 || Blue1 == 1 || Blue2 == 1 ||Black2 == 1  || Orange2 == 1 || Yellow1 == 1 ||  Red1 ==1 || Red2 ==1)
                {
                    Yellow2=0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });

        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Green2 = 1;
                green2.setBackgroundColor(Color.GREEN);
                if (Green1 == 1){
                    Green1=0;
                    Green2=0;
                    green1.setVisibility(View.INVISIBLE);
                    green2.setVisibility(View.INVISIBLE);
                }
                else if ( Black1 ==1 || Green1 == 1 || Orange1 ==1 || Blue1 == 1 || Blue2 == 1 ||Black2 == 1  || Orange2 == 1 || Yellow1 == 1 || Yellow2 == 1 || Red1 ==1 || Red2 ==1)
                {
                    Green2=0;
                    Intent i2 = new Intent(Main2Activity.this , Main2Activity.class);
                    startActivity(i2);
                }
            }
        });







    }
}
