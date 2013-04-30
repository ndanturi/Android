package com.asu.edu;

/*
 * CST594 Mobile Computing Mobile course App
 * Module is the first Screen that the user sees upon launching the app
 * About Professor
 * About Course
 * Student Projects
 * Gallery
 * Add Course To Calendar
 * Class Location are some of the features included in the application
 * Any new features should be implemented in this module
 *  @author Naveen Danturi
 */
import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		/* Event Listener to Launch Information About Professor */

		Button b = (Button) findViewById(R.id.prof);
		b.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// here i call new screen;
				Intent i = new Intent(MainActivity.this, AboutProf.class);
				startActivity(i);
			}
		});

		/* Event Listener to Launch Information About Course */
		Button c = (Button) findViewById(R.id.course);
		c.setOnClickListener(new OnClickListener() {
			public void onClick(View e) {
				Intent k = new Intent(MainActivity.this, AboutCourse.class);
				startActivity(k);

			}
		});

		/* Event Listener to Launch Information About Student Projects */
		Button e = (Button) findViewById(R.id.proj);
		e.setOnClickListener(new OnClickListener() {
			public void onClick(View e) {
				Intent k = new Intent(MainActivity.this, StudentProj.class);
				startActivity(k);

			}
		});
		/* Event Listener to Launch Gallery */
		Button d = (Button) findViewById(R.id.gall);
		d.setOnClickListener(new OnClickListener() {
			public void onClick(View e) {
				Intent h = new Intent(MainActivity.this, GalleryView.class);
				startActivity(h);

			}
		});
		/* Event Listener to open Calendar and add event */
		Button i = (Button) findViewById(R.id.cal);
		i.setOnClickListener(new OnClickListener() {
			public void onClick(View e) {
				Calendar beginCal = Calendar.getInstance();
				beginCal.set(2013, 03, 25, 15, 00, 00);

				Calendar endCal = Calendar.getInstance();
				// endCal.set(2013, 03, 25, 16, 15, 00);

				Intent intent = new Intent(Intent.ACTION_EDIT);
				intent.setType("vnd.android.cursor.item/event");
				intent.putExtra("beginTime", beginCal.getTimeInMillis());
				intent.putExtra("allDay", false);
				intent.putExtra("rrule",
						"FREQ=WEEKLY;COUNT=11;WKST=SU;BYDAY=TU,TH");
				intent.putExtra("endTime", endCal.getTimeInMillis());
				intent.putExtra("title", "CST594 Mobile Computing Class");
				startActivity(intent);

			}
		});
		/* Event Listener to Launch Information about location of class */
		Button loc = (Button) findViewById(R.id.loc);
		loc.setOnClickListener(new OnClickListener() {
			public void onClick(View e) {
				Intent h = new Intent(
						Intent.ACTION_VIEW,
						Uri.parse("geo:33.305988,-111.678899?q=33.305988,-111.678899(Peralta+Hall)"));
				startActivity(h);
				;

			}
		});
	}

}
