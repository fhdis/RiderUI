package rider.shifenshenghuo.com.rider;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class LoginMain extends AppCompatActivity {
    private Button button_zhuce;
    private Button button_forgetpassword;
    private Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);
        button_zhuce = (Button)findViewById(R.id.button_zhuce);
        button_forgetpassword = (Button)findViewById(R.id.button_forgetpassword);
        login_button = (Button)findViewById(R.id.login_button);

        button_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(LoginMain.this, Registered.class);
                startActivity(intent);
            }
        });

        button_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(LoginMain.this, ForgetPassword.class);
                startActivity(intent);
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(LoginMain.this, Homepage.class);
                startActivity(intent);
            }
        });
    }
}
