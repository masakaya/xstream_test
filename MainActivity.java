package com.example.test;

import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		XMLParser parser = new XMLParser();
		HashMap<String, String> testMap = new HashMap<String, String>();
	    testMap.put("aaa","bbb");
	    testMap.put("ccc", "ddd");
	   TestData data = new TestData("http://test.co.jp" , true , testMap);
	   parser.setAlias("testData", TestData.class);
	   String str = parser.toXML(data); 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
