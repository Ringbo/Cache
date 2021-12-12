diff --git a/library/src/main/java/com/rengwuxian/materialedittext/MaterialMultiAutoCompleteTextView.java b/library/src/main/java/com/rengwuxian/materialedittext/MaterialMultiAutoCompleteTextView.java
index 9311924..06789af 100644
--- a/library/src/main/java/com/rengwuxian/materialedittext/MaterialMultiAutoCompleteTextView.java
+++ b/library/src/main/java/com/rengwuxian/materialedittext/MaterialMultiAutoCompleteTextView.java
@@ -1288,7 +1288,7 @@
     }
 
     // draw the clear button
-    if (hasFocus() && showClearButton && !TextUtils.isEmpty(getText())) {
+    if (hasFocus() && showClearButton && !TextUtils.isEmpty(getText()) && isEnabled()) {
       paint.setAlpha(255);
       int buttonLeft;
       if (isRTL()) {
@@ -1460,7 +1460,7 @@
       setSelection(0);
       return false;
     }
-    if (hasFocus() && showClearButton) {
+    if (hasFocus() && showClearButton && isEnabled()) {
       switch (event.getAction()) {
         case MotionEvent.ACTION_DOWN:
           if (insideClearButton(event)) {
