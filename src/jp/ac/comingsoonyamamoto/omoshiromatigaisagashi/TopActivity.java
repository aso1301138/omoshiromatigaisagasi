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
        
        //imagebuttonの取得
        ImageButton ibs = (ImageButton)findViewById(R.id.iBstart);
        ImageButton ibr = (ImageButton)findViewById(R.id.iBranking);
        ImageButton ibh = (ImageButton)findViewById(R.id.iBhelp);
        ImageButton ibo = (ImageButton)findViewById(R.id.iBoption);
        
        //startがタップされたら
        ibs.setOnClickListener(new View.OnClickListener() {
        	@Override
        	public void onClick(View v){
        		// TODO Auto-generated method stub
        		Intent intent = new Intent(TopActivity.this,LevelActivity.class);
        		startActivity(intent);
        	}
        });
        
        //rankingがタップされたら
        ibr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TopActivity.this,RankingActivity.class);
				startActivity(intent);
			}
		});
        
        //helpがタップされたら
        ibh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TopActivity.this,HelpActivity.class);
				startActivity(intent);
			}
		}); 
        
        //optionがタップされたら
        ibo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TopActivity.this,OptionActivity.class);
				startActivity(intent); 
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
