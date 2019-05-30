package tuhmawbi.jobportal_ymt.activities;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import tuhmawbi.jobportal_ymt.R;
import tuhmawbi.jobportal_ymt.fragments.FavouriteFragment;
import tuhmawbi.jobportal_ymt.fragments.NewFeedFragment;
import tuhmawbi.jobportal_ymt.fragments.NotificationFragment;

public class HomeActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }



}


