diff --git a/app/src/main/java/io/github/hidroh/materialistic/widget/NavFloatingActionButton.java b/app/src/main/java/io/github/hidroh/materialistic/widget/NavFloatingActionButton.java
index c08964c..fa660a9 100644
--- a/app/src/main/java/io/github/hidroh/materialistic/widget/NavFloatingActionButton.java
+++ b/app/src/main/java/io/github/hidroh/materialistic/widget/NavFloatingActionButton.java
@@ -85,7 +85,7 @@
     public NavFloatingActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
         super(context, attrs, defStyleAttr);
         bindNavigationPad();
-        mVibrationEnabled = Preferences.navigationEnabled(context);
+        mVibrationEnabled = Preferences.navigationVibrationEnabled(context);
         if (!isInEditMode()) {
             mVibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
         } else {
