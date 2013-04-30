package com.asu.edu;
/*
 * CST594 Mobile Computing Mobile course App
 * Module About Student Projects
 * Any updates about students projects and presentations should go in this module
 *  @author Naveen Danturi
 */
import java.util.ArrayList;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.Toast;

public class StudentProj extends ExpandableListActivity implements
		OnChildClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ExpandableListView expandbleLis = getExpandableListView();
		expandbleLis.setDividerHeight(2);
		expandbleLis.setGroupIndicator(null);
		expandbleLis.setClickable(true);

		setGroupData();
		setChildGroupData();

		NewAdapter mNewAdapter = new NewAdapter(groupItem, childItem);
		mNewAdapter
				.setInflater(
						(LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE),
						this);
		getExpandableListView().setAdapter(mNewAdapter);
		expandbleLis.setOnChildClickListener(this);
	}

	public void setGroupData() {
		groupItem.add("Android");
		groupItem.add("iOS");
		groupItem.add("Titanium");
		groupItem.add("Research Presentation");
	}

	ArrayList<String> groupItem = new ArrayList<String>();
	ArrayList<Object> childItem = new ArrayList<Object>();

	public void setChildGroupData() {
		/**
		 * Add Data For Android
		 */
		ArrayList<String> child = new ArrayList<String>();
		child.add("Android Tutorial");
		child.add("Android Quiz");
		child.add("Hello World Example");
		child.add("Knock Knock Example");
		child.add("AndEngine Example");
		child.add("Google Map Example");
		childItem.add(child);

		/**
		 * Add Data For iOS
		 */
		child = new ArrayList<String>();
		child.add("iOS Tutorial");
		child.add("iOS Quiz");
		child.add("Wei-Meng Lee's Objective-C Crash Course");
		child.add("Hello World Example");
		child.add("Sqlite Example");
		child.add("Simple To Do List Example");
		child.add("Location Service Demo");
		child.add("Twitter Test	 Example");
		childItem.add(child);
		/**
		 * Add Data For Titanium
		 */
		child = new ArrayList<String>();
		child.add("Titanium IDE Setup");
		child.add("Titanium Tutorial");
		child.add("Database App");
		child.add(" Order your pizza App");
		child.add("RSS Feed APP");
		child.add("Puzzle App");
		child.add("Titanium Quiz as APP");
		childItem.add(child);
		/**
		 * Add Data For Research Presentations
		 */
		child = new ArrayList<String>();
		child.add("Platform API's");
		child.add("Technology Behind Location Awareness");
		child.add("Location Based Services");
		child.add("Speech Recognition for Mobile Systems");
		child.add("Mobile Issues: Technical and Policy");
		child.add("Controlling Energy Demand");
		child.add("Application Design for Wearable Computing");
		child.add("Multi-Platform Development");
		child.add("Mobile Replicated Data");
		child.add("Testing Mobile Apps");
		childItem.add(child);
	}

	@Override
	public boolean onChildClick(ExpandableListView parent, View v,
			int groupPosition, int childPosition, long id) {
		Toast.makeText(StudentProj.this, "Clicked On Child",
				Toast.LENGTH_SHORT).show();
		return true;
	}
}