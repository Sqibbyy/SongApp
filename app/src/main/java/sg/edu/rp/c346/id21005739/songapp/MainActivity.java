package sg.edu.rp.c346.id21005739.songapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    RadioButton rdb1;
    RadioButton rdb2;
    RadioButton rdb3;
    RadioButton rdb4;
    RadioButton rdb5;
    ListView lv;
    ArrayList<Song> al;
    //ArrayAdapter<Song> aa;
    CustomAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        btn1 = findViewById(R.id.btnInsert);
        btn2 = findViewById(R.id.btnShow);
        btn3 = findViewById(R.id.btnStars);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        lv = findViewById(R.id.listViewList);

        al = new ArrayList<Song>();
        //aa = new ArrayAdapter<Song>(this,
        //android.R.layout.simple_list_item_1, al);
        adaptor = new CustomAdaptor(this, R.layout.row, al);
        lv.setAdapter(adaptor);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long identity) {
                Song data = al.get(position);
                Intent i = new Intent(MainActivity.this,
                        EmptyActivity.class);
                i.putExtra("data", data);
                startActivity(i);
            }
        });

    }
}