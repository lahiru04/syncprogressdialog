package test.ceylonlinux.com.myalert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import library.ceylonlinux.com.syncprogressdialog.SyncProgDia;


public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SyncProgDia syncProgDia = new SyncProgDia(MainActivity.this);
                syncProgDia.setConfirmClickListener(new SyncProgDia.OnSweetClickListener() {
                    @Override
                    public void onClick(SyncProgDia syncProgDia) {
                        syncProgDia.dismissWithAnimation();
                    }
                });
                syncProgDia.show();

            }
        });
    }
}
