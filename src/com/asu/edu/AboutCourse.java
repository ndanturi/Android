package com.asu.edu;
/*
 * CST594 Mobile Computing Mobile course App
 * Module About Course
 * Any New elements about course should go in this module.
 *  @author Naveen Danturi
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutCourse extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutcourse);
		/*Event Listener for getting the Syllabus in PDF Format from the website  */
		Button OpenPDF = (Button) findViewById(R.id.des);
		OpenPDF.setOnClickListener(new View.OnClickListener() {
			public void onClick(View s) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://pooh.poly.asu.edu/Mobile/Syllabus/Cst594Description.pdf")));

			}
		});

	}

}
