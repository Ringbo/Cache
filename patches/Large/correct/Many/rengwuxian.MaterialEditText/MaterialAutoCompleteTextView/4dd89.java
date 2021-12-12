diff --git a/library/src/main/java/com/rengwuxian/materialedittext/MaterialAutoCompleteTextView.java b/library/src/main/java/com/rengwuxian/materialedittext/MaterialAutoCompleteTextView.java
index 42ed696..cc31268 100644
--- a/library/src/main/java/com/rengwuxian/materialedittext/MaterialAutoCompleteTextView.java
+++ b/library/src/main/java/com/rengwuxian/materialedittext/MaterialAutoCompleteTextView.java
@@ -1291,7 +1291,7 @@
     }
 
     // draw the clear button
-    if (hasFocus() && showClearButton && !TextUtils.isEmpty(getText())) {
+    if (hasFocus() && showClearButton && !TextUtils.isEmpty(getText()) && isEnabled()) {
       paint.setAlpha(255);
       int buttonLeft;
       if (isRTL()) {
@@ -1463,7 +1463,7 @@
       setSelection(0);
       return false;
     }
-    if (hasFocus() && showClearButton) {
+    if (hasFocus() && showClearButton && isEnabled()) {
       switch (event.getAction()) {
         case MotionEvent.ACTION_DOWN:
           if (insideClearButton(event)) {
