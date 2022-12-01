package com.galen.importantbusinessproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public class MultiScrollContentAdapter extends RecyclerView.Adapter<MultiScrollContentAdapter.ViewHolder> {
    public MultiScrollContentAdapter() {
        super();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_pager_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final SimpleImageAdapter adapter;
        private final ViewPager2 viewPager2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            viewPager2 = itemView.findViewById(R.id.contentviewpager);
            viewPager2.setOffscreenPageLimit(2);
            adapter = new SimpleImageAdapter();
            viewPager2.setAdapter(adapter);
        }

        public void bind() {
            adapter.notifyDataSetChanged();
        }
    }
}
