package com.example.android065;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Android065MainActivity extends Activity {

	private Button bt_iniciar;
	ImageView imgView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_android065_main);
		
		
		bt_iniciar = (Button)findViewById(R.id.bt_iniciar);
               nbt_iniciar.setOnClickListener(new OnClickListener(){
        	@Override
		public void onClick(View v) {

		    imgView = (ImageView) findViewById(R.id.iv_animacion);
		    imgView.setBackgroundResource(R.drawable.frame_animation);
	
		    imgView.post(new Runnable() {
		        @Override
		        public void run() {
		            AnimationDrawable frame = (AnimationDrawable) imgView
								.getBackground();
		            if (frame.isRunning()) {
		                frame.stop();
		            } else {
		                frame.stop();
		                frame.start();
		            }
		        }
		    });
		}
	    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.android065_main, menu);
		return true;
	}

}
