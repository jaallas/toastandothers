package ph.edu.ust.jatallas.toastandothers;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toast = (Button) findViewById(R.id.button3);
        final Button snack = (Button) findViewById(R.id.button);
        Button snack2 = (Button) findViewById(R.id.button2);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "TOAST!";
                int duration = Toast.LENGTH_LONG;
                Toast.makeText(getApplicationContext(), "TOAST!", Toast.LENGTH_SHORT).show();
            }
        });

        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snackbar Message!!!!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });

        snack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snack bar Message!!!!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar2(view, message, duration);
            }
        });
    }
        public void showSnackbar (View view, String message, int duration){

        Snackbar.make(view, message, duration).show();

            }


        public void showSnackbar2 (View view, String message, int duration){
            final Snackbar snackbar = Snackbar.make(view,message,duration);
            snackbar.setAction("DISMISS", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    snackbar.dismiss();
                }
            });
            snackbar.show();

    }
}
