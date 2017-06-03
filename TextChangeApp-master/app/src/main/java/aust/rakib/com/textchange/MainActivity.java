package aust.rakib.com.textchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textview1);
        et=(EditText) findViewById(R.id.edittext1);

    }
    public void textChange(View view)
    {
        String s=et.getText().toString();
        tv.setText(s);
    }
}
