package tuhmawbi.jobportal_ymt.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import tuhmawbi.jobportal_ymt.R;
import tuhmawbi.jobportal_ymt.VOs.JobNewsVO;
import tuhmawbi.jobportal_ymt.activities.JobDetailsActivity;
import tuhmawbi.jobportal_ymt.viewholders.JobListViewHolder;

public class NewFeedFragment extends Fragment {

    RecyclerView newFeed;
    RecyclerView.LayoutManager layoutManager;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference jRef;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_new_feed, container, false);
        firebaseDatabase = FirebaseDatabase.getInstance();
        jRef = firebaseDatabase.getReference("JobData");

        newFeed = v.findViewById(R.id.rvNewFeed);
        layoutManager = new LinearLayoutManager(getActivity());
        newFeed.setLayoutManager(layoutManager);
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<JobNewsVO, JobListViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<JobNewsVO, JobListViewHolder>(
                        JobNewsVO.class,
                        R.layout.view_holder_job_list,
                        JobListViewHolder.class,
                        jRef
                ) {
                    @RequiresApi(api = Build.VERSION_CODES.M)
                    @Override
                    protected void populateViewHolder(JobListViewHolder viewHolder, JobNewsVO model, int position) {
                        viewHolder.setData(getContext(), model.getId(), model.getTitle());
                    }

                    @Override
                    public JobListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                        JobListViewHolder jobListViewHolder = super.onCreateViewHolder(parent, viewType);
                        jobListViewHolder.setmClickListener(new JobListViewHolder.ClickListener() {

                            @Override
                            public void onItemClick(View view, int position, String key) {
                                Intent intent = new Intent(view.getContext(), JobDetailsActivity.class);
                                startActivity(intent);
                            }
                        });
                        return jobListViewHolder;
                    }
                };
        newFeed.setAdapter(firebaseRecyclerAdapter);
    }
}
