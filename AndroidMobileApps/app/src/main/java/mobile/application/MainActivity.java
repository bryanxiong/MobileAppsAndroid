package mobile.application;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bLogin;
    ImageButton bFacebook;
    EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLogin = (Button) findViewById(R.id.btLogin);
        bFacebook = (ImageButton) findViewById(R.id.btFacebook);
        etEmail = (EditText) findViewById(R.id.Email);
        etPassword = (EditText) findViewById(R.id.Password);

        bLogin.setOnClickListener(this);
        bFacebook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.btLogin:
                break;
            case R.id.btFacebook:
                break;
        }
    }
}
