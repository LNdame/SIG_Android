package ansteph.com.sigandroid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import ansteph.com.sigandroid.R;
import ansteph.com.sigandroid.model.NavDrawerItem;

/**
 * Created by loicStephan on 26/04/16.
 */
public class NavigationDrawerAdapter  extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder>{


    List<NavDrawerItem> items = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;


    public NavigationDrawerAdapter(List<NavDrawerItem> items, Context context)
    {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    public void delete (int position)
    {
        items.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = inflater.inflate(R.layout.nav_drawer_row, viewGroup, false );
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
            NavDrawerItem current = items.get(position);
             myViewHolder.title.setText(current.getTitle());
            myViewHolder.icon.setImageResource(current.getIcon());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.title);
            this.icon = (ImageView)itemView.findViewById(R.id.icon);
        }
    }
}
