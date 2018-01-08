package com.abc.wcd;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.net.PasswordAuthentication;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;


public class Second_Activity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_);
//成绩查询
		Button btn2 = (Button) findViewById(R.id.button2);
		   btn2.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent2 = new Intent(Second_Activity.this,Activityone.class);	
							Second_Activity.this.startActivity(intent2);
					}
				});		
//阳光平台
  Button btn3=(Button) findViewById(R.id.button3);	
  btn3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent3 =new Intent();
		intent3.setData(Uri.parse("http://fuwu.ccsu.cn/web/index_new.jsp"));
		intent3.setAction(intent3.ACTION_VIEW);
		Second_Activity.this.startActivity(intent3);
	}
});	
//失物招领
  Button btn4 = (Button) findViewById(R.id.button4);
  btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent4 = new Intent(Second_Activity.this,Activitythree.class);	
					Second_Activity.this.startActivity(intent4);
			}
		});
//微图书馆
  Button btn5 = (Button) findViewById(R.id.button5);
  btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent5 = new Intent(Second_Activity.this,Activityfour.class);	
					Second_Activity.this.startActivity(intent5);
			}
		});  
//校园卡
  Button btn6 = (Button) findViewById(R.id.button6);
  btn6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent6 = new Intent(Second_Activity.this,Activityfive.class);	
					Second_Activity.this.startActivity(intent6);
			}
		});
//校园地图		
   Button btn7 = (Button) findViewById(R.id.button7);
   btn7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent7 = new Intent();
				intent7.setData(Uri.parse("http://m.amap.com/"));
				intent7.setAction(intent7.ACTION_VIEW);
				Second_Activity.this.startActivity(intent7);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}



}
