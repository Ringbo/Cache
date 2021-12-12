diff --git a/core/java/com/android/internal/widget/ActionBarView.java b/core/java/com/android/internal/widget/ActionBarView.java
index 83f3294..6b5ea60 100644
--- a/core/java/com/android/internal/widget/ActionBarView.java
+++ b/core/java/com/android/internal/widget/ActionBarView.java
@@ -695,7 +695,8 @@
     private void initTitle() {
         if (mTitleLayout == null) {
             LayoutInflater inflater = LayoutInflater.from(getContext());
-            mTitleLayout = (LinearLayout) inflater.inflate(R.layout.action_bar_title_item, null);
+            mTitleLayout = (LinearLayout) inflater.inflate(R.layout.action_bar_title_item,
+                    this, false);
             mTitleView = (TextView) mTitleLayout.findViewById(R.id.action_bar_title);
             mSubtitleView = (TextView) mTitleLayout.findViewById(R.id.action_bar_subtitle);
             mTitleUpView = (View) mTitleLayout.findViewById(R.id.up);
@@ -724,8 +725,7 @@
             mTitleLayout.setEnabled(titleUp);
         }
 
-        addView(mTitleLayout, new LayoutParams(LayoutParams.WRAP_CONTENT,
-                LayoutParams.MATCH_PARENT));
+        addView(mTitleLayout);
         if (mExpandedActionView != null) {
             // Don't show while in expanded mode
             mTitleLayout.setVisibility(GONE);
@@ -820,7 +820,8 @@
             boolean showTitle = mTitleLayout != null && mTitleLayout.getVisibility() != GONE &&
                     (mDisplayOptions & ActionBar.DISPLAY_SHOW_TITLE) != 0;
             if (showTitle) {
-                availableWidth = measureChildView(mTitleLayout, availableWidth, childSpecHeight, 0);
+                availableWidth = measureChildView(mTitleLayout, availableWidth,
+                        MeasureSpec.makeMeasureSpec(mContentHeight, MeasureSpec.EXACTLY), 0);
                 leftOfCenter = Math.max(0, leftOfCenter - mTitleLayout.getMeasuredWidth());
             }
 
