package org.tensorflow.lite.examples.detection;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn_click_me = (Button)findViewById(R.id.buttondetect);

        btn_click_me.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               openDetectorActivity();
            }
        });
    }

    public  void openDetectorActivity(){
        Intent intent = new Intent(this, DetectorActivity.class );
         startActivity(intent);
    }
}