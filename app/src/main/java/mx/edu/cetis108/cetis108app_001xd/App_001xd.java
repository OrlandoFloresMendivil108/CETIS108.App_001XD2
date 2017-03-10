package mx.edu.cetis108.cetis108app_001xd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class App_001xd extends AppCompatActivity {


    EditText et1;
    Button bt1;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_001xd);

        et1 = (EditText) findViewById(R.id.et1);
        bt1 = (Button) findViewById(R.id.bt1);
        txt = (TextView) findViewById(R.id.txt1);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                String resultado = et1.getText().toString();
                txt.setText("Que tal " + resultado);
            }


        }
    }
}