package tuhmawbi.jobportal_ymt.activities;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.IOException;

import tuhmawbi.jobportal_ymt.R;

public class PostJobActivity extends AppCompatActivity {

    Spinner categorySpinner, typeSpinner;
    TextInputEditText jobTitle, companyName, location, contactNo, webLink, jobDescription, salary, benefits, opportunities;
    ImageView jobImage;
    Button post;
    Uri filePath;
    Bitmap bitmap;
    int PICK_IMAGE_REQUEST = 111;

    StorageReference storageReference;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_job);

        storageReference = FirebaseStorage.getInstance().getReference("Company_Logo");
        databaseReference = FirebaseDatabase.getInstance().getReference("JobData");

        categorySpinner = findViewById(R.id.spinner_job_category);
        typeSpinner = findViewById(R.id.spinner_job_type);
        jobImage = findViewById(R.id.ivPostJobImage);
        jobTitle = findViewById(R.id.etPostJobTitle);
        companyName = findViewById(R.id.etPostCompanyName);
        location = findViewById(R.id.etPostLocation);
        contactNo = findViewById(R.id.etPostContactNo);
        webLink = findViewById(R.id.etPostWebLink);
        jobDescription = findViewById(R.id.etPostJobDescription);
        salary = findViewById(R.id.etPostSalary);
        benefits = findViewById(R.id.etPostBenefits);
        opportunities = findViewById(R.id.etPostOpportunities);
        post = findViewById(R.id.btnPostJob);

        final String[] categories = new String[]{
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

        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this, R.layout.spinner_item, categories
        );
        ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<String>(
                this, R.layout.spinner_item, types
        );
        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_item);
        categorySpinner.setAdapter(spinnerArrayAdapter);

        spinnerArrayAdapter1.setDropDownViewResource(R.layout.spinner_item);
        typeSpinner.setAdapter(spinnerArrayAdapter1);


        jobImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Company Logo"), PICK_IMAGE_REQUEST);
            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST) {
            if (data != null) {
                filePath = data.getData();
                try {
                    bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), filePath);
                    Toast.makeText(PostJobActivity.this, "Image Saved!", Toast.LENGTH_SHORT).show();
                    jobImage.setImageBitmap(bitmap);

                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(PostJobActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
