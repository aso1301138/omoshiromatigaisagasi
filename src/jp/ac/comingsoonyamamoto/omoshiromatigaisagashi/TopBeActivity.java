package jp.ac.comingsoonyamamoto.omoshiromatigaisagashi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TopBeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_topbe);
		
		//Viewの取得
		ImageView t_next = (ImageView)findViewById(R.id.aaaaa);
		
		t_next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TopBeActivity.this,TopActivity.class);
			}
		});
	}
}
