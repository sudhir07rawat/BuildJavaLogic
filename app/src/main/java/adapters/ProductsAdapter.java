package adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sudhirrawat.buildjavalogic.R;

import java.util.List;

import models.ProductDataModel;

/**
 * Created by sudhir.rawat on 12-01-2017.
 */

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.MyViewHolder> {

    private List<ProductDataModel> productmodelsList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView ab,details;
        public MyViewHolder(View itemView) {
            super(itemView);

//            ab=(TextView)itemView.findViewById(R.id.abbevationTxt);
//            details=(TextView)itemView.findViewById(R.id.descriptionTxt);
        }
    }
    @Override
    public ProductsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.rows,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductsAdapter.MyViewHolder holder, final int position) {
//        final ProductDataModel productDataModel = productmodelsList.get(position);
//        holder.ab.setText(productDataModel.getAbText());
//        holder.ab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(v.getContext(), "click on:  " + productDataModel.getDetailText() + " AT Position:  " + position, Toast.LENGTH_SHORT).show();
//            }
//        });
//        holder.details.setText(productDataModel.getDetailText());
    }

    @Override
    public int getItemCount() {
        return productmodelsList.size();
    }

    public ProductsAdapter(List<ProductDataModel> productmodelsList) {
        this.productmodelsList = productmodelsList;
    }
}
