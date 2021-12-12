diff --git a/src/com/ichi2/anki/Reviewer.java b/src/com/ichi2/anki/Reviewer.java
index 34a0b25..e553ec7 100644
--- a/src/com/ichi2/anki/Reviewer.java
+++ b/src/com/ichi2/anki/Reviewer.java
@@ -291,7 +291,7 @@
     private WebView mCard;
     private TextView mSimpleCard;
     private WebView mNextCard;
-    private LinearLayout mCardFrame;
+    private FrameLayout mCardFrame;
     private FrameLayout mTouchLayer;
     private TextView mTextBarRed;
     private TextView mTextBarBlack;
@@ -1578,7 +1578,7 @@
 
         findViewById(R.id.top_bar).setOnClickListener(mCardStatisticsListener);
 
-        mCardFrame = (LinearLayout) findViewById(R.id.flashcard);
+        mCardFrame = (FrameLayout) findViewById(R.id.flashcard);
         mTouchLayer = (FrameLayout) findViewById(R.id.touch_layer);
         mTouchLayer.setOnTouchListener(mGestureListener);
     	if (mPrefTextSelection && mLongClickWorkaround) {
