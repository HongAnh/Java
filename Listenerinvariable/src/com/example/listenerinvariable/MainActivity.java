package com.example.listenerinvariable;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	
	EditText c, f;
	Button btntoC, btntoF, btnClear;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		f=(EditText) findViewById(R.id.editText1);
        c=(EditText) findViewById(R.id.editText2);
        btntoC=(Button) findViewById(R.id.button1);
        btntoF=(Button) findViewById(R.id.button2);
        btnClear=(Button) findViewById(R.id.button3);
        btntoC.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
    	    		double df = Double.parseDouble(f.getText().toString());
    	        	c.setText((df - 32)*5/9 + "") ;
    	    	}
    	    	catch(Exception e)
    	    	{
    	    		c.setText("Lỗi dữ liệu nhập") ;
    	    	}
			}
		});
        
        btntoF.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
    	    		double dc = Double.parseDouble(c.getText().toString());
    	        	f.setText(dc*9/5 + 32 + "") ;
    	    	}
    	    	catch(Exception e)
    	    	{
    	    		f.setText("Lỗi dữ liệu nhập") ;
    	    	}
			}
		});
        
        btnClear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				f.setText("") ;
    	    	c.setText("") ;
    	    	f.requestFocus();
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
