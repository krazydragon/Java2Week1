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

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainInputForm extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_input_form);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_input_form, menu);
		return true;
	}

}
