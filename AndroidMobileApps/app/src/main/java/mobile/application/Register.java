package mobile.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener{

    Button bRegister;
    EditText etUsername, etEmail, etPassword, etConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        bRegister = (Button) findViewById(R.id.btRegister);
        etUsername = (EditText) findViewById(R.id.Username);
        etEmail = (EditText) findViewById(R.id.Email);
        etPassword = (EditText) findViewById(R.id.Password);
        etConfirmPassword = (EditText) findViewById(R.id.ConfirmPassword);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.Register:
                break;
        }
    }
}
