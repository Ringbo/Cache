diff --git a/lib/src/main/java/razerdp/basepopup/BasePopupWindow.java b/lib/src/main/java/razerdp/basepopup/BasePopupWindow.java
index 97ffa3a..52c31bd 100644
--- a/lib/src/main/java/razerdp/basepopup/BasePopupWindow.java
+++ b/lib/src/main/java/razerdp/basepopup/BasePopupWindow.java
@@ -445,7 +445,7 @@
 
     private void preMeasurePopupView(int w, int h) {
         if (mContentView != null) {
-            boolean breakPreMeasure = mEventInterceptor != null && !mEventInterceptor.onPreMeasurePopupView(this, mContentView, w, h);
+            boolean breakPreMeasure = mEventInterceptor != null && mEventInterceptor.onPreMeasurePopupView(this, mContentView, w, h);
             if (!breakPreMeasure) {
                 int measureWidth = View.MeasureSpec.makeMeasureSpec(w, View.MeasureSpec.UNSPECIFIED);
                 int measureHeight = View.MeasureSpec.makeMeasureSpec(h, View.MeasureSpec.UNSPECIFIED);
