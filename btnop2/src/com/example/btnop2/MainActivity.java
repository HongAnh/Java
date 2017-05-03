package com.example.btnop2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	EditText DL;
	TextView AL;
	Button nutc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nutc = (Button) findViewById(R.id.button1);
		nutc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				DL = (EditText) findViewById(R.id.editText1);
		    	AL = (TextView) findViewById(R.id.textView4);
		    	try{
			    	int x = Integer.parseInt(DL.getText().toString());
			    	AL.setText(Can(x%10)+ " " + Chi(x%12));
		    	}
		    	catch (Exception e1)
		    	{
		    		AL.setText("Du Lieu Nhap Khong Hop Le!");
		    	}	
				
			
			}
		});
		
	}
    public String Can(int x){
    	switch (x)
    	{
    	    case 0 : return "Canh";
    	    case 1 : return "Tan";
    	    case 2 : return "Nham";
    	    case 3 : return "Quy";
    	    case 4 : return "Giap";
    	    case 5 : return "At";
    	    case 6 : return "Binh";
    	    case 7 : return "Dinh";
    	    case 8 : return "Mau";
    	    case 9 : return "Ky";
    	    default : return "loi";
    	}
    	
    }
    public String Chi(int x){
    	switch (x)
    	{
    	    case 0 : return "Than";
    	    case 1 : return "Dau";
    	    case 2 : return "Tuat";
    	    case 3 : return "Hoi";
    	    case 4 : return "Ty";
    	    case 5 : return "Suu";
    	    case 6 : return "Dan";
    	    case 7 : return "Meo";
    	    case 8 : return "Thinh";
    	    case 9 : return "Ty";
    	    case 10 : return "Ngo";
    	    case 11 : return "Mui";
    	    default : return "loi";
    	}
    	
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
