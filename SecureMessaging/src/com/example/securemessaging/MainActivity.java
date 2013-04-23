package com.example.securemessaging;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button newMsgBtn;
	Button inboxBtn;
	Button sentMsgsBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addButtonClickListeners();
	}

	private void addButtonClickListeners() {
		final Context context = this;

		newMsgBtn = (Button) findViewById(R.id.newMsgBtn);
		newMsgBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, NewMessageActivity.class);
				startActivity(intent);
			}
		});

		inboxBtn = (Button) findViewById(R.id.inboxBtn);
		inboxBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, InboxActivity.class);
				startActivity(intent);
			}
		});

		sentMsgsBtn = (Button) findViewById(R.id.sentMsgsBtn);
		sentMsgsBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, SentMessagesActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
