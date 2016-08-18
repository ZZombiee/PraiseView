
package com.example.testandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    
    private PraiseView mPraiseView = null;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mPraiseView = (PraiseView) findViewById(R.id.bubble);
        mPraiseView.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                mPraiseView.addBubble(1);
            }
        });
        
    }
}
