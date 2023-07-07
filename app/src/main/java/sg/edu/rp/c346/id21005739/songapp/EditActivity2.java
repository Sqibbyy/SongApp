package sg.edu.rp.c346.id21005739.songapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class EditActivity2 extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    Button btn4;
    Button btn5;
    Button btn6;
    RadioButton rdb1;
    RadioButton rdb2;
    RadioButton rdb3;
    RadioButton rdb4;
    RadioButton rdb5;
    Song data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit2);

        //initialize the variables with UI here
        tv1 = findViewById(R.id.tvSong);
        et1 = findViewById(R.id.etSong);
        tv2 = findViewById(R.id.tvSinger);
        et2 = findViewById(R.id.etSinger);
        tv3 = findViewById(R.id.tvYear);
        et3 = findViewById(R.id.etYear);
        tv4 = findViewById(R.id.tvStars);
        rdb1 = findViewById(R.id.rb1);
        rdb2 = findViewById(R.id.rb2);
        rdb3 = findViewById(R.id.rb3);
        rdb4 = findViewById(R.id.rb4);
        rdb5 = findViewById(R.id.rb5);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        Intent i = getIntent();
        data = (Song) i.getSerializableExtra("data");

        tv1.setText("ID: " + data.getId());
        et1.setText(data.getId());

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbh = new DBHelper(EditActivity2.this);
                //data.getId(et1.getText().toString());
                //dbh.updateSong(data);
                dbh.close();
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbh = new DBHelper(EditActivity2.this);
                //dbh.deleteSong(data.getId());
                dbh.close();
                finish();

            }
        });


    }
}