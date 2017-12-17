package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;



public class MainActivity extends AppCompatActivity {

    int quantity =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public int createORderSummary(int orderPrice){
        displayMessage("Name: Kaptain Kunal \n Quantity: " + quantity);
        return orderPrice;
   }

    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    public void increment(View view){
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void submitOrder(View view) {
        int price = quantity *5;
        createORderSummary(quantity);
        String priceMessage = "Total: $" + price;
        priceMessage = priceMessage + " \n ThankYou!";
        displayMessage(priceMessage);
    }

    public void decrement(View view){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }


    private void displayQuantity(int num) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + num);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }
}