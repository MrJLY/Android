package com.abc.wcd;

import java.net.PasswordAuthentication;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    String user_name="123";
    String pass_word="123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       //String username;String password;

	 // username = (EditText) findViewById(R.id.editText1);
	//  password = (EditText) findViewById(R.id.editText2);        
      Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {

			// TODO Auto-generated method stub
			Intent intent = new Intent(MainActivity.this,Second_Activity.class);	
			//if(user_name.equals(username.getText().toString()&&pass_word.equals(Password.getText()。toString())))
			MainActivity.this.startActivity(intent);
		}
	});
        //从布局文件装载并创建3个TextView对象
     
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);     
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
