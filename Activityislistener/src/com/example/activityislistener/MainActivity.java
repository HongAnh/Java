package com.example.activityislistener;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	EditText Ten, ChieuCao,CanNang, BMI, ChuanDoan;
	Button nut;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nut=(Button) findViewById(R.id.button1);
        nut.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ChieuCao=(EditText) findViewById(R.id.editText2);
		    	CanNang=(EditText) findViewById(R.id.editText3);
		    	BMI=(EditText) findViewById(R.id.editText4);
		    	ChuanDoan=(EditText) findViewById(R.id.editText5);
		    	DecimalFormat LamTron=new DecimalFormat("#.0");
		    	try  
		        {  
		    	
		    		double iCao= Double.parseDouble(ChieuCao.getText().toString());
		    		double iCanNang=Double.parseDouble(CanNang.getText().toString());
		    		double dBMI = iCanNang/Math.pow(iCao, 2);
		           if(dBMI>35) {
		        	   BMI.setText(LamTron.format(dBMI)+"");
		        	   ChuanDoan.setText("Người béo phì độ III");
		           }
		           else if(dBMI>=30) {
		        	   BMI.setText(LamTron.format(dBMI)+"");
		        	   ChuanDoan.setText("Người béo phì độ II");
		           }
		           else if(dBMI>=25) {
		        	   BMI.setText(LamTron.format(dBMI)+"");
		        	   ChuanDoan.setText("Người béo phì độ I");
		           }
		           else if(dBMI>=18) {
		        	   BMI.setText(LamTron.format(dBMI)+"");
		        	   ChuanDoan.setText("Người bình thường");
		           }else{
		        	   BMI.setText(LamTron.format(dBMI)+"");
		        	   ChuanDoan.setText("Người gầy");
		           }
		        	   
		        }  
		        catch(Exception e)  
		        {  
		        	BMI.setText("Lỗi dữ liệu nhập vào");
		     	   ChuanDoan.setText("Lỗi dữ liệu nhập vào");
		        }  
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
