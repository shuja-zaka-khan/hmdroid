package com.folio3.hirematics.users;

import com.folio3.hirematics.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LoginPage extends Activity {

	TextView signupButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
		findAllViewsById();
		signupButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("android.intent.action.SIGNUP");
				startActivity(intent);
			}
		});
	}

	private void findAllViewsById() {
		// TODO Auto-generated method stub
		signupButton = (TextView) findViewById(R.id.SignupButtons);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
