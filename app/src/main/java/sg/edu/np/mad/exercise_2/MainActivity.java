package sg.edu.np.mad.exercise_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class User {
        String name = "";
        String description = "";
        Integer id = 0;
        Boolean followed = false;
    }

    public void changeText(View button){
        Button followButton = (Button)findViewById(R.id.followButton);
        if (followButton.getText() == "Unfollow"){
            followButton.setText("Follow");
        } else {
            followButton.setText("Unfollow");
        }
    }


}