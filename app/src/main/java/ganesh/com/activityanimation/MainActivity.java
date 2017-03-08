package ganesh.com.activityanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button nextActivity = (Button) findViewById(R.id.nextActivity);
        nextActivity.setOnClickListener(this);
    }
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.nextActivity:
                Intent nextActivity = new Intent(this,NextActivity.class);
                startActivity(nextActivity);
                //push from bottom to top
                overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
                //slide from right to left
                //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                //left to right -right to left
               // overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_right);

                //drower
               // overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);

                //new
                //overridePendingTransition(R.anim.push_down_in, R.anim.slide_in_right);

                break;

            // More buttons go here (if any) ...

        }
    }
}