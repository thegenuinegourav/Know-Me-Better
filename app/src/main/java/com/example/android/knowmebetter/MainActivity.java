package com.example.android.knowmebetter;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void A_Option(View view)
    {
        Toast toast= Toast.makeText(getApplicationContext(),"Wrong Answer Stupid!!",Toast.LENGTH_SHORT);

        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        toast.show();
    }

    public void B_Option(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Correct!! Yo u know me better..", Toast.LENGTH_SHORT);

        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        toast.show();
        setContentView(R.layout.activity_main2);

    }

    public void C_Option(View view)
    {
        Toast toast= Toast.makeText(getApplicationContext(),"Wrong Answer Stupid!!",Toast.LENGTH_SHORT);

        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        toast.show();
    }

    public void D_Option(View view)
    {
        Toast toast= Toast.makeText(getApplicationContext(),"Wrong Answer Stupid!!",Toast.LENGTH_SHORT);

        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        toast.show();
    }


    public void A_Option2(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Correct!!", Toast.LENGTH_SHORT);

        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
        setContentView(R.layout.activity_main3);
    }

    public void B_Option2(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
}

    public void C_Option2(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
    }

    public void D_Option2(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
    }

    public void A_Option3(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
    }

    public void B_Option3(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
    }

    public void C_Option3(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Correct! Selena is really awesome..", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
        setContentView(R.layout.activity_main4);
    }

    public void D_Option3(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
    }


    public void A_Option4(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
    }

    public void B_Option4(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
    }

    public void C_Option4(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Wrong Answer Stupid!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
    }

    public void D_Option4(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Correct!! Now I guess u must be afraid of me!!", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
        setContentView(R.layout.activity_main5);
    }


    public void A_Option5(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Correct! Actually All options are correct", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
        setContentView(R.layout.thank_you);
    }

    public void B_Option5(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Correct! Actually All options are correct", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
        setContentView(R.layout.thank_you);
    }

    public void C_Option5(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Correct! Actually All options are correct", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
        setContentView(R.layout.thank_you);
    }

    public void D_Option5(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "Correct! Actually All options are correct", Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) t.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        t.show();
        setContentView(R.layout.thank_you);
    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
