package com.example.myfit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.net.CookieHandler;
import java.util.List;
public class food_adapter extends ArrayAdapter {
    private Context mCtx;
    private int resources;
    private List items;

    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        LayoutInflater var = LayoutInflater.from(this.mCtx);
        LayoutInflater layoutInflater = var;
        View var10 = layoutInflater.inflate(this.resources, (ViewGroup)null);
        View view = var10;
        var10 = view.findViewById(R.id.food_image);
        ImageView imageView = (ImageView)var10;
        var10 = view.findViewById(R.id.foodNameText);
        TextView titleTextView = (TextView)var10;
        var10 = view.findViewById(R.id.foodDescription);
        TextView despTextView = (TextView)var10;
        model mItem = (model) this.items.get(position);
        imageView.setImageDrawable(this.mCtx.getResources().getDrawable(mItem.getImg()));
        titleTextView.setText((CharSequence)mItem.getTitle());
        despTextView.setText((CharSequence)mItem.getDescription());
        return view;
    }
    @NotNull
    public final Context getMCtx() {
        return this.mCtx;
    }
    public final void setMCtx(@NotNull Context var1) {
        this.mCtx = var1;
    }
    public final int getResources() {
        return this.resources;
    }
    public final void setResources(int var1) {
        this.resources = var1;
    }
    @NotNull
    public final List getItems() {
        return this.items;
    }
    public final void setItems(@NotNull List var1) {
        this.items = var1;
    }
    public food_adapter(@NotNull Context mCtx, int resources, @NotNull List items) {
        super(mCtx, resources, items);
        this.mCtx = mCtx;
        this.resources = resources;
        this.items = items;
    }
}