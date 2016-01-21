package projects.artshx.htle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_Login extends AppCompatActivity implements View.OnClickListener
{
    Button btn_ActLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);
        btn_ActLogin = (Button) findViewById(R.id.btn_ActMain);
        btn_ActLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(view == btn_ActLogin)
        {
            Intent it = new Intent(this, Act_Main.class);
            startActivity(it);
        }
    }
}
