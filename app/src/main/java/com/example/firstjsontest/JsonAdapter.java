package com.example.firstjsontest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Filter;
import android.widget.Filter.*;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JsonAdapter extends RecyclerView.Adapter<JsonAdapter.JsonAdapterViewHolder> {

   private Context mContext;
   private ArrayList<ExampleItem> mExampleList;
   private OnItemClickListener mListener;




   public interface OnItemClickListener{

       void onItemClick(int position);

   }



   public void setOnItemClickListener(OnItemClickListener listener){

       mListener = listener;
   }

   public JsonAdapter(Context context, ArrayList<ExampleItem> exampleList){


       mContext = context;
       mExampleList = exampleList;

   }

    @NonNull
    @Override
    public JsonAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cardview_item, parent, false);

      return new JsonAdapterViewHolder(view);

   }

    @Override
    public void onBindViewHolder(@NonNull JsonAdapterViewHolder holder, int position) {


       ExampleItem currentItem = mExampleList.get(position);

       String imageUrl = currentItem.getmImageUrl();
       String creatorName = currentItem.getCreator();
       String strCategory = currentItem.getCategoryCount();


       holder.mTextViewCreator.setText(creatorName);
       holder.mTextViewCategory.setText("Category :" + strCategory);
       Picasso.with(mContext).load(imageUrl).fit().centerInside().into(holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }



    public class JsonAdapterViewHolder extends RecyclerView.ViewHolder{

       public ImageView mImageView;
       public TextView mTextViewCreator;
       public TextView mTextViewCategory;




        public JsonAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.image_view);
            mTextViewCreator = itemView.findViewById(R.id.textview_id);
            mTextViewCategory = itemView.findViewById(R.id.category);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mListener != null){


                        int position = getAdapterPosition();

                        if(position != RecyclerView.NO_POSITION){

                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
