package jp.ac.comingsoonyamamoto.omoshiromatigaisagashi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PoseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pose);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pose, menu);
		return true;
	}

}
