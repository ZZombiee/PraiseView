
package com.example.testandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final PraiseView view = (PraiseView) findViewById(R.id.bubble);
        view.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                view.addBubble(1);
            }
        });
        
        
    }
}
