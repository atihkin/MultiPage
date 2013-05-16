
package com.example.multipage;



import com.example.multipage.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;



public class NewFeedActivity extends Activity {

	//field to update with retrieved tweets

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.page4);
			//reference throughout class
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.just_roids, menu);
			return true;
		}

		/*
		 * Called when user presses button
		 */
		public void searchTwitter(View view){
			//get user entered search term
			EditText searchTxt = (EditText)findViewById(R.id.search_edit);
			String searchTerm = searchTxt.getText().toString();
			Intent intentExplicit = new Intent(NewFeedActivity.this, Feed1Activity.class);
			intentExplicit.putExtra("First Value", searchTerm); 
			startActivity(intentExplicit);
	}
}		