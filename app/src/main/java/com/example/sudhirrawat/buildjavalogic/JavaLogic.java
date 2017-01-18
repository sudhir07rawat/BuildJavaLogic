package com.example.sudhirrawat.buildjavalogic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import adapters.ProductsAdapter;
import models.ProductDataModel;

public class JavaLogic extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<ProductDataModel> productList =new ArrayList<ProductDataModel>();
    private ProductsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_logic);
        init();

    }

    public void init(){
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        adapter = new ProductsAdapter(productList);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        getProducts();
    }

    public void getProducts(){
//        ProductDataModel dataModel = new ProductDataModel("N","Numbers");
//        productList.add(dataModel);
//        dataModel = new ProductDataModel("S","String");
//        productList.add(dataModel);
//        dataModel = new ProductDataModel("A","Arrays");
//        productList.add(dataModel);
//        dataModel = new ProductDataModel("P","Puzzle");
//        productList.add(dataModel);
//        dataModel = new ProductDataModel("T","Thread");
//        productList.add(dataModel);
//        dataModel = new ProductDataModel("S","Services");
//        productList.add(dataModel);

        adapter.notifyDataSetChanged();
    }
}
