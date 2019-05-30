package tuhmawbi.jobportal_ymt.viewholders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


import tuhmawbi.jobportal_ymt.R;
import tuhmawbi.jobportal_ymt.VOs.JobNewsVO;

public class JobListViewHolder extends RecyclerView.ViewHolder {

    View view;
    String Key;
    private JobListViewHolder.ClickListener mClickListener;

    public JobListViewHolder(View itemView) {
        super(itemView);
        view = itemView;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClickListener.onItemClick(view, getAdapterPosition(), Key);
            }
        });
    }

    public interface ClickListener {
        void onItemClick(View view, int position, String key);
    }

    public void setData(Context context, String id, String Title) {
        TextView title = view.findViewById(R.id.tvTitle);

        title.setText(Title);
    }

    public void setmClickListener(JobListViewHolder.ClickListener clickListener) {
        mClickListener = clickListener;
    }

}
