/*
    This class work as login screen of the app and also splash screen.
 */

package lk.teachmeit.gallery;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Login_screen extends AppCompatActivity {

    RelativeLayout rellay1, rellay2;
    TextView credit;
    Button login;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
            credit.setVisibility(View.GONE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        rellay1 = findViewById(R.id.rellay1);
        rellay2 = findViewById(R.id.rellay2);
        credit = findViewById(R.id.credits);
        login = findViewById(R.id.signup_log_btn);

        handler.postDelayed(runnable, 5000);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login_screen.this, SignUp_Screen.class);
                startActivity(i);
            }
        });

    }
}
