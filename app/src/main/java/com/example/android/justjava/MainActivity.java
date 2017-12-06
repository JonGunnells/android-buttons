package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;



public class MainActivity extends AppCompatActivity {

    int numberOfCoffees =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void increment(View view){
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);
    }

    public void submitOrder(View view) {

    }

    public void decrement(View view){
        numberOfCoffees = numberOfCoffees - 1;
        display(numberOfCoffees);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}