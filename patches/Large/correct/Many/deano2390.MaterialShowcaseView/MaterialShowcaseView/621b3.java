diff --git a/library/src/main/java/uk/co/deanwild/materialshowcaseview/MaterialShowcaseView.java b/library/src/main/java/uk/co/deanwild/materialshowcaseview/MaterialShowcaseView.java
index bed90b0..0c0f2c3 100644
--- a/library/src/main/java/uk/co/deanwild/materialshowcaseview/MaterialShowcaseView.java
+++ b/library/src/main/java/uk/co/deanwild/materialshowcaseview/MaterialShowcaseView.java
@@ -342,7 +342,7 @@
     }
 
     private void setTitleText(CharSequence contentText) {
-        if (mTitleTextView != null) {
+        if (mTitleTextView != null && !contextText.equals("")) {
             mContentTextView.setAlpha(0.5F);
             mTitleTextView.setText(contentText);
         }
