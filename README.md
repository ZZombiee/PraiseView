# PraiseView
![github](/pic/1.gif) 

###How to use?
add this to *.xml

```
    <com.example.testandroid.PraiseView
        android:id="@+id/bubble"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

add this to *.java

```
        mPraiseView = (PraiseView) findViewById(R.id.bubble);
        mPraiseView.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                mPraiseView.addBubble(1);
            }
        });
```
