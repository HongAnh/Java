package com.example.btnop;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	Button btt;
	RadioButton tbtt,tbtt1;
	TextView txt;
	int count = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btt = (Button)findViewById(R.id.button1);
		tbtt = (RadioButton)findViewById(R.id.radioButton1);
		tbtt1 = (RadioButton)findViewById(R.id.radioButton2);
		txt = (TextView)findViewById(R.id.textView1);
		txt.setText(String.valueOf(count));
		btt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(tbtt.isChecked())
				{
					count ++;
				}
				else
				if(tbtt1.isChecked())
				{
					count --;
				}
				txt.setText(String.valueOf(count));
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
