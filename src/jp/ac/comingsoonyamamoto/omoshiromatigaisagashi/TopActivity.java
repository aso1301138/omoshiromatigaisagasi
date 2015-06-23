package jp.ac.comingsoonyamamoto.omoshiromatigaisagashi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TopActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
    
    //遷移はだいたいこんな感じで！！！
    //buttonの取得
  	ImageButton ibtn = (ImageButton)findViewById(R.id.iBstart);
  	ibtn.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO 自動生成されたメソッド・スタブ
			Intent start = new Intent(TopActivity.this,LevelActivity.class);
			startActivity(start);
		}
	});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top, menu);
        return true;
    }
    
}
