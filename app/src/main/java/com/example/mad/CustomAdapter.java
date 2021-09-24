package com.example.mad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private Context context;
    private ArrayList Booking_id;
    private ArrayList check_date;
    private ArrayList check_time;
    private ArrayList cabin_type;
    private ArrayList number_of_cabin;
    private ArrayList email;
    private ArrayList cnumber;
    private ArrayList discount;
    private ArrayList fare;

    CustomAdapter(Context context, ArrayList Booking_id, ArrayList check_date, ArrayList check_time, ArrayList cabin_type, ArrayList number_of_cabin, ArrayList email, ArrayList cnumber, ArrayList discount, ArrayList fare){
        this.context = context;
        this.Booking_id = Booking_id;
        this.check_date = check_date;
        this.check_time = check_time;
        this.cabin_type = cabin_type;
        this.number_of_cabin = number_of_cabin;
        this.cnumber = cnumber;
        this.discount = discount;
        this.fare = fare;
        this.email = email;

    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_booking, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
        holder.Booking_id_txt.setText(String.valueOf(Booking_id.get(position)));
        holder.check_date_txt.setText(String.valueOf(check_date.get(position)));
        holder.check_time_txt.setText(String.valueOf(check_time.get(position)));
        holder.cabin_type_txt.setText(String.valueOf(cabin_type.get(position)));
        holder.number_of_cabin_txt.setText(String.valueOf(number_of_cabin.get(position)));
        holder.cnumber_txt.setText(String.valueOf(discount.get(position)));
        holder.discount_txt.setText(String.valueOf(fare.get(position)));
        holder.fare_txt.setText(String.valueOf(email.get(position)));
        holder.email_txt.setText(String.valueOf(cnumber.get(position)));
    }

    @Override
    public int getItemCount() {
        return Booking_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Booking_id_txt, check_date_txt, check_time_txt, cabin_type_txt, number_of_cabin_txt, email_txt, cnumber_txt, discount_txt, fare_txt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Booking_id_txt = itemView.findViewById(R.id.textView14);
            check_date_txt = itemView.findViewById(R.id.textView18);
            check_time_txt = itemView.findViewById(R.id.textView59);
            email_txt = itemView.findViewById(R.id.textView65);
            cabin_type_txt = itemView.findViewById(R.id.textView58);
            number_of_cabin_txt = itemView.findViewById(R.id.textView57);
            cnumber_txt = itemView.findViewById(R.id.textView20);
            discount_txt = itemView.findViewById(R.id.textView24);
            fare_txt = itemView.findViewById(R.id.textView23);
        }
    }
}
