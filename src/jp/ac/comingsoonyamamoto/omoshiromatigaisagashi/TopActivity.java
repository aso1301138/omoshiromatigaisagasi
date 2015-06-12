package jp.ac.comingsoonyamamoto.omoshiromatigaisagashi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TopActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
    }
    //遷移はだいたいこんな感じで！！！
    //buttonの取得
  	//Button button = (Button)findViewById(R.id.Buttonの名前);
  	//タップされたら
  	//button.setOnClickListener(new View.OnClickListener() {
  		//@Override
  		//public void onClick(View v) {
  			//
  			//呼び出すためのインテント
  			//Intent intent = new Intent(TopActivity.this,RankingActivity.class);
  			//startActivity(intent);
  		//}
  	//});


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top, menu);
        return true;
    }
    
}
