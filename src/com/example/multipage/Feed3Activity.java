package com.example.multipage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Feed3Activity extends Activity {

	private TextView tweetDisplay;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
		tweetDisplay = (TextView)findViewById(R.id.tweet_txt);
		  BufferedReader input = null;
		  try {
		    input = new BufferedReader(new InputStreamReader(openFileInput("myfile3")));
		    String line;
		    StringBuilder buffer = new StringBuilder();
		    while ((line = input.readLine()) != null) {
		    buffer.append(line);
		    buffer.append("\n");
		    }
			tweetDisplay.setText(buffer.toString());
		  } catch (Exception e) {
		     e.printStackTrace();
		  } finally {
		  if (input != null) {
		    try {
		    input.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		    }
		  }
		        
    }

}
