diff --git a/actionbarsherlock/src/com/actionbarsherlock/internal/widget/IcsToast.java b/actionbarsherlock/src/com/actionbarsherlock/internal/widget/IcsToast.java
index bb49d7e..042648b 100644
--- a/actionbarsherlock/src/com/actionbarsherlock/internal/widget/IcsToast.java
+++ b/actionbarsherlock/src/com/actionbarsherlock/internal/widget/IcsToast.java
@@ -17,14 +17,17 @@
     private static final String TAG = "Toast";
 
     public static Toast makeText(Context context, CharSequence s, int duration) {
-        if(VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB) {
+        if (VERSION.SDK_INT >= VERSION_CODES.ICE_CREAM_SANDWICH) {
             return Toast.makeText(context, s, duration);
         }
         IcsToast toast = new IcsToast(context);
         toast.setDuration(duration);
         TextView view = new TextView(context);
         view.setText(s);
-        view.setTextColor(0xFFDADADA);
+        // Original AOSP using reference on @android:color/bright_foreground_dark
+        // bright_foreground_dark - reference on @android:color/background_light
+        // background_light - 0xffffffff
+        view.setTextColor(0xffffffff);
         view.setGravity(Gravity.CENTER);
         view.setBackgroundResource(R.drawable.abs__toast_frame);
         toast.setView(view);
@@ -41,7 +44,7 @@
 
     @Override
     public void setText(CharSequence s) {
-        if(VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB) {
+        if (VERSION.SDK_INT >= VERSION_CODES.ICE_CREAM_SANDWICH) {
             super.setText(s);
             return;
         }
@@ -51,7 +54,7 @@
         try {
             ((TextView) getView()).setText(s);
         } catch (ClassCastException e) {
-            Log.e(IcsToast.TAG, "This Toast was not created with IcsToast.makeText", e);
+            Log.e(TAG, "This Toast was not created with IcsToast.makeText", e);
         }
     }
 }
