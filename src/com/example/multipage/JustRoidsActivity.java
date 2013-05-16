package com.example.multipage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class JustRoidsActivity extends Activity {

@Override
public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.main);
}

public void onClickFeed1(View v) {
  Toast.makeText(this, "You clicked on Feed 1!", Toast.LENGTH_LONG).show();
  Intent intent = new Intent(this, Feed1Activity.class);
  startActivity(intent);
}

public void onClickFeed2(View v) {
  Toast.makeText(this, "You clicked on Feed 2!", Toast.LENGTH_LONG).show();
  Intent intent = new Intent(this, Feed2Activity.class);
  startActivity(intent);
}

public void onClickFeed3(View v) {
  Toast.makeText(this, "You clicked on Feed 3!", Toast.LENGTH_LONG) .show();
  Intent intent = new Intent(this, Feed3Activity.class);
  startActivity(intent);
}

public void onClickNewFeed(View v) {
	  Toast.makeText(this, "Add new feed1", Toast.LENGTH_LONG) .show();
	  Intent intent = new Intent(this, NewFeedActivity.class);
	  startActivity(intent);
	}

public void onClickNewFeed2(View v) {
	  Toast.makeText(this, "Add new feed2", Toast.LENGTH_LONG) .show();
	  Intent intent = new Intent(this, NewFeedActivity2.class);
	  startActivity(intent);
	}

public void onClickNewFeed3(View v) {
	  Toast.makeText(this, "Add new feed3", Toast.LENGTH_LONG) .show();
	  Intent intent = new Intent(this, NewFeedActivity3.class);
	  startActivity(intent);
	}
}
