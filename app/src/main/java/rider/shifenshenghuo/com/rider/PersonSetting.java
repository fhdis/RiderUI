package rider.shifenshenghuo.com.rider;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class PersonSetting extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView tv_shenhe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.person_setting);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        tv_shenhe = (TextView)findViewById(R.id.tv_shenhe);
        toolbar.setNavigationIcon(R.mipmap.ic_menu_left);
        tv_shenhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent();
                intent.setClass(PersonSetting.this, UploadIdentityCard.class);
                startActivity(intent);
            }
        });
    }
}
