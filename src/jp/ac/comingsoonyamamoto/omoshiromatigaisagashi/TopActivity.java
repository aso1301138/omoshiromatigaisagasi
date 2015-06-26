package jp.ac.comingsoonyamamoto.omoshiromatigaisagashi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class TopActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
    }
    //imagebuttonの取得
    ImageButton ibs = (ImageButton)findViewById(R.id.iBstart);
    
    public void onClick(View v) {
    	Intent intent = null;
    	switch (v.getId()) {
    	case (R.id.iBstart):
    		intent = new Intent(TopActivity.this,LevelActivity.class);
    		break;
    	case (R.id.iBranking):
    		intent = new Intent(TopActivity.this,RankingActivity.class);
    		break;
    	case (R.id.iBhelp):
    		intent = new Intent(TopActivity.this,HelpActivity.class);
    		break;
    	case (R.id.iBoption):
    		intent = new Intent(TopActivity.this,OptionActivity.class);
    		break;
    	}
    	startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top, menu);
        return true;
    }
    
}
