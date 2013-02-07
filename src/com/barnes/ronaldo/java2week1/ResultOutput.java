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

import com.rbarnes.lib.WebInterface;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ResultOutput extends Activity implements OnClickListener{

	
	Context _context;
	Boolean _connected = false;
	String _titleStr;
	String _addressStr;
	String _cityStr;
	String _stateStr;
	String _phoneStr;
	String _mapCoord;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		_context = this;
		setContentView(R.layout.result);
		Button callButton = (Button)findViewById(R.id.callButton);
		Button mapButton = (Button)findViewById(R.id.mapButton);
		_phoneStr = "tel:"+"(253)507-8911";
		_mapCoord = "geo:" +"47.609671,-122.34218" + "?z=100";
		_connected = WebInterface.getConnectionStatus(_context);
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
		        Log.e("CALL", "Call failed", e);
		    }
		break;
		case R.id.mapButton:
			try {
				
				Intent mapIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(_mapCoord));
				startActivity(mapIntent);
		        } catch (ActivityNotFoundException e) {
		        Log.e("MAP", "Map did not launch", e);
		    }
		break;
		}
	}
}
