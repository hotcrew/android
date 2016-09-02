package io.hotcrew.hotcrew;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;
    private int animationDuration = 4000;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.activity_splash);
        logo = (ImageView) findViewById(R.id.logo);

        logo.setVisibility(View.GONE);
        logo.setAlpha(0f);
        logo.setVisibility(View.VISIBLE);
        logo.animate()
                .alpha(1f)
                .setDuration(animationDuration);
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        logo.setVisibility(View.GONE);
        logo.setAlpha(0f);
        logo.setVisibility(View.VISIBLE);
        logo.animate()
                .alpha(1f)
                .setDuration(animationDuration);
    }

    private void fadeView() {

    }
}
