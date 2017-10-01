package mumayank.dialogeeproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import mumayank.dialogee.Dialogee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Dialogee.Builder(MainActivity.this, "Display message?")
                        .setDescription("This is some description")
                        .setIcon(R.drawable.ic_action_name)
                        .setCancellable(true)
                        .setPositiveButton("positive", new Dialogee.PositiveButton() {
                            @Override
                            public void action() {
                                Toast.makeText(MainActivity.this, "positive", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("negative", new Dialogee.NegativeButton() {
                            @Override
                            public void action() {
                                Toast.makeText(MainActivity.this, "negative", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("neutral", new Dialogee.NeutralButton() {
                            @Override
                            public void action() {
                                Toast.makeText(MainActivity.this, "neutral", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .build()
                        .show();

            }
        });

    }

}
