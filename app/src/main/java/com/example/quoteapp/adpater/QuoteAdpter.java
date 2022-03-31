package com.example.quoteapp.adpater;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quoteapp.R;
import com.example.quoteapp.model.quotemodel;

import java.util.ArrayList;

public class QuoteAdpter extends RecyclerView.Adapter<QuoteAdpter.viewHolder> {


    ArrayList<quotemodel> list;
    Context context;

    public QuoteAdpter(ArrayList<quotemodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public QuoteAdpter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quote_app , parent , false);
        return new viewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull QuoteAdpter.viewHolder holder, int position) {
        quotemodel model = list.get(position);
    holder.quotetaxt.setText(model.getQuote());

    holder.sharebtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


//            Intent txtIntent = new Intent(Intent.ACTION_SEND);
//            txtIntent .setType("text/plain");
//            txtIntent .putExtra(android.content.Intent.EXTRA_SUBJECT, "Quote");
//            txtIntent .putExtra(android.content.Intent.EXTRA_TEXT, list.get(position).getQuote());
//            context.startActivity(Intent.createChooser(txtIntent ,"Share"));

            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, model.getQuote());
            sendIntent.setType("text/plain");
            view.getContext().startActivity(Intent.createChooser(sendIntent ,"Share"));
        }
    });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        Button sharebtn;
        TextView quotetaxt;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            quotetaxt = itemView.findViewById(R.id.quotetaxt);
            sharebtn = itemView.findViewById(R.id.sharebtn);
        }
    }
}
