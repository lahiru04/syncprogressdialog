package library.ceylonlinux.com.syncprogressdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

public class SyncProgDia extends Dialog {
    public SyncProgDia(@NonNull Context context) {
        super(context, R.style.alert_dialog);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_dialog);
    }

}
