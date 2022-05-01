package sg.edu.np.mad.exercise_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.lang.UProperty;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    class User {
        String name = "";
        String description = "";
        Integer id = 0;
        Boolean followed = false;

        public User(String n, String d, Integer idc, Boolean f){
            name = n;
            description = d;
            id = idc;
            followed = f;
        }
    }

    private String Tag = "Main Activity";
    final String[] words = {"Unfollow", "Follow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User initUser = new User(words[1],words[0] + " state", 0,false);

        Button followButton = (Button)findViewById(R.id.followButton);
        followButton.setText(initUser.name);

        Button messageButton = (Button)findViewById(R.id.messageButton);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (initUser.followed == true ){
                    initUser.followed = false;
                    followButton.setText(words[1]);
                    Log.v(Tag, "Status change to Follow.");
                } else {
                    initUser.followed = true;
                    followButton.setText(words[0]);
                    Log.v(Tag, "Status change to Unfollow.");
                }
            }
        });
//        public void changeText(View button){
//            if (initUser.followed == false ){
//                initUser.followed = true;
//                followButton.setText("Follow");
//            } else {
//                initUser.followed = true;
//                followButton.setText("Unfollow");
//            }
//        }
    }




}