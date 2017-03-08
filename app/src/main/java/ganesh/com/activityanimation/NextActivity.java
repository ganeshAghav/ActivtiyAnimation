package ganesh.com.activityanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Button previousActivity = (Button) findViewById(R.id.previousActivity);
        previousActivity.setOnClickListener(NextActivity.this);
    }
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.previousActivity:
                finish();
                //push from top to bottom
                overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);
                //slide from left to right
                //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

               //left to right -right to left
               // overridePendingTransition(R.anim.slide_out_left, R.anim.slide_out_right);

                //drower
                //overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);

                //new
                //overridePendingTransition(R.anim.slide_in_left, R.anim.push_down_out);
                break;

            // More buttons go here (if any) ...

        }
    }


}