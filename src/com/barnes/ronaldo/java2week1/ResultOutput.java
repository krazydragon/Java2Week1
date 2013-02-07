/*
 * project	Java2Week1
 * 
 * package	com.barnes.ronaldo.java2week1
 * 
 * @author	Ronaldo Barnes
 * 
 * date		Feb 5, 2013
 */
package com.barnes.ronaldo.java2week1;

import java.util.HashMap;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ResultOutput extends Activity implements OnClickListener{

	
	String _titleStr;
	String _addressStr;
	String _cityStr;
	String _stateStr;
	String _phoneStr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Test", "test");
		setContentView(R.layout.result);
		Button callButton = (Button)findViewById(R.id.callButton);
		Button mapButton = (Button)findViewById(R.id.mapButton);
		_phoneStr = "tel:"+"2536827980";
		
		callButton.setOnClickListener(this);
		mapButton.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.callButton:
			try {
		        Intent callIntent = new Intent(Intent.ACTION_CALL,Uri.parse(_phoneStr));
		        startActivity(callIntent);
		        } catch (ActivityNotFoundException e) {
		        Log.e("CALL FAIL", "Call failed", e);
		    }
			
		}
	}
}
