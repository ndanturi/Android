package com.asu.edu;
/*
 * CST594 Mobile Computing Mobile course App
 * Module About Professor
 * Any New Updates on Professor's work should go in this module.
 *  @author Naveen Danturi
 */
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AboutProf extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /*Event Listener to get professor's webstie */
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener()
        {
		public void onClick(View v) {
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
            myWebLink.setData(Uri.parse("http://pooh.poly.asu.edu/Lindquist/index.html"));
            startActivity(myWebLink);
			
		}
        });
        
      
    }
}