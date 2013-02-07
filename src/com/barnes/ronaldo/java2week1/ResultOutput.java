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
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ResultOutput extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Test", "test");
		setContentView(R.layout.result);
		Intent intent = getIntent();
	    HashMap<String, String> hashMap = (HashMap<String, String>)intent.getSerializableExtra("hashMap");
	    Log.v("HashMapTest", hashMap.get("key"));
		
		
		
		
	}
}
