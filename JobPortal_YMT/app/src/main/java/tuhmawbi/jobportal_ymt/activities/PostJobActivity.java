package tuhmawbi.jobportal_ymt.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import tuhmawbi.jobportal_ymt.R;

public class PostJobActivity extends AppCompatActivity {

    Spinner spinner1,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_job);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        spinner1 = findViewById(R.id.spinner_job_category);
        spinner2 = findViewById(R.id.spinner_job_type);

        String[] categories = new String[]{
                "Accounting & Finance",
                "Admin, Secretary & PA",
                "Architecture & Design",
                "Automobile, Aviation & Aerospace",
                "Banking & Insurance"
        };

        String[] types = new String[]{
                "Part Time",
                "Full Time",
                "Freelancer",
                "Volunteer",
                "Fresh Graduate"
        };

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this, R.layout.spinner_project_category, categories
        );
        ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<String>(
                this,R.layout.spinner_project_category, types
        );
        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_project_category);
        spinner1.setAdapter(spinnerArrayAdapter);

        spinnerArrayAdapter1.setDropDownViewResource(R.layout.spinner_project_category);
        spinner2.setAdapter(spinnerArrayAdapter1);

    }
}
