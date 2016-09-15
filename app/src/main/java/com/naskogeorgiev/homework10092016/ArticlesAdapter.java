package com.naskogeorgiev.homework10092016;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.naskogeorgiev.homework10092016.models.Article;
import com.naskogeorgiev.homework10092016.interfaces.IArticleSelected;

import java.util.ArrayList;

/**
 * Created by nasko.georgiev on 14.9.2016 г..
 */

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ArticleViewHolder> {

    private ArrayList<Article> mData;
    private IArticleSelected mListener;

    public ArticlesAdapter(ArrayList<Article> mData, IArticleSelected mListener) {
        this.mData = mData;
        this.mListener = mListener;
    }


    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_article_item, parent, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        holder.tvTitle.setText(mData.get(position).getTitle());
        holder.tvContent.setText(mData.get(position).getContent());
        holder.setItemPosition(position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ArticleViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle, tvContent;
        private int position;

        ArticleViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvContent = (TextView) itemView.findViewById(R.id.tv_content);

            tvTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onItemSelected(position);
                }
            });
        }

        void setItemPosition(int position) {
            this.position = position;
        }
    }
}
