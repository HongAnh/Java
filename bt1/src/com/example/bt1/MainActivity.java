package com.example.bt1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	Button bttcong;
	TextView txtcong;
	EditText etxtso1, etxtso2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bttcong = (Button)findViewById(R.id.button1);
		txtcong = (TextView)findViewById(R.id.textView4);
		etxtso1 = (EditText)findViewById(R.id.editText1);
		etxtso2 = (EditText)findViewById(R.id.editText2);
		bttcong.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				int n1 = Integer.parseInt(etxtso1.getText()+"");
				
				int n2 = Integer.parseInt(etxtso2.getText()+"");
				
				txtcong.setText((n1+n2)+"");
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
