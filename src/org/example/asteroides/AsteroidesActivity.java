package org.example.asteroides;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AsteroidesActivity extends Activity {
	private Button btnAbout;
	private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacion);
        btnAbout = (Button) findViewById(R.id.button3);
        btnAbout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				launchAbout(v);
			}
		});
        
        btnExit = (Button) findViewById(R.id.button4);
        btnExit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.about:
			launchAbout(null);
			break;
		default:
			break;
		}
		// Don't propagate the item
		return true;
	}

	/**
     * Shows About menu
     * @param view View
     */
    public void launchAbout(View view){
    	Intent i = new Intent(this, AboutActivity.class);
    	startActivity(i);
    }
    
}
