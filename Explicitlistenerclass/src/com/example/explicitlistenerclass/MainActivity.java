package com.example.explicitlistenerclass;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	EditText a, b, c;
	TextView kq;
	Button btnTieptuc,btnGiai,btnThoat;
	DecimalFormat LamTron=new DecimalFormat("#.00");
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		a=(EditText) findViewById(R.id.editText1);
        b=(EditText) findViewById(R.id.editText2);
        c=(EditText) findViewById(R.id.editText3);
        kq=(TextView) findViewById(R.id.textView5);
        btnTieptuc=(Button) findViewById(R.id.button1);
        btnGiai=(Button) findViewById(R.id.button2);
        btnThoat=(Button) findViewById(R.id.button3);
        
        btnTieptuc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				a.setText("");
	        	b.setText("");
	        	c.setText("");
	        	kq.setText("");
	        	a.requestFocus();
			}
		});
        
        btnGiai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
	        		double da = Double.parseDouble(a.getText().toString());
	            	double db = Double.parseDouble(b.getText().toString());
	            	double dc = Double.parseDouble(c.getText().toString());
	            	
	            	if(da==0)
	            		if(db==0)
	            			if(dc==0)
	            				kq.setText("PT vô số nghiệm!");
	            			else kq.setText("PT vô nghiệm!");
	            		else kq.setText("PT có 1 N:o x= " + LamTron.format(-dc/db));
	            	else
	            	{
	            		double delta = Math.pow(db, 2) - 4*da*dc;
	            		if(delta<0) kq.setText("PT vô nghiệm!");
	            		else if(delta==0) kq.setText("PT có Ngiem kép: x1 = x2 = " + LamTron.format(-db/(2*da)));
	            		else {
	            			double x1, x2;
	            			x1 = (-db - Math.sqrt(delta))/(2*da);
	            			x2 = (-db+ Math.sqrt(delta))/(2*da);
	            			kq.setText("PT có 2 Ngiem: x1 = " + LamTron.format(x1) + ", x2 = " + LamTron.format(x2));
	            		}
	            		
	            	}
	        	}
	        	catch(Exception e)
	        	{
	        		kq.setText("Lỗi dữ liệu nhập!");
	        	}
			}
		});
        
        btnThoat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
