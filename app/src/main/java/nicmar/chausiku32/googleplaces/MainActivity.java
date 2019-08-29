package nicmar.chausiku32.googleplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spGetPlaces;
    ListView lvGetPlaces;
    Button btnGetPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spGetPlaces = findViewById(R.id.spGetPlaces);
        lvGetPlaces = findViewById(R.id.lvGetPlaces);
        btnGetPlaces = findViewById(R.id.btnGetPlaces);

        btnGetPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void getPlaces(View v){


    }
}
