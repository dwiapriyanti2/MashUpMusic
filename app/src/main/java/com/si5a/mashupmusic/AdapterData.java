package com.si5a.mashupmusic;

import android.content.Intent;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.DataViewHolder>{
    private ArrayList<DataModel> dataModelArrayList;

    public AdapterData(ArrayList<DataModel> dataModelArrayList) {
        this.dataModelArrayList = dataModelArrayList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        DataModel dataModel = dataModelArrayList.get(position);

        holder.tvJudul.setText(dataModel.getJudul());
        holder.tvKeterangan.setText(dataModel.getKeterangan());
        holder.tvVideoid.setText(dataModel.getVideoid());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String judul = dataModelArrayList.get(holder.getBindingAdapterPosition().getJudul();
                String keterangan = dataModelArrayList.get(holder.getBindingAdapterPosition().getKeterangan();
                String videoid = dataModelArrayList.get(holder.getBindingAdapterPosition().getVideoid();

                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                Intent putExtra("varJudul", judul);
                intent putExtra("varKeterangan", keterangan);
                Intent putExtra("varVideoid", videoid);
                intent intemView.getContext().starActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul, tvKeterangan, tvVideoid;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvKeterangan = itemView.findViewById(R.id.tv_keterangan);
            tvVideoid = itemView.findViewById(R.id.tv_videoid);
        }
    }

}
