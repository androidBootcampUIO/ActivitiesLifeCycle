package androidbootcamp.uio.activitieslifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printMethodNameOnToast("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        printMethodNameOnToast("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printMethodNameOnToast("onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        printMethodNameOnToast("onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        printMethodNameOnToast("onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        printMethodNameOnToast("onRestart");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        printMethodNameOnToast("onSaveInstanceState");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        printMethodNameOnToast("onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printMethodNameOnToast("onDestroy");

    }

    private void printMethodNameOnToast(String methodName) {
        Toast.makeText(this.getApplicationContext(),
                String.format("Método invocado: %s", methodName),
                Toast.LENGTH_LONG)
                .show();
    }
}
